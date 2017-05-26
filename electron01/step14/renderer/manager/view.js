"use strict"
window.$ = window.jQuery = require('jquery')
var managerService = require('electron').remote.getGlobal('managerService')


var fiNo = $('#fi-no'),
    fiEmail = $('#fi-email'),
    fiName = $('#fi-name'),
    fiTel = $('#fi-tel'),
    fiPosi = $('#fi-posi'),
    fiFax = $('#fi-fax'),
    fiPath = $('#fi-path'),
    fiPwd = $('fi-pwd');

if (location.search == "") {
  $('.bit-view').css('display', 'none')
  $('.bit-new').css('display', '')

  $('#add-btn').click(function() {
    managerService.insert(
      {
        name: fiName.val(),
        tel: fiTel.val(),
        email: fiEmail.val(),
        posi: fiPosi.val(),
        fax: fiFax.val(),
        path: fiPath.val(),
        pwd: fiPwd.val()
      },
      function() {
        location.href = 'index.html'
      },
      function(error) {
        alert('매니저 등록 중 오류 발생!')
        throw error;
    }) //insertMember()
  }) // click()

} else { // 기존 사용자 정보를 가져온다.
  $('.bit-new').css('display', 'none')
  var no = location.search.substring(1).split('=')[1]
  console.log(no)


  managerService.detail(no,
    function(result) {
      var manager = result
      fiNo.text(manager.mno)
      fiEmail.val(manager.email)
      fiName.val(manager.name)
      fiTel.val(manager.tel)
      fiPosi.val(manager.posi)
      fiFax.val(manager.fax)
      fiPath.val(manager.path)
    },
    function(error) {
      alert('매니저 데이터 가져오는 중 오류 발생!')
      throw error
  })

  $('#upd-btn').click(function() {
    managerService.update(
      {
        "no": no,
        "name": fiName.val(),
        "tel": fiTel.val(),
        "email": fiEmail.val(),
        "posi": fiPosi.val(),
        "fax": fiFax.val(),
        "path": fiPath.val(),
        "pwd": fiPwd.val()
      },
      function(result) {
        location.href = 'index.html'
      },
      function(error) {
        alert('매니저 기본 데이터 변경 중 오류 발생!')
        throw error;
    })//update()
  }) //click()

  $('#del-btn').click(function() {
    managerService.delete(no,
      function(result) {
        location.href = 'index.html'
      },
      function(error) {
        alert('매니저 기본 데이터 삭제 중 오류 발생!')
        throw error;
    })
  }) // click()
} // else

$('#lst-btn').click(function() {
  location.href = "index.html"
})
