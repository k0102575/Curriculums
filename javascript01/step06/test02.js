/* 주제: String()

*/
//1) 함수로 사용해 보자!
//new String('hello')의 역활
var str1 = new String('hello');  //함수객체
console.log(str1);
console.log(typeof str1);

console.log("문자열 길이 = ", str1.length);
console.log('2번방 문자 = ', str1.charAt(2));

console.log("---------------------------------------------------------------");

var str2 = 'hello' //문자열 자체가 값으로 취급된다.
console.log(str2);
console.log(typeof str2);
//객체가 아니지만 마치 생성자 함수로 초기화 시킨것 처럼 New string 객체 처럼 사용한다
//New string해도 되지만 자바스크립트가 그냥 처리하니까 그냥 사용해라

console.log("문자열 길이 = ", str2.length);
console.log('2번방 문자 = ', str2.charAt(2));
//객체가 아니지만 객채로 바꾼다음에 길이와 객체 방번호를출력한다.
// 타입오브는 스트링이지만   스트링함수에 들어있는 메소드들을 마음껏 사용할수있다.

var obj2 = {
  name: '홍길동',
  age: 20
}


console.log("---------------------------------------------------------------");

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
