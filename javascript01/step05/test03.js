/* 주제: 객체 - 변수에 저장하는 것은 객체의 주소이다.

*/

"use strict"

var names1 = ["홍길동","임꺽정","유관순"];
var names2 = names1;

//배열을 만들고 변수에  배열의 주소를 저장한다.

names1[5] = '윤봉길'
console.log(names1);
console.log(names2);
console.log("---------------------------------------------------------")

var obj1 = {"name": "홍길동", "name2": "임꺽정", "name3":"유관순"}
var obj2 = obj1
obj2.name = "오호라"

console.log(obj1);
console.log(obj2);

console.log("---------------------------------------------------------")

var v1 = 100
var v2 = v1
v1 = 200
console.log(v1, v2);

console.log("---------------------------------------------------------")

v1 = true
v2 = v1
v1 = false
console.log(v1, v2)

console.log("---------------------------------------------------------")

v1 = "홍길동"
v2 = v1
v1 = "임꺽정"
//typeof 하면은 string으로 나오지만 실질적으로 메모리를 2개쓴다.
//주소를 넘기는 방식이다 값을 바꿀수가없다.
//immutable object 값을 변경할수없는 객체
console.log(v1, v2)

//숫자는 주소가 아닌 값을 주고받는다.

console.log("---------------------------------------------------------")

v1 = "홍길동"
v2 = v1.replace("동", "순")
console.log(v1, v2);

console.log("---------------------------------------------------------")

v1 = "오호라... 그렇군요... 이렇게 긴 문자열을 값으로 다룬다면 문제가 되겠네요"
v2 = v1
console.log(v1);
console.log(v2);
