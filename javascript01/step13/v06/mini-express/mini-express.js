/* 미니 Express 만들기 - 정적 파일을 처리하는 기능 추가
*/

var http = require('http')
var url = require('url')
var path = require('path')
var fs = require('fs')
var qs = require('querystring')

var envVars = {}
var getHandler = {}
var postHandler = {}

function notFound(request, response) {
  response.writeHead(200, {'Content-type' : 'text/html;charset=UTF-8'})

  fs.readFile(path.join(__dirname, './html/http-404.html'), function (err, data) {
    if (err) throw err
    response.end(data)
  })
} // notFound()

function isStaticResource(method, servicePath) {
  if (method != 'GET'){
    return false
  }

  if (envVars.static_dir) {

    return fs.existsSync(path.join(__dirname, '..', envVars.static_dir, servicePath))
  }
  return false
} // isStaticResource()

function processStaticResource(servicePath, response) {
  var filePath = path.join(__dirname, '..', envVars.static_dir, servicePath)
  fs.readFile(filePath, function(err, data) {
    if (err) {
      response.write('URL 자원 처리중 오류발생')
      response.end()
      return
    }
      response.end(data)

  }) // readFile()
} // processStaticResource()

function findHandler(method, servicePath) {
  if (method == 'GET') {
    return getHandler[servicePath]
  } else if(method == 'POST') {
    return postHandler[servicePath]
  }
  return null
} // findHandler()

var server = http.createServer(function(request, response) { // 서버객체를 리턴한다.
  var urlInfo = url.parse(request.url, true)

  if (isStaticResource(request.method, urlInfo.pathname)) {
    processStaticResource(urlInfo.pathname, response)
    return
  }

  var handler = findHandler(request.method, urlInfo.pathname)

  if (handler) {
    if (request.method == 'GET'){

      request.query = urlInfo.query
      handler(request, response)

    } else if (request.method == 'POST') {

      var queryString = ''

      request.on('data', function(data){
        queryString += data
      })  //request.on(data)

      request.on('end', function() {
        request.query = qs.parse(queryString)
        handler(request,response)
      }) //request.on(end)
    }
  } else {
    notFound(request, response)
  }

}) // createServer

module.exports = function() {
  return {
    use(name, value) {
      envVars[name] = value
    }, // use()

    get(url, handler){
      getHandler[url] = handler
    }, // get()

    post(url, handler){
      postHandler[url] = handler
    }, // post()

    listen(port, cb) {
      server.listen(port, cb)
    } // listen()

  } // return
}
