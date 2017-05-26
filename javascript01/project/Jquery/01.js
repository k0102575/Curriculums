function bit(value){
var el = []

  if (value instanceof HTMLElement) { // 파라미터 값이 태그라면,
  el[0] = value // 무조건 태그를 배열로 포장한다.

  } else if (value.startsWith('<')) {
    el[0] = document.createElement(value.substr(1, value.length - 2))
  } else {
    var list = document.querySelectorAll(value)
    for (var e of list) {
      el.push(e)
    }
}


  // 1) 배열에 들어있는 태그에 대해 자식 태그를 추가하는 아주 편리한 함수
  el.append = function(children) {

    if (!(children instanceof Array)) {
      console.error('배열이 아닙니다.');
      return;
    }
    for (var e of this) {
      for (var child of children){
      e.appendChild(child)
    }
}
return this
}



  return el[0]

} //bit

var $ = bit;
