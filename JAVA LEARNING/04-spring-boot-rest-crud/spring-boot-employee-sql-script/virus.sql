CREATE DATABASE IF NOT EXISTS employee_directory; 
use employee_directory; 


Drop Table if exists employee; 

Create table employee ( 
     id int not null auto_increment, 
     first_name varchar(45) default null, 
     last_name varchar(45) default null, 
     email varchar(45) default null, 
     primary key (id)
) engine=InnoDB auto_increment=1 default charset=latin1; 


insert into employee values 
(1, 'virus', 'thakur', 'v@114.com'), 
(2, 'sonu', 'kumar', 's@115.com'), 
(3, 'kartik', 'patidar', 'k@234.com'), 
(4, 'prabhu', 'singh', 'p@132.com'), 
(5, 'naren', 'verma', 'n@34.com'); 

