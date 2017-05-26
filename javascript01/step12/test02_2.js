/* HTTP 서버 만들기 - 응답 데이터의 콘텐츠 타입을 지정하기
*/

"use strict"

const http = require('http')

const server = http.createServer(function(request, response) {
  console.log('클라이언트 요청이 들어왔네!')

  response.writeHead(200, { // 응답헤더 지정
    'Content-type' : 'text/plain;charset=UTF-8'
  })
  response.write('Hello World')
  response.write('안녕 친구들!')
  response.end();
})

server.listen(8888)

console.log('서버 실행중...')
