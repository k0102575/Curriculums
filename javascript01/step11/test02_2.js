/* 데이터 추가 명령: insert
insert into 테이블명(컬럼명, 컬렁명, ...)
values(값, 값, ...)
*/
const mysql = require('mysql')

const connection = mysql.createConnection({
  database: 'webappdb',
  user : 'webapp',
  password: '1111'
})

connection.connect()

connection.query('insert into memb(name, email, tel, pwd)' +
                 'values("aaa", "aaa2@test.com", "111-1111", password(1111))', function (error, results){  // MySQL에서 암호로 데이터 베이스에 저장하는 함수가 password()
  console.log('결과를 가져왔음!')
  if (error) throw error;  //에러를 콘솔창으로 출력한다고 보면된다.

  console.log(results)
}
)

connection.end()
console.log('MySQL 서버와의 연결끊기가 예약되었음!')
