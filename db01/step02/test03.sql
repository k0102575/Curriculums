Primary key 칼럼을 지정하기

방법1) 컬럼을 선언할떄 pk 여부를 지정하기

create table t2 (
  no int primary key,
  name varchar(10),
  gender char(1),
  height numeric(4,1),
  intro text,
  birthday date,
  regdate datetime
);

insert into t2(no, name, gender, height, intro, birthday, regdate)
  values(1, '홍길순', 'W', 160.5, '길순이..', '1993-5-5', '2017-4-17 15:23:11');

insert into t2(no, name, gender, height, intro, birthday, regdate)
  values('홍길순', 'W', 160.5, '길순이..', '1993-5-5', '2017-4-17 15:23:11');

방법2) 컬럼들을 선언한 후 테이블 닫기 전에 PK여부를 지정하기
       constaint 는 제약조건 이라는 뜻

create table t2 (
  no int,
  name varchar(10),
  gender char(1),
  height numeric(4,1),
  intro text,
  birthday date,
  regdate datetime,
  constraint primary key (no)
);

방법3) 테이블을 정의한 후 PK 여부를 지정하기

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
