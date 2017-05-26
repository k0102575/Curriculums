"use strict"

const mysql = require('mysql')

const connection = mysql.createConnection({
  database: 'webappdb',
  user : 'webapp',
  password: '1111'
})

connection.connect()
window.$ = window.jQuery = require('jquery')

var fiNo = $('#fi-no'),
    fiEmail = $('#fi-email'),
    fiName = $('#fi-name'),
    fiTel = $('#fi-tel'),
    fiSchoolName = $('#fi-school-name'),
    fiWorking = $('#fi-working');

if (location.search == ""){
  $('.bit-view').css('display','none')

  $('.bit-new').css('display', '')

$('#add-btn').click(function(){
  connection.query(
    'insert into memb(email, name, tel, pwd) values(?, ?, ?, password("?"))',
    [fiEmail.val(), fiName.val(), fiTel.val(), "1111"],
    function(error, results) {
      if(error){
        alert('멤버 정보를 추가하는데 실패')
        throw error;
      }
      connection.query(
      'insert into stud(sno, work, schl_nm) values(?, ?, ?)',
      [
      results.insertId,
      (fiWorking.prop('checked') ? 'Y' : 'N'),
      fiSchoolName.val()
      ],
      function(error, results) {
       if (error){
         alert('학생 정보를 추가 하는데 실패')
         throw error
       }
         location.href = 'index.html'

      }) //connection.query
    }) // connection.query

}) //click

} else {
  var no = (location.search.substring(1).split('=')[1])

  $('.bit-new').css('display','none')

  connection.query(
    'select m.mno, m.email, m.name, m.tel, s.schl_nm, s.work \
    from memb m inner join stud s on m.mno = s.sno \
    where mno = ?',
    [no],
   function(error, results) {
     if (error){
       alert('데이터를 조회하는데 오류!')
       throw error;
     } else {
       var student = results[0]
       fiNo.text(student.mno)
       fiEmail.val(student.email)
       fiName.val(student.name)
       fiTel.val(student.tel)
       fiSchoolName.val(student.schl_nm)
       fiWorking.attr('checked', student.work == "Y" ? true : false )
     } //else
  }) //connection.query()

  $('#upd-btn').click(function (){

    connection.query(
      'update memb set name = ?, email = ?, tel = ? where mno =' + no,
      [
        fiName.val(),
        fiEmail.val(),
        fiTel.val()
      ],
      function(error, results) {
        if(error){
          alert('멤버 변경 실패')
          throw error
        }
        connection.query(
        'update stud set schl_nm = ?, work = ? where sno =' + no,
        [
          fiSchoolName.val(),
          (fiWorking.prop('checked') ? 'Y' : 'N')
        ],
        function(error, results) {
        if(error){
          alery('학생 변경 실패')
          throw error
        }
        location.href = "index.html"
        }) //connection.query

      }) // connection.query
  }) // click

  $('#del-btn').click(function (){
    connection.query(
      'delete from stud where sno = ?',
      [no],
      function(error, results) {
        if (error){
          alert('학생 정보를 삭제하는데 실패')
          throw error
        }
        connection.query(
          'delete from memb where mno = ?',
          [no],
          function(error, results) {
            if(error){
              alert('멤버 정보를 삭제하는데 실패')
            }
            location.href = 'index.html'
          }) // connection.query
    }) //connection.query
}) // click

} //else

$('#lst-btn').click(function () {
  location.href = "index.html"
})
