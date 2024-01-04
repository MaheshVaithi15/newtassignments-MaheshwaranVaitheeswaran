import streamlit as st
from send_email import send_email
st.header("Contact Me")

with st.form(key='forms'):
    name = st.text_input('Your Name')
    email = st.text_input('Your Email')
    rmessage = st.text_area('Your Message . . . ')
    
    message = f"""\ 
    Subject: Mail from {name}

    From: {email} 
    {rmessage}"""
    button=st.form_submit_button('Submit')

    if button:
        send_email(message,email)
        st.info('Email Sent SuccessFully')
