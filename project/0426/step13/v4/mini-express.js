/* 미니 Express 만들기 - GET, POST 요청을 다루는 함수를 관리하는 기능 추가
*/
var http = require('http')
var url = require('url')
var path = require('path')
var fs = require('fs')

var getHandler = {}
var postHandler = {}

var server = http.createServer((request, response) => {
  response.end()
})

module.exports = function() {
  return {
    // 주어진 url로 GET 요청이 들어왔을 때 호출될 함수를 등록한다.
    get(url, handler) {
      getHandler[url] = handler
    },

    // 주어진 url로 POST 요청이 들어왔을 때 호출될 함수를 등록한다.
    post(url, handler) {
      postHandler[url] = handler
    },

    // 웹서버를 시작시킨다.
    listen(port, cb) {
      server.listen(port, cb)
    }
  }
}
