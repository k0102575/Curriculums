<%-- JSP 구성 요소 : Expression Element --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<% String name = "홍길동"; %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP</title>
</head>
<body>
<h1>Expression 엘리먼트</h1>
name: <%="$$" + name + "**" %>
</body>
</html>