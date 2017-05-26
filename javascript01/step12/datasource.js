//connection 객체를 준비
"use strict"
const mysql = require('mysql')
const connection = mysql.createConnection({
  database: 'webappdb',
  user: 'webapp',
  password: '1111'
})
connection.connect()

/*
module.exports.getConnection = function() {
  return connection
}
*/


module.exports = {
  getConnection() {
    return connection
  }
}
