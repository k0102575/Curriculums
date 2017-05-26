테이블에 컬럼 변경하기

create table t2 (
  no int,
  name varchar(10),
  gender char(1),
  height numeric(4,1),
  intro text,
  birthday date,
  regdate datetime
);

alter table t2
  add constraint primary key (no);

예제 데이터 입력
insert into t2(no, name, gender, height, intro, birthday, regdate)
values(1, '홍길순', 'W', 160.5, '길순이..', '1993-5-5', '2017-4-17 15:23:11');

insert into t2(no, name, gender, height, intro, birthday, regdate)
values(2, '홍길순이다', 'W', 160.5, '길순이..', '1993-5-5', '2017-4-17 15:23:11');

insert into t2(no, name, gender, height, intro, birthday, regdate)
values(3, '홍길순이라고한다.', 'W', 160.5, '길순이..', '1993-5-5', '2017-4-17 15:23:11');

컬럼 정의 변경하기

alter table t2
  change column name fst_nm varchar(10),
  add column lst_nm varchar(10);

컬럼의 이름은 그래도 두고 정의만 변경하기
alter table t2
  modify column fst_nm varchar(9);

alter table t2
  modify column fst_nm varchar(8);

--numeric 타입을 varchar(10) 타입으로 변경

alter table t2
  modify column height varchar(10);

char(n) 타입을 int 타입으로 변경

alter table t2
  modify column gender int;
