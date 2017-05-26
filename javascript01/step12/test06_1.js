/* Get 요청과 Post 요청의 데이터 다루기
*/

"use strict"

const http = require('http')
const url = require('url')

const server = http.createServer(function(request, response) {
  var urlInfo = url.parse(request.url,true)
  if (urlInfo.pathname != '/get.do'){
    response.end()
    return;
  }

  response.writeHead(200, {
    'Content-type' : 'text/plain;charset=UTF-8'
  })

  response.write('name= ' + urlInfo.query.name + '\n')
  response.write('age= ' + urlInfo.query.age + '\n')
  response.write('tel= ' + urlInfo.query.tel + '\n')

  response.end();
}) //createServer

server.listen(8888)

console.log('서버 실행중...')
