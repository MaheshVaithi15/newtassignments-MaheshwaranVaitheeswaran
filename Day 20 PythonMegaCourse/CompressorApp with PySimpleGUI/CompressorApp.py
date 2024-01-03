import PySimpleGUI as ps 
from zipcreate import make_archive

label1 = ps.Text("File 1 Directory")
input1 = ps.Input()
button1 = ps.FolderBrowse("Choose",key='folder')

label2 = ps.Text("File 2 Directory")
input2 = ps.Input()
button2 = ps.FileBrowse("Choose",key='file')

compress_button = ps.Button('Compress')

window = ps.Window("File Compressor",layout=[[label1,input1,button1],[label2,input2,button2],[compress_button]])

while True:
    event,values = window.read()
    print(event,values)
    filepath = values['files'].split(';')
    folder = values['folder']
    make_archive(filepath,folder)


window.close()

