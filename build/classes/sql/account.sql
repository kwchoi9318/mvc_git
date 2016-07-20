
----------[내부스키마:물리적]------------
create table account(
	account_no int primary key,
	money int,
	id varchar2(20)
	
);
select * from account;
drop table account;

insert into account(account
	account_no,money,id
)values(
	100001,70000,'park'
);

------------[외부스키마]-------------
create view account_member as
select 
		a.account_no as account_no,
		a.money as money,
		m.id as id,
		m.pw as pw,
		m.name as name,
		m.reg_date as reg_date,
		m.ssn as ssn
from
member m, account a
where m.id = a.id;

		account_no as acc,
		money as money,
		id as id,
		pw as pw,
		name as name,
		ssn as birth
from account_member;

