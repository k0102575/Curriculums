null 옵션

create table t2 (
  no int,
  name varchar(10),
  gender char(1) not null,
  height numeric(4,1),
  intro text,
  birthday date,
  regdate datetime
);
alter table t2
  add constraint primary key (no);

insert into t2(no, gender)
values(1, 'W');

insert into t2(no)
values(2);
