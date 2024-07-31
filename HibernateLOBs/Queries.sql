create table Employees(
id int primary key,
name varchar(40),
salary int,
department_id int,
location_id int,hire_date date,
foreign key(department_id) references Departments(id),
foreign key(location_id) references Locations(id)
);
create table Departments(
id int primary key,
name varchar(40)
);
create table Locations(
id int primary key,
city varchar(40)
);	
select * from Locations;
insert into Locations values (1,'pune');
insert into Locations values (2,'mumbai');

select * from Departments;
insert into Departments values (1,'marketing');
insert into Departments values (2,'development');
insert into Departments values (3,'Support');

select * from employees;
insert into employees values (1,'alice',25000,1,1,'2022-01-15');
insert into employees values(2,'bob',22000,1,2,'2022-02-20');
insert into employees values(3,'charlie',28000,2,1,'2022-03-10');
insert into employees values(4,'david',20000,2,2,'2022-04-05');
insert into employees values(5,'eve',30000,1,1,'2023-01-07');

select name,salary from employees
where department_id=(select id from departments where name like 'marketing');

select employees.name,departments.name from employees,departments
where employees.department_id=departments.id and
salary>(select avg(salary) from employees);

select name from employees 
where salary=(select min(salary) from employees) and
department_id=(select id from departments where name like 'test');

select name from employees 
where salary< (select max(salary) from employees 
having  department_id=(select id from departments where name='marketing'));

select sum(salary) from employees;

select avg(salary) from employees where
department_id=(select id from departments where name='development');
   
select sum(salary) from employees where
department_id in (select id from departments where name in('development','support'));

select name from employees
where salary>(select avg(salary) from employees where
department_id=(select id from departments where name='development'));

select sum(salary) from employees where
location_id=(select id from locations where city='pune');

select employees.name,departments.name from employees,departments
where employees.department_id=departments.id and year(hire_date)=2023;

select count(*) from employees
where location_id=(select id from locations where city='pune');
