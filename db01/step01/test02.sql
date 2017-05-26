/* order by
=>









*/



select mno, name, tel, email
from memb
order by name asc;


select mno, name, tel, email
from memb
order by name desc;





/**/
select lano, lno, sno from lect_appy
order by lno asc, sno desc;


/*
=> order by 에서 컬럼을 지정할때, select에 선언하지 않은 컴럼을 지정할 수 있다.
=> 이유?
  select는 추출할 항목이 무엇인지 표시하는 일을 한다.
  select를 먼저 처리했다고 해서 컴ㄹ럼이 추출된 상태가 아니다.
  단지 결과로 출력할 컬럼 값이 무엇인지 표시한 거다.
  그래서 order by 에서
*/
select lano, sno
from lect_appy
order by lno asc, sno desc;
 /* 해설





 */
