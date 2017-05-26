/* 요청 정보 다루기 - URL 분석기 사용
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

  var urlInfo = url.parse(request.url)  // 리퀘스트의 url이 아니라 위에 선언한 분석기를 통해 리퀘스트받은 url을 분석한다.
  // 예) http://localhost:8888/aaa/bbb/ccc.html?v1=xxx&v2=yyyy&v3=zzzz
  
  console.log('href=', urlInfo.href)
  console.log('pathname=', urlInfo.pathname)
  console.log('search=', urlInfo.search)
  console.log('query=', urlInfo.query)



  response.writeHead(200, {
    'Content-type' : 'text/plain;charset=UTF-8'
  })
  response.write('안녕 친구들!')
  response.end();
})

server.listen(8888)

console.log('서버 실행중...')
