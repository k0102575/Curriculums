/* 주제: 객체 - defineProperty() 응용

*/

"use strict"

function Calculator() {
}
let result = 0
Calculator.prototype.plus = function(value) {
  result += value
}
Calculator.prototype.minus = function(value) {
  result -= value
}
Calculator.prototype.getResult = function(value) {
  return result
}
// 셋다 같은 result를 쓴다
// 셋다 같은 공간이고 같은 영역이다
// 클로저 변수를 이용한다 클로저 함수의 변수



//바깥쪽 변수가 로컬변수나 let변수일경우 복제해서 가지고 있는다.


var calc1 = new Calculator()


calc1.plus(100)
calc1.minus(20)
calc1.plus(10)
console.log(calc1.getResult());
