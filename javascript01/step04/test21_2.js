"use strict"

/* 2단계:
+ 사용자로부터 command 값 입력 받기
+ 반복하기
*/

var prompt = require('prompt');

prompt.start();

start();

function start(){

var prompt = require('prompt');

prompt.start();

prompt.get(['command'],function(err,result){
  console.log(result.command);

start();

}
)
}





//
