import streamlit as st
from functions import get_todo,write_todo

def add_todo():
    todo = st.session_state['new_todo']+"\n"
    todos.append(todo)
    write_todo(todos)


st.title("ToDo App")
st.subheader('A Web Based ToDo App')

todos=get_todo()

for index,todo in enumerate(todos):
    cb=st.checkbox(todo,key=todo)
    if cb:
        todos.pop(index)
        write_todo(todos)
        del st.session_state[todo]
        st._experimental_rerun()



st.text_input(label="",placeholder="Enter your ToDo Here....",on_change=add_todo,key='new_todo')



