import functions
import PySimpleGUI as ps
import time 

ps.theme("BrightColors")
now = ps.Text(' ',key='now')

label = ps.Text("Add a Note for TODO...")
input_box = ps.InputText(tooltip="Enter a Note...",key='todo')
add_button = ps.Button('Add')
list_box = ps.Listbox(values=functions.get_todo(),key='todos',enable_events=True,size=[50,15])
edit_button = ps.Button('Edit')
com_button = ps.Button('Complete')
exit_button = ps.Button('Exit')


window=ps.Window("Simple TODO App",layout=[[now],[label],[input_box,add_button],[list_box,edit_button,com_button],[exit_button]],font=('Helvetica',20))
#event = window.read()

while True:
    event,values = window.read(timeout=300)
    window['now'].update(value=time.strftime('%b %d, %Y %H:%M:%S'))
    # print(event)
    # print(values)
    # print(values['todos'])
    match event:
        case 'Add':
            todos = functions.get_todo()
            new_todo = values['todo']+'\n'
            todos.append(new_todo)
            functions.write_todo(todos)
            window['todos'].update(values=todos)
        case 'Edit':
            try:
                todo_edit = values['todos'][0]
                new_todo = values['todo']
                todos = functions.get_todo()
                idx = todos.index(todo_edit)
                todos[idx] = new_todo
                functions.write_todo(todos)
                window['todos'].update(values=todos)
            except IndexError:
                ps.popup("Select the Item to Edit",font=('Helvetica',15))
        case 'Complete':
            try:
                todo_complete = values['todos'][0]
                todos = functions.get_todo()
                todos.remove(todo_complete)
                functions.write_todo(todos)
                window['todos'].update(values=todos)
                window['todo'].update(value="")
            except IndexError:
                ps.popup('Select Item to Complete',font=('Helvetica',15))

        case 'todos':
            window['todo'].update(value=values['todos'][0])
        case 'Exit':
            break
        case ps.WIN_CLOSED:
            break
window.close()