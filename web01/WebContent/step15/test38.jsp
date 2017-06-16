<%-- JSP 구성 요소 : EL - 논리 연산자 사용법 --%>
<%@page import="java.util.HashMap"%>
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
<h1>EL - 논리 연산자 사용법</h1>

\${true && false} : ${true && false}<br>
\${true || false} : ${true || false}<br>
\${!false} : ${!false}<br>
\${true and false} : ${true and false}<br>
\${true or false} : ${true or false}<br>


</body>
</html>
