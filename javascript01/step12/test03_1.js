/* 요청 정보 다루기
*/

"use strict"

const http = require('http')

const server = http.createServer(function(request, response) {
  console.log('클라이언트 요청이 들어왔네!')

  // 요청 URL(클라이언트가 원하는 자원) 알아내기 
  console.log(request.url)

  response.writeHead(200, { // 응답헤더 지정
    'Content-type' : 'text/plain;charset=UTF-8'
  })

  response.write('안녕 친구들!')
  response.end();
})

server.listen(8888)

console.log('서버 실행중...')
