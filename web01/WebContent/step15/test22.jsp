<%-- JSP 구성 요소 : JSTL - c:forEach --%>
<%@page import="java.util.ArrayList"%>
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
<h1>JSTL - c:forEach 태그 사용법</h1>
<%
pageContext.setAttribute("names", new String[]{"홍길동", "임꺽정", "유관순"});

ArrayList<String> names2 = new ArrayList<>();
names2.add("홍길동2");
names2.add("임꺽정2");
names2.add("유관순2");
pageContext.setAttribute("names2", names2);

pageContext.setAttribute("names3", "홍길동3,임꺽정3,유관순3");
%>

<c:forEach var="name" items="${pageScope.names}">
  ${name}<br>
</c:forEach>
<hr>
<c:forEach var="name" items="${pageScope.names2}">
  ${name}<br>
</c:forEach>
<hr>
<c:forEach var="name" items="${pageScope.names3}">
  ${name}<br>
</c:forEach>
<hr>
<c:forEach var="name" items="홍길동4,임꺽정4,유관순4">
  ${name}<br>
</c:forEach>
</body>
</html>
