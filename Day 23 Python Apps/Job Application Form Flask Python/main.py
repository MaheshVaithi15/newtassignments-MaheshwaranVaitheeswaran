from flask import Flask,render_template,request,flash
from flask_sqlalchemy import SQLAlchemy
from datetime import datetime
from flask_mail import Mail,Message


app = Flask(__name__)

app.config["SECRET_KEY"] = "myapplication123"
app.config["SQLALCHEMY_DATABASE_URI"] = "sqlite:///data.db"
app.config["MAIL_SERVER"] = 'smtp.gmail.com'
app.config["MAIL_PORT"] = 465
app.config["MAIL_USE_SSL"] = True
app.config["MAIL_USERNAME"]='mattmahesh007@gmail.com'
app.config["MAIL_PASSWORDS"] = "fnjsxiwmfnyfxneo"

db = SQLAlchemy(app)

# mail configuration

mail = Mail(app)


class Form(db.Model):
    id = db.Column(db.Integer,primary_key=True)
    first_name = db.Column(db.String(80))
    last_name = db.Column(db.String(80))
    email = db.Column(db.String(80))
    date = db.Column(db.Date)
    occupation = db.Column(db.String(80))



@app.route('/',methods=['GET','POST'])
def home():
    if request.method == 'POST':
        first_name = request.form['first_name']
        last_name = request.form['last_name']
        email = request.form['email']
        date = request.form['date']
        date_obj = datetime.strptime(date,"%Y-%m-%d")
        occupation = request.form['occupation']

        form = Form(first_name=first_name,last_name=last_name,email=email,date=date_obj,occupation=occupation)
        db.session.add(form)
        db.session.commit()
        content = f"""Thanks For Submitting Forms {first_name} {last_name}
                        -------- ------- -------- ------- ------- --------"""
        message = Message(subject="New Form Submission",sender=app.config["MAIL_USERNAME"],recipients=[email],body=content)
        mail.send(message)
        flash("Form Submitted Successfully....","success")
    return render_template('index.html')



if __name__ == "__main__":

    with app.app_context():
        db.create_all()

        app.run(debug=True)