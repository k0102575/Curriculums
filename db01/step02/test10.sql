외부키 컬럼

방법1) 부모 테이블 선언
create table t2 (
  no int,
  title varchar(10),
  content text
);

alter table t2
  add constraint primary key (no);
alter table t2
  modify column no int auto_increment;

예제 데이터 입력

insert into t2(title,content) values('제목1', '내용.....');

insert into t2(title,content) values('제목2', '내용.....');

insert into t2(title,content) values('제목3', '내용.....');

방법2) 자식 테이블 선언
create table t3 (
  no int,
  bno int not null,
  file varchar(100) not null
);

alter table t3
  add constraint primary key (no);
alter table t3
  modify column no int auto_increment;

예제 데이터 입력
insert into t3(bno, file) values(10, 'aaa.gif');

alter table t3
  add foreign key(bno) references t2(no);

insert into t3(bno, file) values(3, 'aaa.gif');
