/* 템블릿 엔징 사용하기 - 기본 사용법

*/

const handlebars = require('handlebars')

var str = '나는 {{name}}입니다.'
var data = {
  name: '홍길동'
}

// 1)
var template = handlebars.compile(str)

// 2)
var result = template(data)

console.log(result)
