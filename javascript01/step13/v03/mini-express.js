/* 미니 Express 만들기
*/

var http = require('http')

var server = http.createServer(function(request, response) { // 서버객체를 리턴한다.
  response.end()
})

module.exports = function() {
  return {
    listen(port, cb) {
      server.listen(port, cb) 
    } // listen()
  } // return
}
