from PyQt6.QtWidgets import QMainWindow,QTextEdit,QLineEdit,QPushButton,QApplication
import sys
from backend import ChatBot
import threading

class ChatbotWindow(QMainWindow):
    def __init__(self):
        super().__init__()
        self.chatbot = ChatBot()
        self.setWindowTitle('ChatBot (ChatGPT)')
        self.setMinimumSize(700,500)

        #input text area
        self.chat_area = QTextEdit(self)
        self.chat_area.setGeometry(20,10,500,380)
        self.chat_area.setReadOnly(True)

        # answer area
        self.inpt = QLineEdit(self)
        self.inpt.setGeometry(20,400,500,45)

        # for submit button
        self.button = QPushButton('Send',self)
        self.button.setGeometry(540,400,100,45)

        self.button.clicked.connect(self.send_message)
        self.show()



    def send_message(self):
        user_input = self.inpt.text().strip()

        self.chat_area.append(f"<p style='color:#333333'>Me:{user_input}</p>")
        self.inpt.clear()

        thread = threading.Thread(target=self.get_bot_response,args=(user_input,))
        thread.start()
    
    def get_bot_response(self,user_input):
        response = self.chatbot.get_response(user_input)

        self.chat_area.append(f"<p style='color:#333333 background-color:#E9E9E9'>Bot: {response}</p>")


app = QApplication(sys.argv)
mw = ChatbotWindow()
sys.exit(app.exec())