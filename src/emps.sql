create database spring_mybatis;
use spring_mybatis;

create table emps
(
	eid int auto_increment primary key,
	ename varchar(20),
	esal double(6,2),
	esex varchar(3)
)default charset=gbk;

insert into emps(eid,ename,esal,esex) values(1,'ĞÏÓî³¬',3000,'ÄĞ');