/* 기존 코드에 새 서비스 추가 II
*/

"use strict"

const http = require('http')
const url = require('url')
const qs = require('querystring')

var handlerMapping = {}

handlerMapping['/get.do'] = (request, response) => {
  response.write('GET 요청 처리!\n')
  response.write('name= ' + request.query.name + '\n')
  response.write('age= ' + request.query.age + '\n')
  response.write('tel= ' + request.query.tel + '\n')
  response.end();
} //get()

handlerMapping['/post.do'] = (request, response) => {
  var buf = ''

  request.on('data', (data) => {
    buf += data
  })

  request.on('end', () => {
    var params = qs.parse(buf)
    response.write('POST 요청 처리!\n')
    response.write('name= ' + params.name + '\n')
    response.write('age= ' + params.age + '\n')
    response.write('tel= ' + params.tel + '\n')
    response.end();
  })

} // post()

handlerMapping['/hello.do'] = (request, response) =>{
  response.write('안녕하세요!')
  response.end()
} // hello()

function notFound(request, response){
  response.write('해당 URL을 지원하지 않습니다.')
  response.end()
} //notFound()

const server = http.createServer(function(request, response) {
  response.writeHead(200, {'Content-type' : 'text/plain;charset=UTF-8'})
  var urlInfo = url.parse(request.url,true)
  if (request.method == "GET"){
  request.query = urlInfo.query
}
  var fn = handlerMapping[urlInfo.pathname]
  if (fn != undefined) {
    fn(request, response)
  } else {
    notFound(request, response)
  }

//   if (handlerMapping[urlInfo.pathname]) {
//     handlerMapping[urlInfo.pathname](request, response)
//   } else {
//     notFound(request, response)
// }

}) //createServer

server.listen(8888)

console.log('서버 실행중...')
