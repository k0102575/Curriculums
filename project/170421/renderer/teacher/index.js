"use strict"
window.$ = window.jQuery = require('jquery')

var teacherService = require('electron').remote.getGlobal('teacherService')
/* 위의 코드는 주석에 작성한 코드와 같다.
// electron 관리자 객체 얻기
var electron = require('electron')

// main 프로세스에 접근하기
var remote = electron.remote

// main 프로세스의 global 변수에서 값 꺼내기
var teacherService = remote.getGlobal('teacherService')
*/

var tbody = $('#teacher-tbl > tbody')

displayList(1)

$('#add-btn').click(function() {
  location.href = 'view.html'
})

$('#prev-btn').click(function() {
  var currPageNo = parseInt($('#page-no').text())
  displayList(currPageNo - 1)
})

$('#next-btn').click(function() {
  var currPageNo = parseInt($('#page-no').text())
  displayList(currPageNo + 1)
})

function displayList(pageNo) {
  teacherService.list(
    pageNo,
    function(results, totalCount) {
      tbody.html('');
      for (var i = 0; i < 3; i++) {
        if (i < results.length) {
          let t = results[i]
          $("<tr>").html("<td>" + t.mno +
          "</td><td><a href='#' data-no='" + t.mno + "' class='view-link'>" + t.name +
          "</a></td><td>" + t.tel +
          "</td><td>" + t.email +
          "</td>")
          .appendTo(tbody)
        } else {
          $("<tr><td colspan='5'>&nbsp;</td></tr>").appendTo(tbody)
        }
      }

      $('table .view-link').click(onClickViewLink)
      preparePagingBar(pageNo, totalCount)

    },
    function(error) {
      alert('데이터 조회 중 오류 발생!')
      throw error;
  }) //list()
} // displayList()

function preparePagingBar(pageNo, totalCount) {
  $('#page-no').text(pageNo)

  if (pageNo == 1) {
    $('#prev-btn').attr('disabled', true)
  } else {
    $('#prev-btn').attr('disabled', false)
  }

  var totalPage = parseInt(totalCount / 3) + (totalCount % 3 > 0 ? 1 : 0);

  if (pageNo == totalPage) {
    $('#next-btn').attr('disabled', true)
  } else {
    $('#next-btn').attr('disabled', false)
  }
} //preparePagingBar()

function onClickViewLink(event) {
  location.href = 'view.html?no=' + $(this).attr('data-no')
  event.preventDefault()
}
