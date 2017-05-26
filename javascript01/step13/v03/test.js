var miniExpress = require('./mini-express')
// express 자체가 웹서버를 만드는 독특한 모듈이 아니다.
// 원래 있던걸 포장하는것 뿐이 안된다.
// express 는 http 모듈없이는 사용이 안된다.

app = miniExpress()

// 그 함수에서 객체를 리턴한다  그 객체에 함수가 들어있다.

app.listen(8888, function() {
  console.log('서버가 시작되었습니다.')
}) // listen
