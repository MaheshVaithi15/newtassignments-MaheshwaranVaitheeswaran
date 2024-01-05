import cv2
import time
import glob
import os
from emailing import send_email
from threading import Thread


video = cv2.VideoCapture(0)
time.sleep(1)
first_frame = None
status_list = []
count = 1

def clean_folder():
    images = glob.glob('images/*.png')
    for i in images:
        os.remove(i)
while True:
    status = 0
    check,frame = video.read()

    grey_frame = cv2.cvtColor(frame,cv2.COLOR_BGR2GRAY)
    grey_frame_gau = cv2.GaussianBlur(grey_frame,(21,21),0)
    

    if first_frame is None:
        first_frame = grey_frame_gau
    delta_frame = cv2.absdiff(first_frame,grey_frame_gau)

    thresh_frame = cv2.threshold(delta_frame,60,255,cv2.THRESH_BINARY)[1]
    dil_frame = cv2.dilate(thresh_frame,None,iterations=2)

    contours,check = cv2.findContours(dil_frame,cv2.RETR_EXTERNAL,cv2.CHAIN_APPROX_SIMPLE)

    for c in contours:
        if cv2.contourArea(c) < 5000:
            continue
        x,y,w,h = cv2.boundingRect(c)
        rect = cv2.rectangle(frame,(x,y),(x+w,y+h),(0,255,0),3)
        if rect.any():
            status = 1
            cv2.imwrite(f"images/{count}.png",frame)
            count+=1
            all_img = glob.glob("images/*.png")
            index = int(len(all_img)/2)
            f_img = all_img[index]
           
    status_list.append(status)
    status_list = status_list[-2:]
    if status_list[0]==1 and status_list[1]==0:
        email_thread = Thread(target=send_email,args=(f_img, ))
        #send_email(f_img)
        email_thread.daemon = True
        #clean_folder()
        clean_thread = Thread(target=clean_folder)
        clean_thread.daemon = True

        email_thread.start()
        



    cv2.imshow("Video Capture",frame)
    key = cv2.waitKey(1)

    if key==ord('q'):
        break
clean_thread.start()
video.release()



