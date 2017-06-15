<%-- JSP 구성 요소 : 지시어 엘리먼트 - include --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset=UTF-8">
	<title>JSP</title>
</head>
<body>
<h1>지시 엘리먼트 - include</h1>
<hr>
<% String name = "홍길동"; %>
<%@ include file="a.jsp" %>
<%-- 
파일을 여기로 가지고오려면 파일을 써라
--%>
<hr>

<%-- 
<jsp:include page="a.jsp"/>
--%>

</body>
</html>