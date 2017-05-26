/* 주제: 객체 - 일반 함수와 인스턴스 함수

*/

"use strict"
function Calculator() {
  this.result = 0; // 각각 개별적으로 만들기 때문에 인스턴스 변수
}

Calculator.prototype.plus = function(value) {this.result += value}
Calculator.prototype.plus2 = function(a,b) {return a + b}
//prototype는 인스턴스를 다루는 함수를 둔다.
//this를 쓰면은 인스턴스함수다
//this를 안쓰면 인스턴스 함수로 안써도 된다. 인스턴스로 쓰면 의미가없다.

var c1 = new Calculator()
var c2 = new Calculator()

c1.plus(100)
var r1 = c1.plus2(100,200)
console.log(c1.result, r1)

c2.plus(200)
var r2 = c2.plus2(1000,2000)
console.log(c2.result, r2)

//선택1
function plus2(a, b) {
  return a + b
}

//선택2
Calculator.plus2 = function(a, b) {return a + b}
var r3 = Calculator.plus2(100,200)
console.log(r3);
