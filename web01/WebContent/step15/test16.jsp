<%-- JSP 구성 요소 : JSTL - c:out 태그 사용법 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>JSP</title>
</head>
<body>
<h1>JSTL - c:out 태그 사용법</h1>
<c:out value="출력할 문자열"></c:out><br>
<%
pageContext.setAttribute("name", "홍길동");
%>
,<c:out value="${name}"></c:out>,<br>
,<c:out value="${name2}"></c:out>,<br>
,<c:out value="${name}" default="오호라"></c:out>,<br>
,<c:out value="${name2}" default="오호라"></c:out>,<br>
,<c:out value="${name2}">오호라</c:out>,<br>
</body>
</html>
