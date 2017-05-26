/* Get 요청과 Post 요청의 데이터 다루기
*/

"use strict"

const http = require('http')
const url = require('url')
const qs = require('querystring')

const server = http.createServer(function(request, response) {
  response.writeHead(200, {
    'Content-type' : 'text/plain;charset=UTF-8'
  })

  var urlInfo = url.parse(request.url,true)
  if (urlInfo.pathname != '/post.do'){
    response.end()
    return;
  }

// 1)
  var buf = ''

// 2)

  request.on('data', (data) => {
    buf += data
  })

// 3)

  request.on('end', () => {

    var params = qs.parse(buf)

    response.write('name= ' + params.name + '\n')
    response.write('age= ' + params.age + '\n')
    response.write('tel= ' + params.tel + '\n')
    response.end();
  })

}) //createServer

server.listen(8888)

console.log('서버 실행중...')
