create database courierdb;
use courierdb;
create table parcel (
id integer not null, 
created_by integer not null, 
created_on varchar(255), 
is_from integer not null, 
is_delivered bit not null, 
is_dispatched bit not null, 
name varchar(255), 
going_to integer not null, 
primary key (id));