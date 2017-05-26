/* 서브 쿼리
=> 쿼리문 안에 쿼리문을 실행하는 기법
=> 성능 문제를 생각하면서 사용해야 한다.
*/

select la.lano,
       l.titl ,
       cr.name,
       m.name,
       mr.posi,
       m2.name,
       s.work
from lect_appy la
  inner join lect l on la.lno = l.lno
  left outer join croom cr on l.crmno = cr.crmno
  left outer join memb m on l.mrno = m.mno
  left outer join mgr mr on m.mno = mr.mrno
  left outer join memb m2 on la.sno = m2.mno
  left outer join stud s on la.sno = s.sno;

-- 1) select 절(clause)에 서브쿼리 사용하기 */
select la.lano,
       l.titl ,
       (select name from croom where crmno=l.crmno) cname,
       (select name from memb where mno = l.mrno) mname,
       (select posi from mgr where mrno = l.mrno) position,
       (select name from memb where mno = la.sno) sname,
       (select work from stud where sno = la.sno) working
from lect_appy la
  inner join lect l on la.lno = l.lno;

-- select 할떄 마다 값을 셀렉트를 하기 때문에 성능이 느려진다.  쿼리 안에 쿼리가 들어간다.

-- 2) from 절(clause)에 서브쿼리 사용하기

-- 매니저 번호와 이름 뽑기

select mr.mrno, m.name
from mgr mr inner join memb m on mr.mrno = m.mno ;

-- 강의 번호와 강의명, 매니저 번호 뽑기

select lno, titl , mrno
from lect l;

-- 강의번호와 강의명, 매니저 이름 데이터 뽑기

select l.lno, l.titl, m.name
from lect l
  left outer join memb m on l.mrno = m.mno;

-- 서브쿼리를 사용하여 조인하기

select l.lno, l.titl, t1.name
from lect l
  inner join (select mr.mrno, m.name
  from mgr mr inner join memb m on mr.mrno = m.mno
  where m.name = "매니저1")t1
  on l.mrno = t1.mrno;

-- where 절에 서브쿼리 사용하기
-- 강남 강의실이 배정된 강의 번호와 강의명, 강의실명을 출력하라
--출력데이터: 강의번호, 강의명;

-- 일단 강의정보를 추출한다.
select l.lno, l.titl, l.crmno
from lect l;

-- 강남 강의설 정보를 추출한다.
select crmno, name
from croom
where name like '강남%';

-- where절에 서브쿼리를 넣어 강남 강의실이 배정된 강의 정보를 추출한다.;

select lno, titl, crmno
from lect l
where l.crmno in (select crmno from croom where name like '강남%');
