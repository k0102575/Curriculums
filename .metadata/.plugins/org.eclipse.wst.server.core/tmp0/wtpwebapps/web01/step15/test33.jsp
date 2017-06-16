<%-- JSP 구성 요소 : EL - 배열,List,Map 에서 값 꺼내기 --%>
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
<h1>EL - 배열에서 값 꺼내기</h1>
<% 
pageContext.setAttribute("names", new String[]{"홍길동", "임꺽정", "유관순"});
%>
\${names[0]} : ${names[0]}<br>
\${names[1]} : ${names[1]}<br>
\${names[2]} : ${names[2]}<br>

</body>
</html>

