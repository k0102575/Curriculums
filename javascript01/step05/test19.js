/* 주제: 객체 - read only 프로퍼티 만들기

*/

"use strict"

//제어를 가하고 싶을때

var obj = {}
obj.result = 10;

// read only 프로퍼티 추가하기

Object.defineProperty(obj, 'result2', {
  value: '100'
})

// console.log(obj) result2 값이 출력이 안된다. 리스팅은 안된다


console.log(obj.result)
console.log(obj.result2) //직접적으로 입력해야 출력된다.

console.log("-------------------------------------------------------------")

obj.result = 20
console.log(obj.result)
obj.result2 = 200
console.log(obj.result2)

//일반 자바스크립트 개발자는 사용하지않는다.
// 자바스크립트 깊은 레벨에 필요한 작업
