
--- to create a table
create table person(id integer not null,
name varchar(200) not null,
location varchar(200),
birthdate timestamp,
primary key(id)
);

--- to insert values

insert into person (id,name,location,birthdate) values(1001,'Mahesh','Tindivanam',current_date());

insert into person (id,name,location,birthdate) values(1002,'Avinash','Chennai',current_date());