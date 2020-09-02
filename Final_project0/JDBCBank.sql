/*create table bankPeople(
	mycol int not null
);
*/

ALTER TABLE bankPeople 
ADD COLUMN ID SERIAL PRIMARY KEY;

ALTER TABLE bankPeople 
ADD column Fname varchar;

ALTER TABLE bankPeople 
ADD column Lname varchar;

ALTER TABLE bankPeople 
ADD column Uusername varchar;

ALTER TABLE bankPeople 
ADD column Upasswrd varchar;

ALTER TABLE bankPeople 
ADD column Ubalance int;

ALTER TABLE bankPeople 
ADD column Uverified boolean;

/**********************/



