/* 데이터 변경 명령: update

*/
const mysql = require('mysql')

const connection = mysql.createConnection({
  database: 'webappdb',
  user : 'webapp',
  password: '1111'
})

connection.connect()

connection.query('update memb set tel="2222-2222" where name="aaa" ', function (error, results){  // MySQL에서 암호로 데이터 베이스에 저장하는 함수가 password()
  console.log('결과를 가져왔음!')
  if (error) throw error;  //에러를 콘솔창으로 출력한다고 보면된다.

  console.log(results)
})

connection.end()
console.log('MySQL 서버와의 연결끊기가 예약되었음!')
