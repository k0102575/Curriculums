<%-- JSP 구성 요소 : EL - 연산자 사용법 --%>
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
<h1>EL - 산술 연산자 사용법</h1>

\${10 + 20} : ${10 + 20}<br>
\${10 - 20} : ${10 - 20}<br>
\${10 * 20} : ${10 * 20}<br>
\${10 / 20} : ${10 / 20}<br>
\${10 % 20} : ${10 % 20}<br>
\${10 div 20} : ${10 div 20}<br>
\${10 mod 20} : ${10 mod 20}<br>

</body>
</html>
