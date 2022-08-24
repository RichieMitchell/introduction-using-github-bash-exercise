select * from "Employee";
select * from "Employee" where "LastName" = 'King';
select * from "Employee" where "FirstName" = 'Andrew' and 'REPORTSTO' = null;
select * from "Album" order by "Title" desc;
select * from "Customer" order by "FirstName" asc;
select * from "Invoice" where "BillingAddress"='T%';
select * from "Invoice" where "Total">'15' and "Total"<'50';

select * from "Employee" where "HireDate" < '2003-06-01' and "HireDate" > '2004-03-01';
select * from "Genre";
insert  into  "Genre" values (27,'goa trance techno' ) ;
insert into "Genre" values (28,'psytrance techno'); 
insert into "Employee" values (9,'Mitchell','Richard','CIO',1,'1988-01-03','2004-04-04','648 North Street','Lindenwald','NJ','USA','08083','+1(203)999-9999)','+1(789)333-2121','tsouzoinfive@chinookcorp.com');
insert into "Employee" values (10,'Tom','Carter','CT0',3,'1982-01-04','2004-07-04','645 North Street','Lindenwald','NJ','USA','08083','+1(203)999-9999)','+1(789)335-2121','yuzogo@chinookcorp.com');
insert into "Customer" values (60,'Coolion','Carver','Google','2 Infinite Loop','Cupertino','CA','USA','95014','+1(222)433-9100','+1(243)444-1111','colsolarmey@total.com',4);
insert into "Customer" values (61,'River','Tyranis','Vortex','5 Test yeard street','Philadelphia','PA','USA','09091','+1(212)433-9100','+1(213)444-1111','eseme@total.com',5);       
UPDATE "Customer"
SET "FirstName" = 'Robert ', "LastName" = 'Walter' where "CustomerId" =32;


select * from "Artist";



UPDATE "Artist"
SET "Name"  = 'CCR' where "Name" = 'Creedence Clearwater Revival';











