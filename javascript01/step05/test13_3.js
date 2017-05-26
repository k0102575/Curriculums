/* 주제: 객체 - this 변수의 활용

*/

"use strict"

var obj 1 = {
  v1 : 100,
  f1() {
    console.log(this.v1)
    return function() {}{

      console.log('this')
      console.log('hi')
    }
    ]
  }
}

var f2 = obj1 f1()
f2p = 
