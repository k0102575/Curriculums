/* 주제: 객체 - 함수를 이용하여 객체를 생성하기

*/

// name:name  왼쪽이 프로퍼티명  오른쪽 변수에 있는 값을 꺼내서 넣는다.
// 직접입력하는값 글자 그대로 입력  Literal

"use strict"

function createScore(name, kor, eng, math) {
  return {
    name: name,
    kor: kor,
    eng: eng,
    math: math,
    sum: kor + eng + math,
    aver: (kor + eng + math) / 3
  }
}

//객체를 리턴하는게 아니라 객체 주소를 리턴한다.

console.log("--------------------------------------------------------------")

var scores2 = [
  createScore("홍길동1", 100, 100, 100),
  createScore("홍길동2", 90, 90, 90),
  createScore("홍길동3", 80, 80, 80),
  createScore("홍길동4", 70, 70, 70),
  createScore("홍길동5", 60, 60, 60)
  //함수를 저장하는게 아니라 함수를 호출한후 리턴값을 놓는다.
]

console.log("홍길동3의 총점은?", scores2[2].sum)
