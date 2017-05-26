/* GET, 
*/

var miniExpress = require('./mini-express')

var app = miniExpress()


app.get('/get_test.do', function(request, response) {
  response.writeHead(200, {'Content-type': 'text/text;charset=UTF-8'})
  response.write('GET 요청 처리!')
  response.write('name=' + request.query.name)
  response.write('age=' + request.query.age)
  response.write('tel=' + request.query.tel)
  response.end()
})

app.post('/post_test.do', function(request, response) {
  response.writeHead(200, {'Content-type': 'text/text;charset=UTF-8'})
  response.write('POST 요청 처리!')
  response.write('name=' + request.query.name)
  response.write('age=' + request.query.age)
  response.write('tel=' + request.query.tel)
  response.end()
})

app.listen(8888, function() {
  console.log('서버가 시작되었습니다.')
}) // listen
