import tweepy
from tweepy import OAuthHandler,Stream
from tweepy.streaming import StreamListener
import socket
import json


customer_key = 'uZQSOtpg155Z1f0ACJmVukMrS'
customer_seceret = 'D8gN6jBIIYi6KHFy0OIIfsWc7S1jn3T6Bi3kZPcSipeXiPQBic'

access_token = '1743686587635187712-sZmUFqDGN04GOWGQZBgZbN4gwjokmz'
access_seceret = 'vYNwnXStLIyWthIIr3AqGPmQW8HyII3dQEwwsZDzcj2er'

class TweetListener(StreamListener):
    def __init__(self,csocket):
        self.client_socket = csocket

    def on_data(self,data):

        try:
            msg = json.loads(data)
            print(msg['text'].encode('utf-8'))
            self.client_socket.send(msg['text'].encode('utf-8'))
            
        except BaseException as e:
            print('Error',e)
        return True

    def on_error(self,status):
        print(status)
        return True

def sendData(c_socket):
    auth = OAuthHandler(customer_key,customer_seceret)
    auth.set_access_token(access_token,access_seceret)

    twitter_stream = Stream(auth,TweetListener(c_socket))
    twitter_stream.filter(track=['guitar'])

if __name__ == '__main__':
    s = socket.socket()
    host = '127.0.0.1'
    port = 9999
    s.bind((host,port))
    print('listening on port 9999')

    s.listen(5)
    c,addr = s.accept()
    sendData(c)
    
    
    
    

    
    
            

        
        


