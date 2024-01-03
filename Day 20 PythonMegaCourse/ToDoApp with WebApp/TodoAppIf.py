from functions import get_todo,write_todo
import time

#to add date feature

now = time.strftime("%b %d, %Y %H:%M:%S")
print(now)

while True:
    option = input("Todo App - Add , Show , and Others: ").strip()
        
    if option.startswith('add'):
        
        user_input = option[4:]+'\n'
               

      
        todos = get_todo()

        todos.append(user_input)

        write_todo(todos)

   
              
            
    elif option.startswith('show'):
               
       
        todos = get_todo()

        for index,item in enumerate(todos):
            item=item.strip('\n')
            row=f"{index+1} - {item.title()}"
            print(row)

    elif option.startswith('edit'):
        
        try:
            no = int(option[5:])
            no = no-1
         
            todos = get_todo()
                    
            newtodo = input('Enter new TODO: ')
            todos[no]=newtodo+'\n'

            write_todo(todos)

         
            
        except ValueError:
            print('Enter Valid Command')
            continue

    elif option.startswith('complete'):
        #cno = int(input('Enter a number TODO to complete: '))
        try:
            cno = int(option[9:])
            idx = cno-1
            # with open('todosif.txt','r') as file:
            #     todos = file.readlines()
            todos = get_todo()
                    
            to_remove = todos[idx].strip('\n')
            todos.pop(idx)

            write_todo(todos)
            # with open('todosif.txt','w') as file:
            #     todos = file.writelines(todos)
                    
            msg_remove = f"{to_remove} is Completed"
            print(msg_remove)
        except IndexError:
            print("No Items in the Todo")
            continue

                    
    elif option.startswith('exit'):
        break
            
    else:
        print('Please Enter Correct Command')

    
