--- Creating table with constraints

CREATE TABLE city (cityname varchar(40),pincode int PRIMARY KEY);

--- Inserting values into table

INSERT INTO city values('Chennai',600028),
('Tindivanam',604001),
('Villupuram',604101),
('Salem',632015),
('Vellore',601012);

--- Creating one more table Customer which has same pincode

CREATE TABLE customer (name varchar(100),pincode int, FOREIGN KEY(pincode) REFERENCES city(pincode));

--- Inserting into values in customer table for primary key foreign key relation

INSERT INTO customer values('Mahesh',604001),
('Pradeep',632015),
('Pravin',604101),
('Nijanthan',601012),
('MARTIN',600028);