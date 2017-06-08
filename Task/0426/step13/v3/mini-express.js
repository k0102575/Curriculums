/* 미니 Express 만들기 - 웹 서버를 만드는 코드를 캡슐화 한다.
*/
var http = require('http')

var server = http.createServer((request, response) => {
  response.end()
})

module.exports = () => {
  return {
    listen(port, cb){
      server.listen(port, cb)


    } // listen()
  } // return
}
