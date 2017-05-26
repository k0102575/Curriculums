/* 기존 코드에 새 서비스 추가
*/

"use strict"

const http = require('http')
const url = require('url')
const qs = require('querystring')

const server = http.createServer(function(request, response) {
  response.writeHead(200, {'Content-type' : 'text/plain;charset=UTF-8'})
  var urlInfo = url.parse(request.url,true)

  if (urlInfo.pathname == '/get.do'){
    response.write('GET 요청 처리!\n')
    response.write('name= ' + urlInfo.query.name + '\n')
    response.write('age= ' + urlInfo.query.age + '\n')
    response.write('tel= ' + urlInfo.query.tel + '\n')
    response.end();
  } else if (urlInfo.pathname == '/post.do') {
    var buf = ''

    request.on('data', (data) => {
      buf += data
    })
    request.on('end', () => {
      var params = qs.parse(buf)
      response.write('POST 요청 처리!\n')
      response.write('name= ' + params.name + '\n')
      response.write('age= ' + params.age + '\n')
      response.write('tel= ' + params.tel + '\n')
      response.end();
    })
  } else if(urlInfo.pathname == '/hello.do'){
    response.write('안녕하세요!')
    response.end()
  } else {
  response.write('해당 URL을 지원하지 않습니다.')
  response.end()
}

}) //createServer

server.listen(8888)

console.log('서버 실행중...')
