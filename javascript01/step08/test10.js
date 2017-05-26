function bit(value){
  var el = []

  if (value instanceof HTMLElement){ // 파라미터 값이 태그라면 (HTML엘리먼트값으로 생성자함수로 초기화된 값이라면)
                                     // instanceof 는 true 나 false값을 리턴한다.  그 생성자 함수에 의해서 초기화된 함수일경우만 true를 리턴한다.
    el[0] = value // 무조건 태그를 배열로 포장한다.  배열에다가 플러그인을 장착해야되니까  순수배열에는 없는 플러그인
  } else if (value.startsWith('<')){ // 새태그 생성으로 간주한다.
    el[0] = document.createElement(value.substr(1, value.length -2))
    // substr 과 substring 을 구분을 잘해라
    //  "<tr>"  t부터 r까지
    //value.length 전체 사이즈 에서 2개를 줄인것 까지 추출을 해라
    // 기준의 css문법 실렉터와 혼란을 피하기 위해서 <>를 줬다.
  } else { // CSS 실렉터 문법으로 간주한다.
  var list = document.querySelectorAll(value)
  for (var e of list){
    el.push(e)

  // 원본을 손대기 싫어서 리스트에 있는걸 꺼내서 새 리스트에 담았다
  // 담는 이유를 알아야된다
  // 배열에다가 원본을 건드리지 않고 도구를 덕지덕지 붙여서 넘기고 싶다 그래서 새배열을 만들고 항목들을 담아서 넘긴다.
  // 태그를 한개 만들더라도 배열에 만들었다.
  }

}

  // 배열에 나만의 유용한 함수를 붙이자!

  // 1) 배열에 들어있는 태그에 대해 자식 태그를 추가하는 아주 편리한 함수
  el.append = function(children){
    if(!(children instanceof Array)){
      console.error('배열이 아닙니다.');
      return;   // 배열이 아니면 리턴이 되게 한다.
    }

    for(var e of this){

      for (var child of children){
      e.appendChild(child)
    }

    }

    return this
  }

  // 2) 배열안에 있는 태그의 콘텐츠를 설정하는 함수

  el.html = function(content){

    for (var e of this){
      e.innerHTML = content
    }

    return this
  }

  // 3) 배열 안에 있는 태그에 클릭 이벤트 핸들러를 추가하는 함수

  el.click = function(Listener){
    for (var e of this) {  // 배열이 넘어오면 배열에서 e에다가 클릭 이벤트 리스터를 들록한다.
      e.addEventListener('click', Listener)
    }

  return this
  }

  // 4) 배열안에 있는 태그의 속성 값을 다루는 함수
  // 개발자가 태그에
  el.attr = function(name, value) {
    if(arguments.length < 2){ // 특정 네임
      return this[0].getAttribute(name)
    } else { // 특정 이름을 가진 속성의 값을 value로 설정한다.
      for (var e of this){
        e.setAttribute(name, value)
      }

      return this
    }



    // 값을 꺼낼 때는 배열에서 0번 방에 들어있는 태그의 속성 값만 꺼내자
    // 속성을 주면 그 속성에 잇는 배열에 0번째 있는 태그만  리턴한다.
    // jquery 에서 attr이라는 함수가 그렇게 사용한다.

  }



  // 5) 배열 안에 있는 태그를 부모 태그에 추가시키는 함수
  el.appendTo = function(parents){ // 부모가 넘어온다.
    for (var p of parents){ // 부모배열을 반복을 돌린다.
      for (var e of this){
        p.appendChild(e) // 자식배열을 반복해서 한명의 자식을 한명의 부모에 넣는다.
      }
    }
    return this
  }


  // 6) 배열 안에 있는 각각의 태그에 대해 CSS 스타일을 다루는 함수

  el.css = function(name, vaule){
    for (var e of this){
    e.style[name] = value
  }

  return this
  }

  // 7) 배열안에 있는 태그의 콘텐츠를 설정하는 함수. (textContent 속성)

  el.text = function(content){

    for (var e of this){
      e.textContent = content
    }
    return this
  }

  // 8) 배열안에 있는 폼 항목 태그의 콘텐츠를 설정하는 함수. (vlaue 속성)

  el.val = function(value){
    if (arguments.length == 0){ // value 파라미터 값이 없으면, 현재 value 값을 꺼낸다.
      return this[0].value
    }
    for (var e of this){
      e.value = value
    }
    return this
  }



  // 9) 배열안에 있는 태그의 프로퍼티 값(?)을 다루는 함수
  //    => 개발자가 태그에 추가한 속성이 아닌 원래 있던 속성의 값을 다루는 함수
  //    => getAttribute() / setAttribute() 대신 "태그명.속성명", "태그명.속성명 = 값"으로 다룬다.
  el.prop = function(name, value) {
    if(arguments.length < 2){ // 특정 네임
      return this[0][name]

    } else { // 특정 이름을 가진 속성의 값을 value로 설정한다.

      for (var e of this){
        e[name] = value
      }
      return this
    }
  }

  return el
}

  //bit() 함수가 리턴한 배열에 대해 작업하지 않고,
  //독자적으로 작업하는 함수는 bit()객체에 직접 보관한다.

bit.ajax = function(url, settings){
  if (settings == undefined){ //settings에 값이 안넘어올떄만 이객체를 만들어서 넣는다.
    settings = {
      method: 'GET',
      dataType: 'text'
    }
  } else { // 넘어온다고 하더라도 메소드나 값이 없으면 채운다.
    if (settings.method == undefined) settings.method = 'GET'
    if (settings.dataType == undefined) settings.dataType = 'text'
  }

  var xhr = new XMLHttpRequest()
  xhr.onreadystatechange = function(){
    if (xhr.readyState < 4)
    return

    var rv;
    if (settings.dataType == 'json'){   // setting 데이터 타입이 json 이면 파싱해서 자바스크립트 객체를 리턴받는다.
      rv = JSON.parse(xhr.responseText)
    } else {
      rv = xhr.responseText   // 그게 아니라면 객체를 그대로 리턴받는다.
    }

    if (settings.success) {  //setting.success != undefined  // if 안에 undefined 면 false로 바뀐다. 뭐라도 1개라도 있으면 true 고 없으면 false가 된다.
      settings.success(rv)    // settings 객체의 success 변수에 들어있는 함수를 호출한다
                          // 함수가 호출될때 rv값을 넘긴다 rv는 xhr.responseText
    }

  }
  xhr.open(settings.method, url, true)
  if(settings.method == 'POST'){
  xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded')
  var queryString = ""
  if (settings.data) {
    for (var propName in settings.data){
      if (queryString.length > 0){
        queryString += '&'
      }
    queryString += propName + '=' + settings.data[propName]  // 이름 + = + 값
  }
}
  xhr.send(queryString)
}else {
  xhr.send()
}


}

bit.getJSON = function(url, success){
  bit.ajax(url, {
    dataType: 'json',
    success: success
  })
}

bit.post = function(url, data, success, dataType){
  bit.ajax(url,{
    method: 'POST',
    dataType: dataType,
    data: data,
    success : success
  })
}

// 자바에서는 변수명에 $를 사용할수없다  자바스크립트는 $로 많이 쓴다.
var $ = bit;
