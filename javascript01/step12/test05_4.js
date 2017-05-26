/* 템블릿 엔진 사용하기 - 외부에서 템플릿 소스를 가져오기 II

*/

const fs = require('fs')
const path = require('path')
const handlebars = require('handlebars')

var templatePath = path.join(__dirname, 'test05_3_template.txt')

var data = {
  name: '홍길동'
}

//비동기 방식이다
fs.readFile(templatePath, 'utf8', (err, src) => { // Arrow Function
  if(err) throw error;

  var template = handlebars.compile(src)
  var result = template(data)
  console.log(result)
})
