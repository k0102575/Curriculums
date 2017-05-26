/* 주제: 객체 - 일반 객체와 함수 객체

*/

"use strict"

//일반 객체

var obj1 = {
  name: '홍길동',
  age: 20
}
obj1.tel = '111-1111'
obj1.f1 = function() {console.log('hello');}
obj1.ok = {}
//상자를 용도에 맞게 쓴다.

//인스턴스 데이터를 가지고 있는 메모리

//함수 객체

var obj2 = function() {
  console.log('test..')
}
obj2.tel = '222-2222'
obj2.f1 = function() {console.log('hi');}
obj2.ok = {}

obj2()


//일반 객체와 달리 프로토타입객체가 있다 현재는 입력한게 없어서 빈객체가 있다.
