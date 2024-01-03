import zipfile
import pathlib

def make_archive(filepath,dest_dir):
    dest_path = pathlib.Path(dest_dir,"compressed.zip")
    with zipfile.ZipFile(dest_path,'w') as archive:
        for f in filepath:
            archive.write(f)

if __name__=="__main__":
    make_archive(filepath=['todoif.txt','todos.txt'],dest_dir="Dest")

