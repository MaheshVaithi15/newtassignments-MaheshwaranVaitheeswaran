import requests
import selectorlib
import time
import sqlite3
from send_email import send_email

url = "https://programmer100.pythonanywhere.com/tours/"
h = HEADERS = {
    'User-Agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.95 Safari/537.36'}

connection = sqlite3.connect('data')


def web_scrap(url):
    res = requests.get(url,headers=h)
    source = res.text
    return source

def extract_web(source):
    extractor = selectorlib.Extractor.from_yaml_file('extract.yaml')
    val = extractor.extract(source)['tours']
    return val

# def send_email():
#     print("Mail Sent")


def store_data(e):
    # with open('datan.txt','a') as store:
    #     store.write(e+'\n')

    cursor = connection.cursor()

    row = e.split(",")

    row = [item.strip() for item in row]

    cursor.execute('INSERT INTO events VALUES(?,?,?)',row)
    connection.commit()

def read_data(e):
    # with open('datan.txt','r') as file:
    #     file.read()

    

    row = e.split(",")

    row = [item.strip() for item in row]

    band,city,date = row
    cursor = connection.cursor()

    cursor.execute('SELECT * FROM events WHERE band=? AND city=? AND date=?',(band,city,date))

    rows = cursor.fetchall()
    print(rows)

    return rows 




if __name__ == "__main__":
    while True:
        scraped = web_scrap(url)
        e=extract_web(scraped)
        
        
        print(e)

        if e != "No upcoming tours":
            row = read_data(e)
            if not row:
                store_data(e)
                send_email(message=e)
        time.sleep(2)
