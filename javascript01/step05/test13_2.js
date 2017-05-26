/* 주제: 객체 - this 변수의 활용

*/

"use strict"

var obj1 = {}
obj1.v1 = 100
obj1.f1 = function() {
  console.log(v1)
}

obj1.f1()

function f2() {
  console.log('hello')
}

f2()
