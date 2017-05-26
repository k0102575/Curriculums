/* 주제: 객체 -소개
- 객체는 문자열로 이름을 붙인 값들의 집합이다.
- 배열은 숫자로 이름을 붙인 값들의 집합이다.
*/

"use strict"

var names = [];
names[0] = '홍길동'
names[1] = '임꺽정'
names[2] = '유관순'
names[5] = '윤봉길'
console.log(names);

console.log("---------------------------------------------------------")

var name = {}
name["name"] = "홍길동"
name['name2'] = "임꺽정"
name.name3 = "유관순"

var v = "name4"
name[v] = "윤봉길"
console.log(name);
console.log(name.name);
console.log(name["name"]);
console.log(name['name']);
var v2 = 'name'
console.log(name[v2]);

/* 객체에 저장하는 값을 보통 "프로퍼티(property)"라고 부른다.
  값을 저장할 때 사용하는 문자열을 "프로퍼티명"이라고 부른다
  프로퍼티 이름에 특수문자나 공백 등이 포함되어 있을 때는
  "객체.프로퍼티명"형식으로 값을 저장할수 없다.
  "객체[프로퍼티명]"형식으로 값을 저장해야만 한다.
*/

name['first name'] = '오호라'
name['hello^^;'] = '아하'

console.log(name['first name']);
console.log(name['hello^^;']);
