--- retrive all data from emp and dept table
select * from emp;

select * from dept;


--- assignment 1 in udemy

--- create table 
create table suppliers(supplier_id int,supplier_name varchar(30),city varchar(20),state varchar(20),total_spent numeric(10,2));

--- inserting values into the table
insert into suppliers values(100,'Shop of Epiphany','Augusta','Georgia',220500.00);
(200,'Instant Assemblers','Valdez','Alaska',37000.00),
(300,'Time Manufacturers','RedWood city','California',90500.00),
(400,'Roundhouse Inc.','New York City','New York',78150.00),
(500,'Smiths & Berries','Portland','Oregon',114600.00),
(600,'Wesson LLC','Yuma','Alaska',32000.00),
(700,'ICF Foods','Orlando','California',78700.00),
(800,'Cheffmens Inc','Toledo','Georgia',187500.00),
(900,'Samswood Drinks','Portland','Georgia',17800.00);

--- Write a query that retrieves suppliers that work in either Georgia or California.

select supplier_name from suppliers where state='Georgia' or state='California';

--- Write a query that retrieves suppliers with the characters "wo" and the character "I" or "i" in their name.

select * from suppliers where supplier_name like '%wo%' and supplier_name like '%i%';

--- Write a query that retrieves suppliers on which a minimum of 37,000 and a maximum of 80,000 was spent.

select * from suppliers where total_spent>=37000.00 and total_spent<=80000.00;

/*Write a query that returns the supplier names and the state in which they operate meeting the following conditions: 
1)belong in the state Georgia or Alaska 
2)the supplier id is 100 or greater than 600
3)the amount spent is less than 100,000 or the amount spent is 220,000*/

select * from suppliers where state='Georgia' or state='Alaska' and
supplier_id>=100 and 
total_spent>=100000.00 and total_spent<=220000.00;


-- upper str
select upper('Hello') from dual;

--- lower str

select lower('HELLO') from dual;

--- dual is Dummy container

--- sysdate
select sysdate from dual;

--- systimestamp
select systimestamp from dual;

--- addmonth  
select add_months('10/10/2023',8) from dual;
 
--- month between
select months_between('10/10/2023','10/08/2022') from dual;

--- trunc 
select trunc(systimestamp,'MONTH') from dual;

--- in emp table
select ename,hiredate,trunc(hiredate,'MONTH') from emp where trunc(hiredate,'YEAR')='01/01/1982';



--- next day
select next_day(sysdate,1) from dual;
--- last day
select last_day(sysdate) from dual;


--- min , max , sum , avg

select min(sal) as "Min_sal",max(sal) as "Max_Sal",
sum(sal) as "Sum_Sal",avg(sal) as "Avg_sal"
 from emp;
 
 
 --- groupby having
--- to get info of employee 
--- group by president and orderby sal asc
select * from emp order by sal asc;

select empno,ename,job from emp group by empno,ename,job;


--- subqueries in Oracle

select * from (select ename,sal from emp);


--- subqueries in Oracle

select job,ename,(select job from emp where ename='KING') as "Select_Name" from emp;

--- joins in oracle sql

--- to join this

select e.empno,e.ename,e.job,d.deptno from emp e,dept d 
where e.deptno=d.deptno;

--- to right join with condition

select e.empno,e.ename,e.job,d.deptno from emp e right join dept d on e.deptno=d.deptno where d.deptno=10;

--- to left join with condition

select e.empno,e.ename,e.job,d.deptno from emp e left join dept d on e.deptno=d.deptno where d.deptno=10;



--- to right outer join with condition

select e.empno,e.ename,e.job,d.deptno from emp e right outer join dept d on e.deptno=d.deptno where e.job='SALESMAN';


--- to left outer join with condition

select e.empno,e.ename,e.job,d.deptno from emp e left outer join dept d on e.deptno=d.deptno where e.job='SALESMAN';


--- to full outer join with condition

select e.empno,e.ename,e.job,d.deptno from emp e full outer join dept d on e.deptno=d.deptno where e.deptno=20;

select * from emp where not exists(select * from emp where job='PROGRAMMER');

--- natural join
select * from emp natural join dept;

--- cross join are combination of right and left join
select * from emp cross join dept;


--- case statement

select ename,job,(
case job
when 'President' then 'HighProfile'
when 'Manager' then 'Employee'
when 'Analyst' then 'Good Perception'
when 'Clerk' then 'Assisstants'
else 'No comments Simply waste' end) as "COMMENT" from emp;

