
import smtplib
import imghdr
from email.message import EmailMessage

u = 'mattmahesh007@gmail.com'
r = 'mattmahesh007@gmail.com'
p = 'vcpcestajjlswipg'

def send_email(imgpath):
    email_message = EmailMessage()
    email_message["Subject"] = "New Entry"
    email_message.set_content("New Person Entered")

    with open(imgpath,'rb') as img:
        content = img.read()
    email_message.add_attachment(content,maintype='image',subtype=imghdr.what(None,content))

    gmail = smtplib.SMTP('smtp.gmail.com',587)
    gmail.ehlo()
    gmail.starttls()
    gmail.login(u,p)
    gmail.sendmail(u,r,email_message.as_string())
    gmail.quit()

if __name__ == "__main__":
    send_email()

    
   


