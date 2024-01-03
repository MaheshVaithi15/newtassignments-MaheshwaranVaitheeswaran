FILEPATH = "storetodo.txt"
def get_todo(filepath=FILEPATH):
    with open(filepath,'r') as fileloc:
        todosloc = fileloc.readlines()
    return todosloc

def write_todo(todos_write,filepath=FILEPATH):
    with open(filepath,'w') as filewrite:
        filewrite.writelines(todos_write)
