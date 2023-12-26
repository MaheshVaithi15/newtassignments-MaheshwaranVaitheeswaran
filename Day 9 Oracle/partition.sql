--- Total Bricks in the table

select b.*,(select count(*) from bricks) total_bricks from bricks b;

--- total weight of bricks

select b.*,(select sum(weight) from bricks where shape=b.shape) total_weight_of_bricks from bricks b;

--- over partition by
select b.*,count(*) over(partition by colour) total_count_bricks from bricks b;

--- partition by max weight and sum weight 

select b.*,sum(weight) over(partition by shape) sum_by_shape,
sum(weight) over(partition by colour) sum_by_weights,
max(weight) over(partition by shape) max_by_shape,
max(weight) over(partition by colour) max_by_colour    
from bricks b;

select b.*, 
       count(*) over (
         partition by colour
         order by brick_id
       ) running_total, 
       sum ( weight ) over (
         partition by colour
         order by brick_id
       ) running_weight
from   bricks b;

--- order by windowing clause
select b.*, 
       count(*) over (
         order by weight, brick_id
         rows between unbounded preceding and current row
       ) running_total, 
       sum ( weight ) over (
         order by weight, brick_id
         rows between unbounded preceding and current row
       ) running_weight
from   bricks b
order  by weight, brick_id;


--- sliding window

select b.*, 
       count (*) over (
         order by weight
         range between 2 preceding and 1 preceding 
       ) count_weight_2_lower_than_current, 
       count (*) over (
         order by weight
         range between 1 following and 2 following
       ) count_weight_2_greater_than_current
from   bricks b
order  by weight;

--- rank , dense rank and row_number
select brick_id, weight, 
       row_number() over ( order by weight ) rn, 
       rank() over ( order by weight ) rk, 
       dense_rank() over ( order by weight ) dr
from   bricks;

--- lead and lag 
select b.*,
       lag ( shape ) over ( order by brick_id ) prev_shape,
       lead ( shape ) over ( order by brick_id ) next_shape
from   bricks b;

--- first value and last value

select b.*,
       first_value ( weight ) over ( 
         order by brick_id 
       ) first_weight_by_id,
       last_value ( weight ) over ( 
         order by brick_id 
         range between current row and unbounded following
       ) last_weight_by_id
from   bricks b;


--- exploring table creation

create table stores (store_id number not null,city varchar2(20));

---inserting values into the table

insert into stores values(1,'San Fransisco');
insert into stores values(2,'New York City');

select * from stores;

--- create table with primary key

create table testpk(t_id number not null,t_name varchar(20),constraint test_pk primary key(t_id));

--- alter table
alter table testpk modify t_name varchar(20) not null;


--- creating an table with existing table

create table emp_info as select * from emp;

--- to view the copied data
select * from emp_info;

--- merge into clause
merge into emp_info ei using emp e on(ei.empno=e.empno) when matched then
update set ei.ename=e.ename;


--- sequence creation

create sequence prod_seq 
minvalue 1
maxvalue 9999999999
start with 100
increment by 1
nocache;


--- index in oracle sql
create unique index idx_emp on emp_info(ename);

create index idx_job on emp_info(job);

--- to drop that index

drop index idx_job;

