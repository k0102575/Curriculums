"use strict"

/* 6단계:
+ 사용자로부터 command 값 입력 받기
+ 반복하기
+ 'quit' 명령 처리하기
+ 'list', 'add', 'delete' 명령 구분하기
+ 명령을 구분할 때 if 문 대신 switch 문 사용
+ 'list' 명령 처리하기
+ 'add' 명령 처리하기
*/
var studentList = [["홍길동1", 100, 100, 100, 300, 100],
  ["홍길동2", 90, 90, 90, 270, 90],
  ["홍길동3", 80, 80, 80, 240, 80],
  ["홍길동4", 70, 70, 70, 210, 70]
]

var prompt = require('prompt');

prompt.start();

start();

function start(){

var prompt = require('prompt');

prompt.start();

prompt.get(['command'],function(err,result){

  switch (result.command) {
    case "quit":
      console.log("안녕히 가세요!");
      return;
    case 'list':
      console.log("[학생 성적 목록]");
      for (var student of studentList) {
        console.log(student[0] + "," + student[1] + "," + student[2]
        + "," + student[3] + "," + student[4] + "," + student[5]);
      }
      break;
    case 'add':
      console.log("[학생 성적 입력]");
      prompt.get(['name','kor','eng','math'], function (err,result) {
      var student = [result.name,parseInt(result.kor),
        parseInt(result.kor),parseInt(result.eng),
        parseInt(result.math)]
      student[4] = student[1] + student [2] + student [3]
      student[5] = student[4] /3

      studentList[studentList.length] = student

      console.log("");
      console.log('입력되었습니다.');

      start();
    })
    return;
    case 'delete':
      console.log("[학생 성적 삭제]");
      break;
    default:
      console.log("학생 메뉴는 없습니다");
  }
start();
}
)
}
