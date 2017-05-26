/* 주제: 객체 - 일반 객체와 함수 객체

*/

"use strict"

// 변수 객체안에 있는건 프로퍼티

//1)함수 객체 응용편


function Calculator() {
  this.result = 0;
}

// var c1 = calculator function 과 같다

//2) 인스턴스 함수 추가

Calculator.prototype.plus = function(value) {this.result += value}
Calculator.prototype.minus = function(value) {this.result -= value}


// 3) 일반함수 추가

Calculator.plus = function (a, b) {return a + b}
Calculator.minus = function (a, b) {return a - b}

//4)
var calc1 = new Calculator()

//5)
calc1.plus(100);
calc1.minus(20);
calc1.plus(10)
console.log(calc1.result);


//6)
var r1 = Calculator.plus(100, 200)
var r2 = Calculator.minus(100, 200)
console.log(r1, r2);
