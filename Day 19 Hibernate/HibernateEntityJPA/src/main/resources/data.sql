--- inserting data into course entity

insert into course(id,name,created_date,last_updated_date) values(12101,'Computer Networks',current_date(),current_date());
insert into course(id,name,created_date,last_updated_date) values(12102,'Computer Fundamentals',current_date(),current_date());
insert into course(id,name,created_date,last_updated_date) values(12103,'C Programming',current_date(),current_date());
insert into course(id,name,created_date,last_updated_date) values(12107,'Python',current_date(),current_date());
insert into course(id,name,created_date,last_updated_date) values(12110,'Java',current_date(),current_date());



--- inserting data into passport entity

insert into passport (id,number) values(20001,'P101');
insert into passport (id,number) values(20002,'P103');
insert into passport (id,number) values(20003,'P108');
insert into passport (id,number) values(20004,'P110');
--- inserting data into student entity

insert into student (id,name,passport_id) values(10001,'Maheshwaran',20001);
insert into student (id,name,passport_id) values(10002,'Avinash',20002);
insert into student (id,name,passport_id) values(10003,'Saiteja',20003);
insert into student (id,name,passport_id) values(10004,'Vijay',20004);




--- insert into review entity

insert into review (id,rating,description) values(60001,'4','Great Course');
insert into review (id,rating,description) values(60002,'5','GG Course');
insert into review (id,rating,description) values(60003,'3','Average Course');
insert into review (id,rating,description) values(60004,'2','Not Woth Course');