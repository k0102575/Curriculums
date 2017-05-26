/*  데이터 조회 명령



*/

/* 테이블에 모든 데이터와 모든 컬럼 값을 가져오기 */
select * from memb;


describe memb;
desc memb;

/**/
/*
=>
*/
select lano, lno from lect_appy;

/* */
/* */

select distinct lno from lect_appy;

/*

*/
select distinct crmno,mno from lect;  /* 2개의 값을 하나의 단위로 봐서 중복제거해라*/

/*[all 키워드]

*/
select lno from lect_appy;
