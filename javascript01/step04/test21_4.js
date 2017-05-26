"use strict"

/* 4단계:
+ 사용자로부터 command 값 입력 받기
+ 반복하기
+ 'quit' 명령 처리하기
+ 'list', 'add', 'delete' 명령 구분하기
*/

var prompt = require('prompt');

start();

function start(){
prompt.start();

prompt.get(['command'], function(err,result){
  console.log(result.command);
  if(result.command == 'quit'){
    console.log("안녕히 가세요!");
    return;
  }else if (result.command == 'list') {
    console.log("[학생 성적 목록]");
  }else if (result.command == 'add') {
    console.log("[학생 성적 입력]");
  }else if (result.commnad == 'delete') {
    console.log("[학생 성적 삭제]");
  }

start();
}
)
}
