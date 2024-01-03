#todos = []

while True:


    option = input("Todo App - Add , Show , and Others: ").strip()

    match option:
        case 'add':
            user_input=input("Enter a TODO: ")+'\n'
            # file = open('todos.txt','r')
            # todos = file.readlines()
            # file.close()

            with open('todos.txt','r') as file:
                todos = file.readlines()

            todos.append(user_input)

            with open('todos.txt','w') as file:
                file.writelines(todos)
            # file = open('todos.txt','w')
            # file.writelines(todos)
            # file.close()

           
        case 'show':
            # to read the file
            # file = open('todos.txt','r')
            # todos = file.readlines()
            # file.close()
            with open('todos.txt','r') as file:
                todos = file.readlines()

            for index,item in enumerate(todos):
                item=item.strip('\n')
                row=f"{index+1} - {item.title()}"
                print(row)
        case 'edit':
            no = int(input('Enter the no of Todo to edit: '))
            no = no-1
            with open('todos.txt','r') as file:
                todos = file.readlines()
            
            newtodo = input('Enter new TODO: ')
            todos[no]=newtodo+'\n'

            with open('todos.txt','w') as file:
                todos = file.writelines(todos)

        case 'complete':
            cno = int(input('Enter a number TODO to complete: '))
            idx = cno-1
            with open('todos.txt','r') as file:
                todos = file.readlines()
            
            to_remove = todos[idx].strip('\n')
            todos.pop(idx)


            with open('todos.txt','w') as file:
                todos = file.writelines(todos)
            
            msg_remove = f"{to_remove} is Completed"
            print(msg_remove)

                
        case 'exit':
            break
        
        case whatever:
            print('Please Enter Correct Command')

    
