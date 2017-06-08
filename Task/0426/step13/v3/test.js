var miniExpress = require('./mini-express')

var app = miniExpress()

console.log(app)

app.listen(8888, () => {
  console.log('서버가 시작되었습니다.')
})
