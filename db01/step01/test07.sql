/* 데이터 입력, 변경, 삭제 */

-- 1) 데이터 입력

insert memb(mno, name, tel, email, pwd)
values(40, '홍길동1', '1111-1111', 'hong1@test.com', '1111');



-- auto_increment
insert memb(name, tel, email, pwd)
values('홍길동2', '1111-1111', 'hong2@test.com', '1111');



-- 사용자 암호
insert memb(name, tel, email, pwd)
values('홍길동3', '1111-1111', 'hong3@test.com', password('1111'));






-- 입력할
insert memb
values(43, '홍길동4', '1111-1111', 'hong4@test.com', password('1111'));




-- select 한 결과를 insert 할 수 있다.

insert tcher(tno, hmpg)
select mno , 'http://www.bitcamp.co.kr'
from memb
where mno between 40 and 49;


-- 2) 데이터 변경 하기

update tcher set fcbk='okok', twit='nono' where tno=40;



-- 테이블에 있는
update memb set pwd=password('1111');



-- 3) 데이터 삭제 하기
delete from tcher where tno in (40, 43);
delete from memb where mno in (40, 43);






delete from tcher where tno = 41;
delete from memb where mno = 41;
