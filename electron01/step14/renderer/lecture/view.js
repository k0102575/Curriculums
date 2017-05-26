
"use strict"

window.$ = window.jQuery = require('jquery')

var managerService = require('electron').remote.getGlobal('managerService')
var classroomService = require('electron').remote.getGlobal('classroomService')
var lectureService = require('electron').remote.getGlobal('lectureService')

managerService.listName(function(results) {
  var fiManager = $('#fi-manager')
  for (var r of results){
    $('<option>').val(r.mrno).text(r.name).appendTo(fiManager)
  }
}, function(error) {
  alert('매니저 이름 로딩 중 오류 발생!')
  throw error;
})

classroomService.listName(function(results) {
  var fiClassroom = $('#fi-classroom')
  for (var r of results){
    $('<option>').val(r.crmno).text(r.name).appendTo(fiClassroom)
  }
}, function(error) {
  alert('강의실 이름 로딩 중 오류 발생!')
  throw error;
})

var fiNo = $('#fi-no'),
    fiTitl = $('#fi-titl'),
    fiDscp = $('#fi-dscp'),
    fiSdt = $('#fi-sdt'),
    fiEdt = $('#fi-edt'),
    fiQty = $('#fi-qty'),
    fiThrs = $('#fi-thrs'),
    fiPric = $('#fi-pric'),
    fiClassroom = $('#fi-classroom'),
    fiManager = $('#fi-manager')

if (location.search == ""){
  $('.bit-view').css('display','none')

  $('.bit-new').css('display', '')

$('#add-btn').click(function(){
  if (!validateForm()) {
    alert('필수 항목의 값이 비어있습니다.')
    return;
  }
  lectureService.insert(
  {
    titl : fiTitl.val(),
    dscp : fiDscp.val(),
    sdt : fiSdt.val(),
    edt : fiEdt.val(),
    qty : fiQty.val(),
    thrs : fiThrs.val(),
    pric : fiPric.val(),
    classroom : (fiClassroom.val() == '0' ? null : fiClassroom.val()),
    manager : (fiManager.val() == '0' ? null : fiManager.val())
  },

  function() {
    location.href = 'index.html'
  },

  function(error) {
    alert('학생 데이터 등록 중 오류 발생!')
    throw error;
  }) // insert()

}) //click()


} else {
  $('.bit-new').css('display','none')

  var no = (location.search.substring(1).split('=')[1])

  lectureService.detail(
    no,
    function(lecture) {
      fiNo.text(lecture.lno)
      fiTitl.val(lecture.titl)
      fiDscp.val(lecture.dscp)
      fiSdt.val(lecture.sdt2)
      fiEdt.val(lecture.edt2)
      fiQty.val(lecture.qty)
      fiThrs.val(lecture.thrs)
      fiPric.val(lecture.pric)
      fiClassroom.val(lecture.crmno)
      fiManager.val(lecture.mrno)
    },
    function(error) {
      if (error){
        alert('강의 데이터 가져오는중 오류 발생!')
        throw error
      }
    }) //selectOneStudent

  $('#upd-btn').click(function (){
    if (!validateForm()) {
      alert('필수 항목의 값이 비어있습니다.')
      return;
    }
    lectureService.update(
    {
      no : fiNo.text(),
      titl : fiTitl.val(),
      dscp : fiDscp.val(),
      sdt : fiSdt.val(),
      edt : fiEdt.val(),
      qty : fiQty.val(),
      thrs : fiThrs.val(),
      pric : fiPric.val(),
      classroom : (fiClassroom.val() == '0' ? null : fiClassroom.val()),
      manager : (fiManager.val() == '0' ? null : fiManager.val())
    },
    function(result) {
      location.href='index.html'
    },
    function(error) {
    alert('강의 데이터 변경 중 오류 발생!')
    throw error;
    }) //studentService.update()
}) //click()


  $('#del-btn').click(function (){
  lectureService.delete(no,
  function(result) {
    location.href = 'index.html'
  }, function(error) {
    alert('강의 데이터 삭제 중 오류 발생!')
    throw error;
  }) // studentService.delete

}) // click

} //else

$('#lst-btn').click(function () {
  location.href = "index.html"
})


function validateForm(){
  if (fiTitl.val() == '' ||
      fiDscp.val() == '' ||
      fiSdt.val() == '' ||
      fiEdt.val() == '' ||
      fiQty.val() == '' ||
      fiThrs.val() == ''){
        return false;
      } else {
        return true;
      }
}

//
