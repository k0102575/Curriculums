/* Express 프레임 워크 적용 - AJAX 웹 프로그래밍 방식
*/

var express = require('express')
var bodyParser = require('body-parser')
var path = require('path')
var cons = require('consolidate')

var app = express()
app.use(express.static('public'))
app.use(bodyParser.urlencoded({extended: false}))

app.use('/student', require('./control/student-control'))

app.use('/teacher', require('./control/teacher-control'))

app.use('/manager', require('./control/manager-control'))

app.use('/lecture', require('./control/lecture-control'))

app.listen(8888, function() {
  console.log('서버가 시작되었습니다.')
}) // listen
