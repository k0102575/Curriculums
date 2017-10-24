"use strict"
var prompt = require('prompt');


var student = [["홍길동1",100,90,80,270,90],["홍길동2",100,90,80,270,90],
              ["홍길동3",100,90,80,270,90],["홍길동4",100,90,80,270,90],
              []];



function add() {
  prompt.start();
  prompt.get(['name','kor','eng','math'], function (err, result) {
    var name = String(result.name);
    var kor = parseInt(result.kor);
    var eng = parseInt(result.eng);
    var math = parseInt(result.math);
    student[4][0] = name;
    student[4][1] = kor;
    student[4][2] = eng;
    student[4][3] = math;
    student[4][4] = kor + eng + math;
    student[4][5] = ((kor + eng + math)/3);
  return start();
}
)};
  function splice(){
      prompt.start();
    prompt.get(['Number'], function (err, result) {
      var Number = parseInt(result.Number);
      student.spilce([no])
      return start();

}
)};

function start() {

prompt.start();

prompt.get(['command'], function (err, result) {
  var command = String(result.command);
  switch (command) {
  case "list":
  console.log("[학생 성적 목록]");
  console.log(student)

  return start();
  break;

  case "add":
    console.log("[학생 성적 입력]");
    add();
    break;


  case "delete":
    splice();

  console.log(no + "의 정보가 삭제되었습니다.");
  return start();
  break;

  case "quit":

  end();
  break;

  }


});
}

function end() {
  console.log("안녕히 가세요!");
}

start();
