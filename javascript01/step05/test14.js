/* 주제: 객체 - 객체와 함수호출

*/

"use strict"

function Calculator() {
  this.result = 0
  this.plus = function(value) {this.result += value}
  this.minus = function(value) {this.result -= value}
  this.multiple = function(value) {this.result *= value}
  this.divide = function(value) {this.result /= value}
}

//this가 빠지면 로컬변수를 찾아보고 글로벌변수를 찾아본다.
//자바스크립트 엔진상 그렇게 찾는다 자동으로 객체를 찾지않는다.

var c1 = new Calculator()
var c2 = new Calculator()
var c3 = new Calculator()

c1.plus(10)
c2.minus(20)
c3.plus(30)

console.log(c1.result);
console.log(c2.result);
console.log(c3.result);
