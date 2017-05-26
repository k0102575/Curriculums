/* 주제: 객체 - this 변수의 활용

*/

"use strict"


/*
var obj2 = {}
obj2.v1 = 0
obj2.f1 = function() {
  v1 = 100
}   이방식과 밑에 방식이 같다 자꾸 눈에 익혀라

console.log(obj2);
*/

var obj = {
  v1: 0,
  f1: function () {
    // 이 함수가 소속된 객체의 변수를 사용할 때
    this.v1 = 100
    //자바는 this.을 생략을 해도 된다.
    //this는 꼭 써야되는데 자바는 컴파일 과정에서 this.를 붙인다.
  }
}

obj.f1()  //객체 안의 주소를 가지고 호출하는것 객체를 찾아가서 f1방에 있는놈을
//보충 정보가 추가된다 f1은 신경안써도 된다.

console.log(obj.v1);
