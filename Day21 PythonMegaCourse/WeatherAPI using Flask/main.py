from flask import Flask,render_template
import pandas as pd

app = Flask(__name__)

stations = pd.read_csv("dataset/stations.txt",skiprows=17)
stations = stations[["STAID","STANAME                                 "]]

@app.route('/')
def home():
    return render_template("home.html",data=stations.to_html())

@app.route('/api/v1/<station>/<date>')
def data(station,date):
    fname = "dataset/TG_STAID"+str(station).zfill(6)+".txt"
    df = pd.read_csv(fname,skiprows=20,parse_dates=['    DATE'])
    temperature = df.loc[df['    DATE']==date]['   TG'].squeeze()/10
    return {"station":station,"date":date,"temperature":temperature}

@app.route("/api/v1/<station>")
def all_station(station):
    fname = "dataset/TG_STAID"+str(station).zfill(6)+".txt"
    df = pd.read_csv(fname,skiprows=20,parse_dates=['    DATE'])
    res = df.to_dict(orient='records')
    return res

@app.route("/api/v1/<station>/<year>")
def yearly(station,year):
    fname = "dataset/TG_STAID"+str(station).zfill(6)+".txt"
    df = pd.read_csv(fname,skiprows=20)
    df['    DATE'] = df['    DATE'].astype(str)
    res = df[df['    DATE'].str.startswith(str(year))].to_dict(orient='records')
    return res




if __name__ == "__main__":

    app.run(debug=True)