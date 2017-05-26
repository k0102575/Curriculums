/* 주제: 모듈 만들기
- 함수들이나 객체를 별도의 파일로 분리하여 관리하기
- 즉 몇 백개, 몇 천개, 몇 만개의 함수나 객체를 한 개의 파일에서 관리할 수 없다.
- 함수나 객체들을 역활이나 기능에 따라 적절히 분류하여
  여러개의 파일에 분산해 두는 것이 유지보수에 좋다.
  이렇게 분리된 함수나 객체들의 묶음을 "모듈(module)"이라 부른다.
1) 모듈 정의
  => test06_m1.js
2) 모듈 사용
  => require('모듈명 또는 모듈 경로')
*/
"use strict"

// require(모듈 경로)
// => module 객체에 보관된 exports 객체를 리턴한다.
var cal = require('./test06_m1.js')

//cal <= module.exports 객체를 가리킨다.
console.log(cal.plus(10,20));
console.log(cal.minus(10,20));
console.log(cal.multiple(10,20))
console.log(cal.divide(10,20))
