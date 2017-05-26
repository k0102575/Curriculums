/* 요청 정보 다루기 - Quiz!
계산기 서비스를 구현하라!
요청 예) http://localhost:8888/calculator?a=100&b=200&op=-
출력 결과 예)
100 - 200 = -100
=> op에 들어갈 연산자: +, -, *, /, %
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

  response.writeHead(200, {
    'Content-type' : 'text/plain;charset=UTF-8'
  })

  //
  // if(urlInfo.pathname != '/hello'){
  //   response.end('잘못된 URL 입니다.')
  //   return;
  // }

  var urlInfo = url.parse(request.url,true),
      a = parseInt(urlInfo.query.a),
      b = parseInt(urlInfo.query.b),
      op = urlInfo.query.op

  switch (op) {
    case '+':{
    response.write(a + ' + ' + b + ' = ' + (a+b) )
    break;
    }
    case '-':{
    response.write(a + ' - ' + b + ' = ' + (a-b) )
    break;
    }
    case '*':{
    response.write(a + ' * ' + b + ' = ' + (a*b) )
    break;
    }
    case '/':{
    response.write(a + ' / ' + b + ' = ' + (a/b) )
    break;
    }
    case '%':{
    response.write(a + ' % ' + b + ' = ' + (a%b) )
    break;
    }
    default:
    response.write('잘못된 연산자를 입력했습니다')
  }



  response.end();
})

server.listen(8888)

console.log('서버 실행중...')
