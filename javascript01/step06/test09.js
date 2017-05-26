/* 주제: exports 객체를 함수 객체로 대체하기 II
- require()가 리턴한 함수를 호출하고, 그 함수가 리턴한 값을 사용하기
*/
"use strict"

var m1 = require('./test09.js')

var calc = m1()

calc.plus(10)
calc.minus(5)
calc.multiple(10)
calc.divide(2)

console.log(calc.result)
