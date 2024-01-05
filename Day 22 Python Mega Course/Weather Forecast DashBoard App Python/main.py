import streamlit as st 
import plotly.express as px
from backend import get_data

st.title('Weather Forecast for Days')

place = st.text_input('Enter Place ')
days = st.slider('Forecast Days ',min_value=1,max_value=5,help='Select The Number of Days')

option = st.selectbox('Select Data To View',('Temperature','Sky'))

st.subheader(f"{option} for {days} Days in Place: {place}")


if place:
    try:
        filtered_data= get_data(place,days)


        if option == 'Temperature':
            temperatures = [dict['main']['temp']/10 for dict in filtered_data]
            dates = [dict['dt_txt'] for dict in filtered_data]
            figure = px.line(x=dates,y=temperatures,labels={'x':'Dates','y':'Temperatures'})
            st.plotly_chart(figure)
        if option == 'Sky':
            images = {'Clear':'images/clear.png','Clouds':'images/cloud.png','Rain':'images/rain.png','Snow':'images/snow.png'}
            sky_condition = [dict['weather'][0]['main'] for dict in filtered_data]
            
            image_paths = [images[condition] for condition in sky_condition]
            st.image(image_paths,width=100)
    except KeyError:
        st.info("Place DoesNot Exists... please Enter the correct place")

    








