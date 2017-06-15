<%-- JSP 구성 요소 : Declaration Element --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%! String name = "홍길동"; %>
<!DOCTYPE html>
<html>
<%! int age = 20; %>
<head>
	<meta charset="UTF-8">
	<title>JSP</title>
</head>
<body>
<h1>Declaration 엘리먼트</h1>
name: <%= name %>
age: <%= age %>
<%plus(10, 20); %>
10 + 20 = <%= result %><br>

</body>
</html>

<%!
int result;
void plus(int a, int b) {
  this.result = a + b;
}
%>