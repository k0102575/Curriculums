unique 옵션

create table t2 (
  no int,
  name varchar(10) default '홍길동',
  email varchar(50)
);

alter table t2
  add constraint primary key (no);

alter table t2
  add constraint unique (email);

예제 데이터 입력

insert into t2(no, name) values(1, '홍길동');

insert into t2(no, name) values(2, '임꺽정');

insert into t2(no, name, email) values(3, '유관순', 'yoo@test.com');

insert into t2(no, name, email) values(4, '안중근', 'yoo@test.com');

insert into t2(no)
values(2);
