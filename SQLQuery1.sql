create database KlientATM;

Create table klient(
    accountNo int primary key NOT NULL IDENTITY(1,1),
	name varchar(70) not null,
	balance float(50),
	card bigint,
	pin int
);

Insert Into klient( accountNo, name, balance, card, pin)
Values (1,'Mateo',35687,111111111111,1111);
