"use strict"

/* 3단계:
+ 사용자로부터 command 값 입력 받기
+ 반복하기
+ 'quit' 명령 처리하기
*/
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



  }
start();
}
)
}
