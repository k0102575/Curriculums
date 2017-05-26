/* 주제: 모듈 정의
- 모듈로 관리할 함수나 객체를 정의한 후
  module.exports 라는 객체에 그 주소를 저장한다.
*/
"use strict"

function plus(a, b) {return a + b}
function minus(a, b) {return a - b}
function multiple(a, b) {return a * b}
function divide(a, b) {return a / b}

// module.exports.모듈을 사용하는 측에서 호출할 이름 = 함수주소
// module 객체에
exports.plus = plus
exports.minus = minus
exports.multiple = multiple
exports.divide = divide
