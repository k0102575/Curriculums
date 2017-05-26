/* 주제: 기타 - eval() 함수
-
*/

"use strict"

// 고정코드 방식: 자바스크립트 엔진이 코드를 해석할 떄 실행한다.
var obj = {
  name: '홍길동',
  age: 20
}
console.log(obj)

// 문자열로 된 가변코드
var str = "var v1 = 10, v2 = 20; console.log(v1 + v2)";

// 가변 코드를 실행하기: eval() 함수를 호출할 떄 실행한다.
eval(str)

var x1;
var x2;

var obj2 = eval("x1 = 100, x2 = 200;")
console.log(obj2)
