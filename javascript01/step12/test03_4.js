/* 요청 정보 다루기 - URL 분석기 사용 II
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

  // 예) http://localhost:8888/aaa/bbb/ccc.html?v1=xxx&v2=yyyy&v3=zzzz
  var urlInfo = url.parse(request.url,true)

  console.log('query=', urlInfo.query)


  console.log('v1=', urlInfo.query.v1)
  console.log('v2=', urlInfo.query.v2)
  console.log('v3=', urlInfo.query.v3)

  response.writeHead(200, {
    'Content-type' : 'text/plain;charset=UTF-8'
  })
  response.write('안녕 친구들!')
  response.end();
})

server.listen(8888)

console.log('서버 실행중...')
