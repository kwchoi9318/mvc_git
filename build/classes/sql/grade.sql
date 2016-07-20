create sequence seq
increment by 1
start with 1000;
nocycle;

drop table grade;

create table grade(
	seq number constraint grade_pk primary key,
	grade varchar2(1),
	java number,
	sql number,
	html number,
	javascript number,
	id varchar2(20),
	constraint grade_member_fk foreign key (id)
	references member(id) on delete cascade
);
alter table grade add exam_date varchar2(10);
--create
insert into grade(
	seq,grade,java,sql,html,javascript,id,exam_date
)values(
	seq.nextval,'C',75,78,72,70,'hong','2016-06'
);
	--read : list
select * from grade;

select * from grade where seq='1000';
	--read : findByID
select * from grade where id = 'hong';	
-- read : count
select count(*) from grade;
--update : update
update grade set exam _date = '2016-05'
where seq = 1001;
--delete
delete from grade where seq = '1000';
--물리적
------------------------------------------
--뷰 권한주기
sqlplus system/hanbit
grant dba to hanbit;


--가상 테이블(스키마)
create view grade_view
as select * from grade;

select * from grade_view;
-- join
create view grade_member as
select 
	g.seq as seq,
	g.grade as grade,
	g.java as grade,
	g.sql as sql,
	g.html as html,
	g.javascript as javascript,
	g.id as m.id,
	m.pw as pw,
	m.name as name,
	m.reg_date as reg_date,
	m.ssn as ssn
	from member m,grade g
where m.id = g.id;

select * from grade_member;

insert into grade_member
(
	seq,
	grade,
	grade,
	sql,
	html,
	javascript,
	id,
	pw,
	name,
	reg_date,
	as ssn
)
values
(
	seq.nextval,
	'B',
	80,
	82,
	83,
	87,
	'2016-06',
	'jang',
	'1',
	'장보고',
	sysdate,
	'031001-3'
);



