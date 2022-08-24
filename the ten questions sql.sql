create table table1(id integer, value integer);
insert into table1 values(1, -56);
insert into table1 values(2, 76);
insert into table1 values(3, -84);
insert into table1 values(4, 96);
insert into table1 values(5, -47);


update "table1" set "value"="value"*-1;



create table divisiontable(Divisionid integer, theyear integer,revenue integer);
insert into divisiontable values(1, 2018,60);
insert into divisiontable values(1, 2021,40);
insert into divisiontable values(1, 2020,70);
insert into divisiontable values(2, 2021,-10);
insert into divisiontable values(3, 2018,20);
insert into divisiontable values(3, 2016, 40);
insert into divisiontable values(4, 2021, 50);

select * from divisiontable  where theyear= 2021 AND revenue > 0  ;


select * from table1 ;


create table table1(id integer, year integer);
insert into table1 values(1, -56);
insert into table1 values(2, 76);
insert into table1 values(3, -84);
insert into table1 values(4, 96);
insert into table1 values(5, -47);



create table centurytable(id integer, theyear integer);
insert into centurytable values(1, 1776);
insert into centurytable values(2, 2001);
insert into centurytable values(3, 1643);
insert into centurytable values(4, 1865);
insert into centurytable values(5, 1969);

select from centurytable ;
select * from centurytable  where theyear = 100 ;
select * concat from centurytable where 

select (theyear/100)+1  from centurytable ;


create table datatable(id integer, value integer);
insert into datatable values(1, 4);
insert into datatable values(2, 11);
insert into datatable values(3, 57);
insert into datatable values(4, 24);
insert into datatable values(5, 47);





select value, case WHEN (value%2=0) THEN 'Even'	ELSE 'Odd'END AS EvenOrOdd from datatable;



create table nameAgeTable(id integer, Names varchar, Age integer);
insert into nameAgeTable values(1, 'Bob',21);
insert into nameAgeTable values(2,'Sam', 19);
insert into nameAgeTable values(3,'Jil',18 );
insert into nameAgeTable values(4, 'Jim',21);
insert into nameAgeTable values(5,'Sally', 19);
insert into nameAgeTable values(6, 'Jess',20);
insert into nameAgeTable values(7, 'Will',21);

select * from nameAgeTable;

select value, case WHEN (value%2=0) THEN 'Even'	ELSE 'Odd'END AS EvenOrOdd from datatable;



create table nameAgeTable(id integer, Names varchar(50), Ages integer);
insert into nameAgeTable values(1, 'Bob',21);
insert into nameAgeTable values(2,'Sam', 19);
insert into nameAgeTable values(3,'Jil',18 );
insert into nameAgeTable values(4, 'Jim',21);
insert into nameAgeTable values(5,'Sally', 19);
insert into nameAgeTable values(6, 'Jess',20);
insert into nameAgeTable values(7, 'Will',21);

select  Ages,count(Ages) from nameAgeTable group by Ages order by Ages;

drop table  nameAgeTable;

create table greeting(id integer, Names varchar(50));
insert into greeting values(1, 'Bob');
insert into greeting values(2,'Sam');
insert into greeting values(3,'Jil');
insert into greeting values(4, 'Jim');
insert into greeting values(5,'Sally');
insert into greeting values(6, 'Jess');
insert into greeting values(7, 'Will');



select concat('hi how are you doing good morning ', names, '!') from greeting;
create table bestproducts(id integer, Names varchar(50),AmountSold integer);
insert into bestproducts values(1,'Cup',11);
insert into bestproducts values(2,'Saucer',22);
insert into bestproducts values(3,'Plate',46);
insert into bestproducts values(4,'Fork',34);
insert into bestproducts values(5,'Spoon',45);
insert into bestproducts values(6,'Knife',78);
insert into bestproducts values(7,'Mug',23);
insert into bestproducts values(8,'Glass',64);
insert into bestproducts values(9,'Tumbler',24);

select ORDER by AmountSold from bestproducts;

SELECT * FROM bestproducts 
ORDER BY AmountSold desc limit 5;





create table passport(id integer, Names varchar(50),Country varchar(50));
insert into passport values (1,'Bob Smith', 'United States');
insert into passport values (2, 'Jim Jones', 'China');
insert into passport values (3, 'Sam White', 'Japan');
insert into passport values (4, 'Jess Black', 'Canada');
insert into passport values(5, 'Will Wilson', 'German');
insert into passport values (6, 'Wilson Scott', 'England');
insert into passport values (7, 'Scott Daniels', 'France');
insert into passport values(8, 'Daniel Jackson', 'Canada');
insert into passport values (9, 'Jack Johnson', 'United States');


SELECT * FROM passport  where Country != ('United States');



select DISTINCT Ages from nameAgeTable order by Ages;

SELECT SUM(Ages)
FROM nameAgeTable;




