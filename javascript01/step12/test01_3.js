/* HTTP 서버 만들기 - Single 스레드 방식
*/

"use strict"

// 1) 모듈 로딩
const http = require('http')

// 2) HttpServer 객체 생성
const server = http.createServer(function(request, response) {
  console.log('클라이언트 요청이 들어왔네!')

  // 요청이 들어오면 5초후에 응답을 완료한다.
  setTimeout(function() {
    response.end();
  },5000)

})

// 3) 서버 실행
server.listen(8888)

console.log('서버 실행중...')
