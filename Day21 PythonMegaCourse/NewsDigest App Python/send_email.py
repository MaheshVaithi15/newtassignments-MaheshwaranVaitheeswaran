import smtplib as sm
import ssl

def send_email(message):
    host = 'smtp.gmail.com'
    port = 465

    username = 'mattmahesh007@gmail.com'
    password = 'guyluadficipibsj'

    reciever = 'maheshvaithi1598@gmail.com'
    message = ""

    mycontext = ssl.create_default_context()

    with sm.SMTP_SSL(host,port,context=mycontext) as server:
        server.login(username,password)
        server.sendmail(username,reciever,message)




