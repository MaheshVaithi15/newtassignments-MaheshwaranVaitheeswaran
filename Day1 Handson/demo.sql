--- Creating Table Student

CREATE TABLE student(id int4,name varchar(100),city varchar(50));

--- Inserting values into Table
BEGIN;
INSERT INTO student values (101,'mahesh','tindivanam'),
(102,'jai','chennai'),
(104,'pradeep','salem'),
(107,'nijanthan','vellore'),
(112,'pravin','madurai');
COMMIT;

--- Alter table by modify the values

UPDATE student SET city='hyderabad' WHERE name='pravin';