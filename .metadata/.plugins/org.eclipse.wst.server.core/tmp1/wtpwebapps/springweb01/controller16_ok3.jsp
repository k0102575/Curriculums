<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test</title>
</head>
<body>
<h1>controller16_ok3()</h1>
name = ${name}<br>
age = ${age}<br>
file1 = ${file1}<br>
<img id="img1" height="400" width="400"><br>
file2 = ${file2}<br>
<img id="img2" height="400" width="400"><br>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<script>
// jsp 명령어 값을 넣고 script 문이 html에 던져 진다 그리고 화면에 출력된다
// jsp 명령어는 서버에서 실행한다. script는 브라우저에서 실행된다.

 setTimeout(function() {
  $("#img1").attr("src", "${pageContext.request.contextPath}/upload/${file1}");
  $("#img2").attr("src", "${pageContext.request.contextPath}/upload/${file2}");
}, 5000)

</script>

</body>
</html>