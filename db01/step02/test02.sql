컬럼의 데이터 타입 지정

create table t2 (
  no int,
  name varchar(10),
  gender char(1),
  height numeric(4,1),
  intro text,
  birthday date,
  regdate datetime
);

drop table t2;


insert into t2(no, name, gender, height, intro, birthday, regdate)
  values(1, '홍길순', 'W', 160.5, '길순이', '1993-5-5', '2017-4-17 15:23:11');

insert into t2(no, name, gender, height, intro, birthday, regdate)
  values(3.14, '홍길순', 'W', 160.5, '길순이', '1993-5-5', '2017-4-17 15:23:11');

insert into t2(no, name, gender, height, intro, birthday, regdate)
  values(4, '12345678901', 'W', 160.5, '길순이', '1993-5-5', '2017-4-17 15:23:11');

insert into t2(no, name, gender, height, intro, birthday, regdate)
  values(5, '가나다라마바사아자차', 'W', 160.5, '길순이', '1993-5-5', '2017-4-17 15:23:11');

insert into t2(no, name, gender, height, intro, birthday, regdate)
  values(6, '가나다라마바사아자차카', 'W', 160.5, '길순이', '1993-5-5', '2017-4-17 15:23:11');

insert into t2(no, name, gender, height, intro, birthday, regdate)
  values(6, '가나다라마바사아자차카', 'W', 160.5, '길순이', '1993-5-5', '2017-4-17 15:23:11');

insert into t2(no, name, gender, height, intro, birthday, regdate)
  values(7, '홍길순', 'W', 60.57, '길순이', '1993-5-5', '2017-4-17 15:23:11');

insert into t2(no, name, gender, height, intro, birthday, regdate)
  values(8, '홍길순', 'W', 2060.6, '길순이', '1993-5-5', '2017-4-17 15:23:11');

insert into t2(no, name, gender, height, intro, birthday, regdate)
  values(9, '홍길순', 'W', 150, '길순이', '1993-5-5 7:03:05', '2017-4-17 15:23:11');

insert into t2(no, name, gender, height, intro, birthday, regdate)
  values(10, '홍길순', 'W', 150, '길순이', '1993-5-5 7:03:05', '2017-4-17');
