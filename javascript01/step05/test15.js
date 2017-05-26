/* 주제: 객체 - prototype

*/

"use strict"

function Calculator() {
  this.result = 0
}

Calculator.prototype.plus = function (value) {this.result += value}
Calculator.prototype.minus = function (value) {this.result -= value}
Calculator.prototype.multiple = function (value) {this.result *= value}
Calculator.prototype.divide = function (value) {this.result /= value}
//prototype는 객체에서 공통으로 사용할 변수나 함수를 쓰기위해서
//prototype이라는 객체

var c1 = new Calculator()
var c2 = new Calculator()
var c3 = new Calculator()

c1.plus(10)
// c1이라는 객체에 가서 plus라는 함수를 찾는다
// plus라는 함수가 없으면 생성자 주소를 찾는다
// 이 객체를 초기화 시킨 주소를 찾아가서 prototype에서 plus함수를 찾는다.
c2.minus(20)
c3.plus(30)

console.log(c1.result)
console.log(c2.result)
console.log(c3.result)

Calculator.prototype.plus(10)
//오류는 뜨지 않는다 객체가 없기 때문에 this란 변수가 없다
//this 변수를 사용할 수 없다.
//prototype의 용도를 생각해라
