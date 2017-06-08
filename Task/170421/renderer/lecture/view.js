"use strict"
window.$ = window.jQuery = require('jquery')
var lectureService = require('electron').remote.getGlobal('lectureService')

var fiNo = $('#fi-no'),
    fiTitl = $('#fi-titl'),
    fiDscp = $('#fi-dscp'),
    fiSdt = $('#fi-sdt'),
    fiEdt = $('#fi-edt'),
    fiQty = $('#fi-qty'),
    fiPric = $('#fi-pric'),
    fiThrs = $('#fi-thrs'),
    fiCrmName = $('#fi-crm-name'),
    fiMgrName = $('#fi-mgr-name'),
    croomSelect = $('#fi-crm-name > select'),
    mgrSelect = $('#fi-mgr-name > select');

if (location.search == "") {
  $('.bit-view').css('display', 'none')
  $('.bit-new').css('display', '')


    lectureService.detail2(no,
      function(result) {
      for (var select of result){
        $("<option value='" + select.crmno + "'>").html("" + select.crmname +
        "")
        .appendTo(croomSelect)
      } //for
  },
        function(error) {
        alert('강의실 데이터 가져오는 중 오류 발생!')
        throw error
    })

      lectureService.detail3(no,
        function(result) {
        for (var select of result){
          $("<option value='" + select.mrno + "'>").html("" + select.mgrname +
          "")
          .appendTo(mgrSelect)
        } //for
        },
      function(error) {
        alert('매니저 데이터 가져오는 중 오류 발생!')
        throw error
    })

  $('#add-btn').click(function() {
    lectureService.insert(
      {
        titl: fiTitl.val(),
        dscp: fiDscp.val(),
        sdt: fiSdt.val(),
        edt: fiEdt.val(),
        qty: fiQty.val(),
        pric: fiPric.val(),
        thrs: fiThrs.val(),
        crmno: croomSelect.val(),
        mrno: mgrSelect.val()
      },
      function() {
        location.href = 'index.html'
        console.log(croomSelect.val(),mgrSelect.val())

      },
      function(error) {
        alert('매니저 등록 중 오류 발생!')
        throw error;
    }) //insertMember()
  }) // click()

} else { // 기존 사용자 정보를 가져온다.
  $('.bit-new').css('display', 'none')
  var no = location.search.substring(1).split('=')[1]

  lectureService.detail(no,
    function(result) {
      var lecture = result
      fiNo.text(lecture.lno)
      fiTitl.val(lecture.titl)
      fiDscp.val(lecture.dscp)
      fiSdt.val(lecture.sdt)
      fiEdt.val(lecture.edt)
      fiQty.val(lecture.qty)
      fiPric.val(lecture.pric)
      fiThrs.val(lecture.thrs)
    },
    function(error) {
      alert('매니저 데이터 가져오는 중 오류 발생!')
      throw error
  })

  lectureService.detail2(no,
    function(result) {
    for (var select of result){
      $("<option value='" + select.crmno + "'>").html("" + select.crmname +
      "")
      .appendTo(croomSelect)
    } //for
},
      function(error) {
      alert('강의실 데이터 가져오는 중 오류 발생!')
      throw error
  })

    lectureService.detail3(no,
      function(result) {
      for (var select of result){
        $("<option value='" + select.mrno + "'>").html("" + select.mgrname +
        "")
        .appendTo(mgrSelect)
      } //for
      },
    function(error) {
      alert('매니저 데이터 가져오는 중 오류 발생!')
      throw error
  })

  $('#upd-btn').click(function() {
    lectureService.update(
      {
        "no": no,
        "titl": fiTitl.val(),
        "dscp": fiDscp.val(),
        "sdt": fiSdt.val(),
        "edt": fiEdt.val(),
        "qty": fiQty.val(),
        "pric": fiPric.val(),
        "thrs": fiThrs.val(),
        "crmno": croomSelect.val(),
        "mrno": mgrSelect.val()
      },
      function(result) {
        location.href = 'index.html'
      },
      function(error) {
        alert('강의 정보 데이터 변경 중 오류 발생!')
        console.log(croomSelect.val(),mgrSelect.val())
        throw error;
    })//update()
  }) //click()

  $('#del-btn').click(function() {
    lectureService.delete(no,
      function(result) {
        location.href = 'index.html'
      },
      function(error) {
        alert('강의정보 데이터 삭제 중 오류 발생!')
        throw error;
    })
  }) // click()
} // else

$('#lst-btn').click(function() {
  location.href = "index.html"
})
