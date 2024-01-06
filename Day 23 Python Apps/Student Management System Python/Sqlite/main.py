from PyQt6.QtCore import Qt
from PyQt6.QtWidgets import QGridLayout,QApplication,QVBoxLayout,QLabel,QWidget,QStatusBar,QLineEdit,QPushButton,QMainWindow,QTableWidget,QTableWidgetItem,QDialog,QComboBox,QToolBar,QMessageBox
from PyQt6.QtGui import QAction,QIcon
import sys
import sqlite3
import mysql.connector

class DatabaseConnection:
    def __init__(self,host='localhost',user='mahesh',password='Mahesh@3035',database='school'):
        self.host = host
        self.user = user
        self.password = password
        self.database = database
    def connect(self):
        connection = mysql.connector.connect(host=self.host,user=self.user,password=self.password,database=self.database)
        return connection



class MainWindow(QMainWindow):
    def __init__(self):
        super().__init__()
        #window title
        self.setWindowTitle("Student Management System Using SQLite")
        self.setMinimumSize(800,800)

        # adding file and help with sub menu
        file_menu = self.menuBar().addMenu('&File')
        help_menu = self.menuBar().addMenu('&Help')
        edit_menu = self.menuBar().addMenu('&Edit')

        add_student_action = QAction(QIcon('icons/add.png'),'Add Student',self)
        add_student_action.triggered.connect(self.insert)
        file_menu.addAction(add_student_action)

        # adding submenu in file and help
        about_action = QAction('About',self)
        help_menu.addAction(about_action)
        about_action.triggered.connect(self.about)
        #about_action.setMenuRole(QAction.MenuRole.NoRole)

        search_action = QAction(QIcon('icons/search.png'),'Search',self)
        edit_menu.addAction(search_action)
        search_action.triggered.connect(self.search)


        #Creating table function
        self.table = QTableWidget()
        self.table.setColumnCount(4)
        self.table.setHorizontalHeaderLabels(("ID","NAME","COURSE","MOBILE"))
        self.setCentralWidget(self.table)

        # to create toolbar class
        toolbar = QToolBar()
        toolbar.setMovable(True)
        self.addToolBar(toolbar)
        toolbar.addAction(add_student_action)
        toolbar.addAction(search_action)

        # create status bar

        self.status_bar = QStatusBar()
        self.setStatusBar(self.status_bar)

        # to get the info that particular record into edit or delete format
        self.table.cellClicked.connect(self.cell_clicked)

    def cell_clicked(self):
        edit_button = QPushButton('Edit Record')
        edit_button.clicked.connect(self.edit)
        

        delete_button = QPushButton('Delete Record')
        delete_button.clicked.connect(self.delete)

        children = self.findChildren(QPushButton)

        if children:
            for child in children:
                self.status_bar.removeWidget(child)

        self.status_bar.addWidget(edit_button)
        self.status_bar.addWidget(delete_button)
    


    # seperate function to load data in the qt widget table
        
    def load_data(self):
        #connection = sqlite3.connect('database.db')
        connection = DatabaseConnection().connect()
        cursor = connection.cursor()
        cursor.execute('select * from students')
        res = cursor.fetchall()
        self.table.setRowCount(0)
        for row_no,row_data in enumerate(res):
            self.table.insertRow(row_no)
            for col_no,col_data in enumerate(row_data):
                self.table.setItem(row_no,col_no,QTableWidgetItem(str(col_data)))
        connection.close()

        #print(list(res))
    
    def insert(self):
        dialog = InsertDialog()
        dialog.exec()

    def search(self):
        dialog = SearchDialog()
        dialog.exec()
    
    def edit(self):
        dialog = EditDialog()
        dialog.exec()

    def delete(self):
        dialog = DeleteDialog()
        dialog.exec()

    def about(self):
        dialog = AboutDialog()
        dialog.exec()

class AboutDialog(QMessageBox):
    def __init__(self):
        super().__init__()
        self.setWindowTitle('About This App')
        content = """ This App is for storing Student records Using SqLite3
        and UI's are Created with the PyQt6 """
        self.setText(content)

   


class InsertDialog(QDialog):
    def __init__(self):
        super().__init__()
        self.setWindowTitle('Insert Student Data')
        self.setFixedWidth(400)
        self.setFixedHeight(400)
        
        # to set layout for the insert dialog

        layout = QVBoxLayout()

        # add student name
        self.student_name = QLineEdit()
        self.student_name.setPlaceholderText("Name")
        layout.addWidget(self.student_name)

        # add course name with dropdown
        self.course_name = QComboBox()
        self.course_name.setPlaceholderText("Course")
        courses = ['Maths','Physics','Astronomy','Biology']
        self.course_name.addItems(courses)
        layout.addWidget(self.course_name)

        # add phone number

        self.phone_no = QLineEdit()
        self.phone_no.setPlaceholderText("Mobile No")
        layout.addWidget(self.phone_no)

        # button to perform the insertion

        button = QPushButton("Register")
        button.clicked.connect(self.add_student)
        layout.addWidget(button)

        self.setLayout(layout)

    def add_student(self):

        name = self.student_name.text()
        course = self.course_name.itemText(self.course_name.currentIndex())
        mobile = self.phone_no.text()
        #connection = sqlite3.connect('database.db')
        connection = DatabaseConnection().connect()

        cursor = connection.cursor()

        cursor.execute('INSERT INTO students(name,course,mobile) VALUES(%s,%s,%s)',(name,course,mobile))

        connection.commit()
        cursor.close()
        connection.close()
        mw.load_data()

