/*Join


1) cross
2) natural
3) join ~ on
4) outer join
*/

select mno, name, tel, email from memb;
select sno, work, lst_schl, schl_nm from stud;

/* 1) CROSS Join = CARTESIAN  Join



*/
select mno, name, sno, work, lst_schl
from memb, stud;

/*
=>
=>
*/
select m.mno, m.name, s.sno, s.work, s.lst_schl
from memb m, stud s;

/*표준 문법*/
select m.mno, m.name, s.sno, s.work, s.lst_schl
from memb m cross join stud s;

/* NATURAL Join
=>

*/

/*강의 -교실 조인 : cross join
*/
select lno, crmno, titl, name
from lect cross join croom;

/**/
select lno, l.crmno, titl, name
from lect l cross join croom c;

/*
*/
select
  l.lno,
  l.crmno,
  l.titl,
  c.name
from lect l cross join croom c;

/*강의 -교실 조인 : NATURAL JOIN*/
select l.lno, l.crmno, l.titl, c.crmno, c.name
from lect l cross join croom c
where l.crmno = c.crmno;  /**/

/*
*/
select l.lno, l.crmno, l.titl, c.crmno, c.name
from lect l natural join croom c;

/* =>

*/
select m.mno, m.name, s.sno, s.work, s.lst_schl
from memb m natural join stud s;

--

select m.mno, m.name, s.sno, s.work, s.lst_schl
from memb m cross join stud s
where m.mno = s.sno;

--


/* 3) JOIN ~ ON
=>
*/
select m.mno, m.name, s.sno, s.work, s.lst_schl
from memb m cross join stud s on m.mno = s.sno;

/*

*/
select m.mno, m.name, s.sno, s.work, s.lst_schl
from memb m inner join stud s on m.mno = s.sno;


/* 4) outer 조인




*/

/*

*/

select l.lno, l.titl, c.name
from lect l inner join croom c on l.crmno = c.crmno;
--


/*



*/
select l.lno, l.titl, c.name
from lect l left outer join croom c on l.crmno = c.crmno;

select l.lno, l.titl, c.name
from lect l right outer join croom c on l.crmno = c.crmno;




/*
관련 테이블:
  lect(강의정보), croom(강의실), mgr(매니저),
  lect_appy(수강신청), stud(학생), memb(회원기본정보)
출력결과:
강의번호, 강의명, 교실이름, 매니저이름, 매니저직급, 수강생명, 재직여부
*/

/* 수강 신청 번호, 강의제목 */
select la.lano, l.titl
from lect_appy la inner join lect l on la.lno = l.lno;

-- => 수강 신청 번호, 강의제목, 교실 이름
select la.lano, l.titl , cr.name, m.name
from lect_appy la
  inner join lect l on la.lno = l.lno
  left outer join croom cr on l.crmno = cr.crmno
  left outer join memb m on l.mrno = m.mno ;


  -- => 수강 신청 번호, 강의제목, 교실 이름 매니저 직급
select la.lano, l.titl , cr.name, m.name, mr.posi, m2.name, s.work
from lect_appy la
  inner join lect l on la.lno = l.lno
  left outer join croom cr on l.crmno = cr.crmno
  left outer join memb m on l.mrno = m.mno
  left outer join mgr mr on m.mno = mr.mrno
  left outer join memb m2 on la.sno = m2.mno
  left outer join stud s on la.sno = s.sno;
