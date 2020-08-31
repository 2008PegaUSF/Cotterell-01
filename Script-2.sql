SELECT column_list FROM table-name
[WHERE Clause]
[GROUP BY clause]
[HAVING clause]
[ORDER BY clause];



--1. SQL Queries
--1.1 SELECT
SELECT 
"EmployeeId"
from 
"Employee"
WHERE 
("LastName" = 'King');


-- Select the city and state for the records in the Employee table where first name is Andrew and REPORTSTO is null?
SELECT 
"City", "State" 
from 
"Employee"
WHERE 
("FirstName" = 'Andrew', "Re");


--1.2 Sub- queries (Select in a Select)
--Task – Select all records from the Album table where the composer is AC/DC.
SELECT 
* 
from 
"Track"
WHERE 
"Composer" = 'AC/DC';


--1.3 ORDER BY
--Task – Select all albums in Album table and sort result set in descending order by title.
SELECT 
*
from
"Album"
ORDER BY 
"Title" desc;


--Task – Select first name from Customer and sort result set in ascending order by city
SELECT 
"FirstName"
from
"Customer"
ORDER BY 
"City" asc;

--1.6 LIKE
--Task – Select all invoices with a billing address like “T%” .

SELECT 
*
from
"Invoice"
where
"BillingAddress" LIKE 'T%';


--1.7 BETWEEN
--Task – Select all invoices that have a total between 15 and 50.
SELECT 
*
from
"Invoice"
WHERE 
--15 < "Total" and "Total" < 50;
"Total" between 15 and 50;


--Task – Select all employees hired between 1st of June 2003 and 1st of March 2004.
SELECT 
*
from
"Employee"
WHERE 
"HireDate" BETWEEN '2003-06-01 00:00:00' and '2004-03-01 00:00:00';
--"HireDate" BETWEEN Convert(datetime, '2003-06-01 00:00:00') and Convert(datetime, '2004-03-01 00:00:00');


--2. DML Statements
--In this section you will be performing various data manipulation statements against the Chinook database.
--2.1 INSERT INTO
--Task – Insert two complete new records into Genre table. 
INSERT 
INTO 
"Genre" ("GenreId") VALUES (26);
INSERT 
INTO 
"Genre" ("GenreId") VALUES (27);
--null will be added to all other columns apart from GenreId


--Task – Insert two complete new records into Employee table.
INSERT 
INTO 
"Employee" ("EmployeeId", "FirstName", "LastName") VALUES (9, 'Rayonase', 'Laymana');
INSERT 
INTO 
"Employee" ("EmployeeId", "FirstName", "LastName") VALUES (10, 'Rayonasez' , 'Layman');


--Task – Insert two complete new records into Customer table.

INSERT 
INTO 
"Customer" ("CustomerId", "FirstName", "LastName", "Email") VALUES (60, 'Zed', 'Chamberz', 'a@b.com');
INSERT 
INTO 
"Customer" ("CustomerId", "FirstName", "LastName", "Email") VALUES (61, 'Zedan', 'Chamberas','a@a.com');

--2.2 UPDATE
--Task – Update Aaron Mitchell in Customer table to Robert Walter.
UPDATE 
"Customer" 
SET 
"FirstName" = 'Robert', "LastName" = 'Walter'
WHERE 
"FirstName" = 'Aaron' and "LastName" = 'Mitchell';


--Task – Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”
UPDATE 
"Artist"
SET 
"Name" = 'CCR'
WHERE 
"Name" = 'Creedence Clearwater Revival';




--2.3 DELETE
--Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).
ALTER TABLE "Customer" 
DROP CONSTRAINT "FK_CustomerSupportRepId"; --deleted foreign key from customer table

ALTER TABLE "Employee" 
DROP CONSTRAINT "FK_InvoiceCustomerId";  --deleted foreign key from Invoice table

DELETE FROM 
"Customer"
WHERE "FirstName" = 'Robert' and "LastName" = 'Walter'; --deleted Robert Walter

--atempts to restore FKs
ALTER TABLE "Employee" ADD CONSTRAINT "FK_InvoiceCustomerId" FOREIGN KEY ("EmployeeId" ) REFERENCES "Customer"("CustomerId");
ALTER TABLE "Invoice" ADD CONSTRAINT "FK_CustomerSupportRepId" FOREIGN KEY ("CustomerId") REFERENCES "Customer"("CustomerId");
--ALTER TABLE "Invoice" 
--ADD CONSTRAINT FK_InvoiceCustomerId FOREIGN KEY ("CustomerId");
--ALTER TABLE "Invoice" 
--DROP CONSTRAINT FK_InvoiceCustomerId;



--3. SQL Functions
--In this section you will be using system functions, as well as your own functions, to perform various actions against the database.
--3.1 System Defined Functions
--Task – Create a query that returns the current time.


SELECT CURRENT_TIMESTAMP;

--Task – Create a query that returns the length of name in MEDIATYPE table

SELECT length("Name") from "MediaType" where "Name" = 'MPEG audio file'; --chracter length with spaces

--3.2 System Defined Aggregate Functions
--Task – Create a function that returns the average total of all invoices 

select avg( all "Total" ) from "Invoice";

--Task – Create a function that returns the most expensive track
select max(ALL "UnitPrice" ) from "Track";

--3.3 User Defined Functions
--Task – Create a function that returns the average price of invoiceline items in the invoiceline table.

create or replace function invoiceAverage()
returns float as $$
begin
	return avg( all "UnitPrice" ) from "Invoice";
end;
$$ language plpgsql;

drop function invoiceAverage();

--Create a function that returns all employees who are born after 1968.


create or replace function OlderThan1968()
returns float as $$
begin
	return 
"BirthDate"
from
"Employee"
where
 "BirthDate" > '1968-01-1 00:00:00';
end;
$$ language plpgsql;


drop function OlderThan1968();

/*
4.1 After Insert Trigger

Create an after insert trigger on the employee table fired after a
 * new record is inserted into the table to set the phone number to 867-5309.
 * 
 * 
 * */

--4.2 Before Insert Trigger
--Task – Create a before trigger on the customer table that fires before a row is inserted from the table to set the company to Revature.



/*5.1 Inner Join*/
--Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.


---



/*6.1 Union*/
--Create a UNION query for finding the unique records of last name, first name, and phone number for all customers and employees.
select "LastName", "FirstName", "Phone" from "Customer" 
union
select "LastName", "FirstName", "Phone" from "Employee";

/*6.2 Except All*/
--Create an EXCEPT ALL query for finding the all records of the city, state, and postal codes for all customers and all records of employees that have a different  city, state, and postal codes of any customer.
select "City", "State", "PostalCode" from "Customer" 
except all
select "City", "State", "PostalCode" from "Employee";