import streamlit as st
import pandas as pd

st.set_page_config(layout="wide")

col1,col2 = st.columns(2)

with col1:
    st.image("images/photo1.jpg")


with col2:
    st.title("Maheshwaran Vaitheeswaran")
    content = """ An MCA Graduate Interested to work in Technical Role. Eager to learn and Adapt to the Technology and implement my Learnings into the projects. Having Academic Level Knowledge in Technologies and Basic HandsOn 
    Experience in FrontEnd Frameworks like ReactJs, Java Technologies like Spring and SpringBoot and Python Web FrameWorks like Flask , Streamlit and Django. Looking For an Opportunity to work in an Organization ."""

    st.info(content)

content2 = """The Python MegaCourse Apps are Below..."""
st.write(content2)

df = pd.read_csv("data.csv",sep=";")

col3,empcol,col4 = st.columns([1.5,0.5,1.5])

with col3:
    for index , row in df[:10].iterrows():
        st.subheader(row['title'])
        st.write(row['description'])
        st.image('images/'+row['image'])
        st.write("[Source Code](https://github.com/MaheshVaithi15/newtassignments-MaheshwaranVaitheeswaran.git)")

with col4:
    for index , row in df[10:].iterrows():
        st.subheader(row['title'])
        st.write(row['description'])
        st.image('images/'+row['image'])
        st.write("[Source Code](https://github.com/MaheshVaithi15/newtassignments-MaheshwaranVaitheeswaran.git)")





