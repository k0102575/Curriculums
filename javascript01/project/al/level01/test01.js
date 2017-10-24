var result = ""
var s = "01033334444"

var sl2 = s.substring(0, s.length-4)
var sl1 = s.substring(s.length , s.length-4) // 나머지 뒤에 글자 출력

for (var i =0; i < sl2.length;i++){
  result += "*"
}

result = result + sl1
