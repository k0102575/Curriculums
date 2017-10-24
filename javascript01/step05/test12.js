/* 주제: 객체 - this 변수

*/

"use strict"

function f1() {
  console.log(this);
}

// new

new f1()

f1()

console.log("-------------------------------------------------------------")

var obj = {
  f2 : function() {
    console.log(this)
    }
}

obj.f2()
