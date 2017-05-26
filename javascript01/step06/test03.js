/* 주제: Array() - 기본 사용법

*/
//1) 함수로 사용해 보자!
//
var arr1 = new Array();  console.log(arr1);
console.log(typeof arr1);

var arr2 = [] // new Array()의 단축문법
console.log(arr2)
console.log(typeof arr2)
//String 과는 다르다 타입이 같다
//굳이 위에꺼 쓰지마라 밑에꺼 써라

var arr3 = ['홍길동','임꺽정','유관순','안중근']

console.log("배열 길이 = ", arr3.length) // 배열 객체의 저장된 항목의 개수를 알아내기
arr3.push('윤봉길')
arr3.push('김구', '신채호')
console.log("배열 길이 = ", arr3.length) // 배열 객체의 저장된 항목의 개수를 알아내기

var value = arr3.pop()
console.log(arr3)
console.log("---------------------------------------------------------------");

value = arr3.shift()
console.log(arr3);
console.log("---------------------------------------------------------------");

value = arr3.splice(2, 1)
console.log(arr3)

value = arr3.splice(1, 3)
console.log(arr3)


//함수 하나에 다양한 기능들이 있따.
// api문서에서 잘 찾아서 개발해야된다.
