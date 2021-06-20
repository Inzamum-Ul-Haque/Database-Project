Use Smart_Canteen_Management;

create table Manager(
M_Id varchar(20) primary key not null,
M_Password varchar(50),
M_Name varchar(50) not null,
M_Address varchar(100) not null,
M_Phone_Number int
);

create table Customer(
Cs_Id int primary key not null,
Cs_Name varchar(50) ,
Cs_Address varchar(100),
Cs_Phone_Number int,
Receipt_Id int not null foreign key references SalesPerDay(Receipt_Id)
);


create table Cashier(
Cas_Id varchar(20) primary key not null,
Cas_Password varchar(50),
Cas_Name varchar(50) not null,
Cas_Address varchar(100) not null,
Cas_Phone_Number int,
Cas_Joining_Date date
);


create table Receipt(
Index_No int identity(1,1) primary key not null,
Receipt_Id int not null,
Ordered_Meal_Name varchar(50) not null,
Unit_Cost int not null,
No_of_items int not null,
Subtotal int not null
);

create table SalesPerDay(
Receipt_Id int primary key not null,
Order_Date date not null,
Total_Cash int not null
);

create table Waiter(
W_Id varchar(20) primary key not null,
W_Name varchar(50) not null,
W_Address varchar(100) not null,
W_Phone_Number int,
W_Joining_Date date
);


create table Meal(
Meal_Id varchar(50) primary key NOT NULL ,
Meal_Name varchar(50) not null,
Available_Items int not null,
Unit_Price int not null

);

create table Chef(
Chef_Id varchar(20) primary key not null,
Chef_Name varchar(50) not null,
Chef_Address varchar(100) not null,
Chef_Phone_Number int,
Chef_Joining_Date date
);

select * from Manager;

select * from Waiter;

select * from Chef;

select * from Cashier;

select * from Meal;

select * from Customer;

select * from SalesPerDay;

select * from Receipt;

INSERT INTO Manager VALUES ('M990', '123456', 'Rahim Khan', 'Mirpur,Dhaka', 01912584949)
INSERT INTO Manager VALUES ('M991', '23654', 'Karin Khan', 'Mirpur,Dhaka', 01912584949)
INSERT INTO Manager VALUES ('M995', '12356', 'Fahmid Khan', 'Mirpur,Dhaka', 01912584949)






INSERT INTO Cashier VALUES ('Cas102', '123456', 'Rahim Khan', 'Mirpur,Dhaka', 01912584949, '1994-7-14')
INSERT INTO Cashier VALUES ('Cas104', '23654', 'Karin Khan', 'Mirpur,Dhaka', 01912584949, '1994-7-14')
INSERT INTO Cashier VALUES ('Cas105', '12356', 'Fahmid Khan', 'Mirpur,Dhaka', 01912584949, '1994-7-14')
INSERT INTO Cashier VALUES ('Cas106', '123456', 'Abir Khan', 'Mirpur,Dhaka', 01912584949, '1994-7-14')
INSERT INTO Cashier VALUES ('Cas107', '123456', 'Latif Khan', 'Mirpur,Dhaka', 01912584949, '1994-7-14')
INSERT INTO Cashier VALUES ('Cas108', '123456', 'Sojol Khan', 'Mirpur,Dhaka', 01912584949, '1994-7-14')

DELETE FROM Waiter where W_Id= 'W201';

INSERT INTO Chef VALUES ('Ch104',  'Karin ', 'Mirpur', 01912584949, '1994-7-14')
INSERT INTO Chef VALUES ('Ch105',  'Fahmid ', 'Mirpur', 01912584949, '1994-7-14')
INSERT INTO Chef VALUES ('Ch106',  'Abir ', 'Mirpur', 01912584949,'1994-7-14')
INSERT INTO Chef VALUES ('Ch107', 'Latif ', 'Mirpur', 01912584949, '1994-7-14')
INSERT INTO Chef VALUES ('Ch108', 'Sojol ', 'Mirpur', 01912584949, '1994-7-14')

INSERT INTO Waiter VALUES ('W104',  'Karin Khan', 'Mirpur,Dhaka', 01912584949, '1994-7-14')
INSERT INTO Waiter VALUES ('W105',  'Fahmid Khan', 'Mirpur,Dhaka', 01912584949, '1994-7-14')
INSERT INTO Waiter VALUES ('W106',  'Abir Khan', 'Mirpur,Dhaka', 01912584949,'1994-7-14')
INSERT INTO Waiter VALUES ('W107', 'Latif Khan', 'Mirpur,Dhaka', 01912584949, '1994-7-14')
INSERT INTO Waiter VALUES ('W108', 'Sojol Khan', 'Mirpur,Dhaka', 01912584949, '1994-7-14')




INSERT INTO SalesPerDay VALUES (121,'2020-09-23',150)
INSERT INTO SalesPerDay VALUES (101,'2020-09-23',100)


/*ALTER TABLE Customer ALTER COLUMN Receipt_Id int not null FOREIGN key references SalesPerDay(Receipt_Id);*/

select c.Cs_Id,c.Cs_Name,c.Cs_Address,c.Cs_Phone_Number,c.Receipt_Id,s.Total_Cash from 
Customer c join SalesPerDay s on c.Receipt_Id = s.Receipt_Id and Cs_Name = 'Fahmeed';

select Receipt_Id from SalesPerDay
where Receipt_Id = (select max(Receipt_Id) from SalesPerDay);

select Cs_Id from Customer
where Cs_Id = (select max(Cs_Id) from Customer);

Delete From Customer where Cs_Id = 77;

select Sum(Total_Cash) as Total_Cash from SalesPerDay ;

