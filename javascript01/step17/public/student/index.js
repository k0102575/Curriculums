// 서버에서 학생목록 데이터를 받아온다.
//
// $.getJSON('list.json', {'pageNo':1, 'pageSize':4},function(result) {// url, 서버에 보낼 데이터, 서버에서 받을 함수 비동기 방식
//   alery('서버에서 응답이 왔다!')
// })
var pageNoTag = $('#page-no')  // 매번 이걸 찾으면 안좋다 찾아놓은걸 쓰자
var currPageNo = parseInt(pageNoTag.text())
    tbody = $('#student-tbl > tbody'),
    prevBtn = $('#prev-btn'),
    nextBtn = $('#next-btn'),
    pageSize = 3;

displayList(1)

function displayList(pageNo){
  $.getJSON('list.json', {'pageNo':pageNo, 'pageSize':pageSize}, function(result) {// url, 서버에 보낼 데이터, 서버에서 받을 함수 비동기 방식
    var list = result.list
    var totalCount = result.totalCount
    var lastPageNo = parseInt(totalCount / pageSize) + (totalCount % pageSize > 0 ? 1: 0)

    var templateFn = Handlebars.compile($('#tbody-template').text())
    var generatedHTML = templateFn(result)
    tbody.text('')
    tbody.html(generatedHTML)  // 문자열 html을 리턴한다.

    currPageNo = pageNo
    pageNoTag.text(currPageNo)

    if(currPageNo == 1){
      prevBtn.prop('disabled', true)
    } else {
      prevBtn.prop('disabled', false)
    }

    if(currPageNo == lastPageNo){
      nextBtn.prop('disabled', true)
    } else {
      nextBtn.prop('disabled', false)
    }

  })  //getJSON()
              // ,json을 적으면 자동으로 파싱해서 파싱된 객체를 넘겨받는다.
              // 서버가 준 데이터를 분석한다 서버가 준 데이터가 제이슨이기떄문에 자동으로 파싱해준다.
              // 서버에서 보내 주는 대로 받아야한다. 서버가 텍스트로 주면은 텍스트로 받을수 밖에 없다.
              // 그래서 확실하지 않으니 json으로 파싱된걸 받는다라고 적는다.
              // get이라고 적는것도 귀찷아서 getJSON 이란 함수가나왔다.

  // json 은 서버와 브라우저간에 자바스크립트 객체를 주고 받기 위해서 만들어짐
} // displayList()

prevBtn.click(function() {
  displayList(currPageNo - 1)
}) //prev-btn.click

nextBtn.click(function() {
  displayList(currPageNo + 1)
})  //next-btn.click
