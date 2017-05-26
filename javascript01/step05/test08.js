/* 주제: 객체 - 생성자와 this 변수

*/
//자바스크립트는 생성자라는 문법이없다
//new라는 키워드 뒤에 초기화 시킨다는뜻이다.


"use strict"

function init() {

  console.log(this);
}

new init();
init();