class SearchDialog(QDialog):
    def __init__(self):
        super().__init__()
        # Set window title and size
        self.setWindowTitle("Search Student")
        self.setFixedWidth(300)
        self.setFixedHeight(300)

        # Create layout and input widget
        layout = QVBoxLayout()
        self.student_name = QLineEdit()
        self.student_name.setPlaceholderText("Name")
        layout.addWidget(self.student_name)

        # Create button
        button = QPushButton("Search")
        button.clicked.connect(self.search)
        layout.addWidget(button)

        self.setLayout(layout)

    def search(self):
        name = self.student_name.text()
        #connection = sqlite3.connect("database.db")
        connection = DatabaseConnection().connect()
        cursor = connection.cursor()
        cursor.execute("SELECT * FROM students WHERE name = %s", (name,))
        result= cursor.fetchall()
        row = list(result)[0]
        print(row)
        items = mw.table.findItems("John Smith", Qt.MatchFlag.MatchFixedString)
        for item in items:
            print(item)
            mw.table.item(item.row(), 1).setSelected(True)

        cursor.close()
        connection.close()

class EditDialog(QDialog):
    def __init__(self):
        super().__init__()
        self.setWindowTitle('Update Student Data')
        self.setFixedWidth(400)
        self.setFixedHeight(400)
        
     # to set layout for the insert dialog

        layout = QVBoxLayout()

            # to set the record to edit
        index = mw.table.currentRow()

        sname = mw.table.item(index,1).text()

        scourse = mw.table.item(index,2).text()

        sphoneno = mw.table.item(index,3).text()

        self.sid = mw.table.item(index,0).text()

        # add student name
        self.student_name = QLineEdit(sname)
        self.student_name.setPlaceholderText("Name")
        layout.addWidget(self.student_name)

        # add course name with dropdown
        self.course_name = QComboBox()
        self.course_name.setPlaceholderText("Course")
        courses = ['Maths','Physics','Astronomy','Biology']
        self.course_name.addItems(courses)
        self.course_name.setCurrentText(scourse)
        layout.addWidget(self.course_name)

        # add phone number

        self.phone_no = QLineEdit(sphoneno)
        self.phone_no.setPlaceholderText("Mobile No")
        layout.addWidget(self.phone_no)

        # button to perform the insertion

        button = QPushButton("Done")
        button.clicked.connect(self.update)
        layout.addWidget(button)

        self.setLayout(layout)


    def update(self):
        #connection = sqlite3.connect('database.db')
        connection = DatabaseConnection().connect()
        cursor = connection.cursor()
        cursor.execute('UPDATE students SET name=%s,course=%s,mobile=%s where id=%s',(
            self.student_name.text(),self.course_name.itemText(self.course_name.currentIndex()),
            self.phone_no.text(),self.sid
        ))
        #cursor.fetchall()

        connection.commit()
        cursor.close()
        connection.close()
        # to refresh the updated data
        mw.load_data()

class DeleteDialog(QDialog):
    def __init__(self):
        super().__init__()
        self.setWindowTitle('Delete Student Data')
        self.setFixedWidth(300)
        self.setFixedHeight(150)

        layout = QGridLayout()
        conform = QLabel('Do you Want to Delete This Record ?')
        yes = QPushButton('Yes')
        no = QPushButton('No')

        layout.addWidget(conform,0,0,1,2)
        layout.addWidget(yes,1,0)
        layout.addWidget(no,1,1)

        self.setLayout(layout)
        yes.clicked.connect(self.delete_student)
        #no.clicked.connect()



    def delete_student(self):
        index = mw.table.currentRow()
        sid = mw.table.item(index,0).text()
        #connection = sqlite3.connect('database.db')
        connection = DatabaseConnection().connect()
        cursor = connection.cursor()
        cursor.execute('DELETE FROM students WHERE id=%s',(sid,))
        #cursor.fetchall()

        connection.commit()
        cursor.close()
        connection.close()
        # to refresh the updated data
        mw.load_data()

        self.close()

        conform = QMessageBox()
        conform.setWindowTitle('Success')
        conform.setText('Record Deleted Sucessfully')
        conform.exec()




# calling GUI Functions outside the class
        
app = QApplication(sys.argv)
mw = MainWindow()
mw.show()
mw.load_data()
sys.exit(app.exec())
