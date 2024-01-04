import requests
from send_email import send_email
#url = "https://tamil.news18.com/"

#getting url and api key
api_key='afd1d748513b4bb6bfd47a6c432ee4f2'

url="https://newsapi.org/v2/top-headlines?"\
    "sources=techcrunch&"\
        "apiKey=afd1d748513b4bb6bfd47a6c432ee4f2&"\
        "language=en"

#making request to get url

request = requests.get(url)

content = request.json()

#accessing article title

body=""

for article in content['articles']:
    if article['title'] is not None:
        body = "Subject: Today's News... "\
        +"\n"+body+article['title']+'\n'\
        +article['description']\
        +'\n'+"Article URL: "+article['url']+2*'\n'

body = body.encode('utf-8')
send_email(body)

