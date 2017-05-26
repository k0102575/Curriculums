/* 데이터 조회 명령: select ~ from ~

*/
const mysql = require('mysql')

const connection = mysql.createConnection({
  database: 'webappdb',
  user : 'webapp',
  password: '1111'
})
console.log('MySQL 서버에 연결할 도구 생성완료!');

connection.connect()
console.log('MySQL 서버와 연결됨!')

connection.query('SELECT mno, name, tel from memb', function (error, results){
  console.log('결과를 가져왔음!')
  if (error) throw error;  //에러를 콘솔창으로 출력한다고 보면된다.

  //
  for (var row of results)
  console.log(row.mno, row.name, row.tel)
}
)

connection.end()
console.log('MySQL 서버와의 연결끊기가 예약되었음!')
