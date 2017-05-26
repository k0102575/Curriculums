/* 주제: 객체 -

*/

"use strict"

//1)
var a = 10;
var b = 20;
var c = 30;
console.log(a, b, c)

//2)
var i = 10, j = 20,k =30
console.log(i, j, k)

//3)
var[x,y,z] = [10,20,30]
console.log(x, y, z)

//4)
var obj = {
  name: '홍길동',
  age: 20,
  tel: '1111-1111',
  email: 'hong@test.com'
}

/*
var name = obj.name
var age = obj.age
console.log(name,age);
*/

var {name, age} = obj
//이객체의 name값(프로퍼티명)을 뽑겟다
//변수명과 객체의 프로퍼티명이 같아야한다  다른변수
console.log(name, age)

var {tel, email} = obj
//프로퍼티명
console.log(tel, email);

/*
const {app, BrowserWindow} = require('electron')
                            함수를 선언하면 객체 주소를 가져온다
                            함수가 리턴하는값이 객체
리턴받아온 객체주소에서 app 과 broserwindows 항목을 뽑아온다. 
*/
