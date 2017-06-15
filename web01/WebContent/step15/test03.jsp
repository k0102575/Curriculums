<%-- JSP 구성 요소 : 스크립트릿 엘리먼트 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<%
int i = 20;
int j = 30;
%>
	<meta charset=UTF-8">
	<title>JSP</title>
</head>
<body>
<h1>스크립트릿 엘리먼트</h1>
<%
out.write("=>" + i * j);
%>
</body>
</html>