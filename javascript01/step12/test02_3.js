/* HTTP 서버 만들기 - 응답 데이터의 콘텐츠 타입을 지정하기
*/

"use strict"

const http = require('http')

const server = http.createServer(function(request, response) {
  console.log('클라이언트 요청이 들어왔네!')

  response.writeHead(200, { // 응답헤더 지정 MIME 타입 브라우저에게 알려주는것
    'Content-type' : 'text/html;charset=UTF-8'
  })
  response.write('<html> \
  <head> \
    <title>테스트</title> \
  </head> \
  <body> \
    <h1>안녕 친구들!</h1> \
  </body> \
  </html>')
  response.end();
})

server.listen(8888)

console.log('서버 실행중...')
