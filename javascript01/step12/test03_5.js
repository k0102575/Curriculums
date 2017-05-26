/* 요청 정보 다루기 - URL 응용
*/

"use strict"

const http = require('http')
const url = require('url')

const server = http.createServer(function(request, response) {
  if (request.url == '/favicon.ico'){
    response.end();
    return;
  }

  console.log('클라이언트 요청이 들어왔네!')

  response.writeHead(200, {
    'Content-type' : 'text/plain;charset=UTF-8'
  })

  var urlInfo = url.parse(request.url,true)

  if(urlInfo.pathname != '/hello'){
    response.end('잘못된 URL 입니다.')
    return;
  }


  var name = urlInfo.query.name


  response.write(name + '님 안녕하세요!')
  response.end();
})

server.listen(8888)

console.log('서버 실행중...')
