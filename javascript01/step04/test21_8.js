
var prompt = require('prompt')
var vowel = require('./test_21_vowel.js')

prompt.start()

var = information[
  ['홍길동1',100,100,100,300,100],
  ['홍길동2',90,90,90,270,90],
  ['홍길동3',80,80,80,240,80]
]

start()

function start(){
prompt.get(['command'],function(err,result){
  switch (result.command){
  case 'quit':
    console.log('끝났습니다!')
  return
  case 'list':
    vowel.doList()
  break
  case 'add':
    vowel.doAdd()
  return
  case 'delete':
    vowel.doDelete()
  return
  default:
    console.log("잘못 입력하셨습니다")
  }
  start()
}
)
}
