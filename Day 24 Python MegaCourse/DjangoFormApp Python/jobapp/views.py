from django.shortcuts import render
from .forms import ContactForm
from .models import Form
from django.contrib import messages
from django.core.mail import EmailMessage



# Create your views here.
def index(request):
    if request.method == 'POST':
        form = ContactForm(request.POST)
        if form.is_valid():
            first_name = form.cleaned_data['first_name']
            last_name = form.cleaned_data['last_name']
            email = form.cleaned_data['email']
            date = form.cleaned_data['date']
            occupation = form.cleaned_data['occupation']

             # to store the values in the database
            Form.objects.create(first_name=first_name,last_name=last_name,email=email,date=date,occupation=occupation)
            messages.success(request,'Form Submitted Successfully')


            message_body = f"Thanks For Contacting \n{first_name} {last_name}"

            emailmsg = EmailMessage('Job Application Submitted - ',message_body,to=[email])

            emailmsg.send()


            #print(first_name,' ',last_name)

    return render(request,'index.html')