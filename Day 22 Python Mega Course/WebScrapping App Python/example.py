#practice SQL on Python
import sqlite3

connection = sqlite3.connect('data')

cursor = connection.cursor()




# to insert into table

new_rows = [('Cats','Cat city','2020.10.12'),('Dog','Dog City','2321.09.10')]

cursor.executemany('INSERT INTO events VALUES(?,?,?)',new_rows)

cursor.execute('SELECT * FROM events')

rows = cursor.fetchall()

print(rows)
connection.commit()
