/* HTTP 서버 만들기 - 클라이언트에게 응답하기
*/

"use strict"

// 1) 모듈 로딩
const http = require('http')

// 2) HttpServer 객체 생성
const server = http.createServer(function(request, response) {
  console.log('클라이언트 요청이 들어왔네!')

  // HTTP 응답을 완료한다.
  response.end();
})

// 3) 서버 실행
server.listen(8888)

console.log('서버 실행중...')
