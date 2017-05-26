/* 주제: 배열과 변수
- 배열은 단지 여러 개의 연결된 메모리일 뿐이다.
  그 메모리에 어떤 값을 넣든지 개발자 마음대로 이다.

*/
"use strict"
// 배열 형식: 이름, 국어, 영어, 수학
var a1 = ["홍길동",99,98,97];

console.log(a1[1],);

var v1 = a1;
a1[1] = 88;
console.log(v1[1]);

var x = 10;
var y = x;
x = 20;
console.log(y);











//
