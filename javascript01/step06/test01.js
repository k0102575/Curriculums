/* 주제: Object()

*/
//1)
var obj1 = new Object();  //함수객체
console.log(obj1);



var obj2 = {}
console.log(obj2);

var obj2 = {
  name: '홍길동',
  age: 20
}

//2)
// 프로퍼티 안에서 인스턴스 function 인스턴스 변수
//obj를 초기화 시킨 Object 객체의 prototype에서 찾는다
console.log(obj2.hasOwnProperty('name'))
console.log(obj2.hasOwnProperty('age'))
console.log(obj2.hasOwnProperty('tel'))
//hasOwnProperty ''값을 객체의 프로퍼티에서 찾는다.

//3)
var obj3 = Object.create(null);
console.log(obj3)
