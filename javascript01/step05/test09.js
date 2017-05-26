/* 주제: 객체 - this 변수를 통해 객체를 초기화시키기

*/

//객체를 1번 만들어서 1번만 사용하려면 블럭방식이 편하다.
//객체를 1번 만들어서 여러번 사용할때는 생성자가 훨씬 편하다.

"use strict"

function init() {   //변수1개에 함수4개를 담는다.
  this.result = 0;
  this.plus = function(value) {this.result += value}
  this.minus = function(value) {this.result -= value}
  this.multiple = function(value) {this.result *= value}
  this.divide = function(value) {this.result /= value}
}

var calc = new init()
//new라는 명령어 뒤에 바로 함수를 호출해야된다 호출안하면 오류
//생성자  구축한다라는표현    constructor
console.log(calc);


//init란 함수로 초기화 시켰다.

// 10 + 20 * 3 - 7 / 2 = ?
calc.plus(10)
calc.plus(20)
calc.multiple(3)
calc.minus(7)
calc.divide(2)
console.log(calc.result)

var c1 = new init()
c1.plus(20)
var c2 = new init()
c2.plus(30)
var c3 = new init()
c3.plus(40)
console.log(c1.result,c2.result,c3.result);
