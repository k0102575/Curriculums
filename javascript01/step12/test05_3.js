/* 템블릿 엔징 사용하기 - 외부에서 템플릿 소스를 가져오기 I

*/

const fs = require('fs')
const path = require('path')

var templatePath = path.join(__dirname, 'test05_3_template.txt')

//비동기 방식이다
fs.readFile(templatePath, 'utf8', (err, data) => { // Arrow Function
  if(err) throw console.error();
  console.log(data)
})
