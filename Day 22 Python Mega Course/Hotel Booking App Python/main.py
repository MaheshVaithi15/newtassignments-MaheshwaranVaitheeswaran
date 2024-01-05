import pandas as pd

df = pd.read_csv('hotels.csv',dtype={"id":str})
df_cards = pd.read_csv('cards.csv',dtype=str).to_dict(orient='records')
df_cards_security = pd.read_csv('card_security.csv',dtype=str)
# class User:
#     def view(self):
#         pass

class Hotel:
    def __init__(self,hotel_id):
        self.hotel_id = hotel_id
        self.name = df.loc[df['id'] == self.hotel_id,'name'].squeeze()


    def book(self):
        # to book the hotel based on its avalibility

        df.loc[df['id'] == self.hotel_id,'available'] == 'no'
        df.to_csv('hotels.csv',index=False)




    def available(self):
        #To check the hotel availability

        availability = df.loc[df['id'] == self.hotel_id,'available'].squeeze()
        if availability == 'yes':
            return True
        else:
            return False
       

class ReservationTicket:
    def __init__(self,c_name,hotel_obj):
        self.c_name = c_name
        self.hotel = hotel_obj


    def generate(self):

        content = f"""
        
                    Thanks For Booking

            ---- ---- ---- ---- ---- ---- ---- ----
        
                Your Booking Info as Follows
                ---- ------- ---- -- -------

                Name: {self.c_name}

                Hotel Name: {self.hotel.name}
                
                ---- ---- ---- ---- ---- ----
                """

        return content


class CreditCard:
    def __init__(self,number):
        self.number = number


    def validate(self,expiration,holder,cvc):
        card_data = {'number':self.number,'expiration':expiration,'holder':holder,'cvc':cvc}

        if card_data in df_cards:
            return True
        else:
            return False
    
class SecureCreditCard(CreditCard):

    def authenticate(self,given_password):
        passwords = df_cards_security.loc[df_cards_security['number']==self.number,'password'].squeeze()

        if passwords == given_password:
            return True
        else:
            return False







       

# class and method calling are follows

print(df)

hotel_id = input('Enter Hotel Id: ')

hotel = Hotel(hotel_id)

if hotel.available():
    credit_card = SecureCreditCard(number='1234567890123456')
    if credit_card.validate(expiration='12/26',holder='JOHN SMITH',cvc='123'):
        passw = input('Enter Credit Card Password: ') #mypass
        if credit_card.authenticate(given_password=passw):
            hotel.book()
            name = input('Enter Your Name to Book: ')
            reservation_ticket = ReservationTicket(c_name=name,hotel_obj=hotel)
            print(reservation_ticket.generate())
        else:
            print("Invalid Card Info")
    else:
        print('There was Payment in Your Problem')
else:
    print("Selected Hotel Unavailable")
