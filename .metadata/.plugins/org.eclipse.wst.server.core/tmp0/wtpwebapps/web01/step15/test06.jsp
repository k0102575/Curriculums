<%-- JSP 구성 요소 : 지시어 엘리먼트 - taglib --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset=UTF-8">
	<title>JSP</title>
</head>
<body>
<h1>지시 엘리먼트 - taglib</h1>
<hr>
<% String name = "홍길동"; %>
<%@ include file="a.jsp" %>
<hr>


</body>
</html>