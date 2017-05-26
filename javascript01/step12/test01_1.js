/* HTTP 서버 만들기
*/
"use strict"
// 1) 모듈 로딩
const http = require('http')

// 2) HttpServer 객체 생성
// => 파라미터는 클라이언트 요청을 들어왔을 때 호출될 함수이다.
// => 즉 클라이언트에서 요청이 들어오면 파라미터로 넘긴 함수를 호출한다.
const server = http.createServer(function(request, response) {
  // 클라이언트가 요청을 햇을때는 값이 넘어온다. 요청에 관련된 객체와 응답에 관련된 객체
  console.log('클라이언트 요청이 들어왔네!')
})
// 3) 서버 실행
server.listen(8080)

console.log('서버 실행중...')
