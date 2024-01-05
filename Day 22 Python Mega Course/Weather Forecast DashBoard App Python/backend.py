import requests


APIKey = "ce500786fd751bd62b6af3cde63b72ab"
def get_data(place,forecast_days):
    url = f"http://api.openweathermap.org/data/2.5/forecast?q={place}&appid={APIKey}"
    response = requests.get(url)
    content = response.json()
    filtered_data = content['list']
    val = 8*forecast_days
    filtered_data= filtered_data[:val]
    return filtered_data



if __name__ == "__main__":
    print(get_data(place='tindivanam',forecast_days=2,kind='Sky'))
