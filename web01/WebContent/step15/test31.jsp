<%-- JSP 구성 요소 : EL - 값(literal) 표현 --%>
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
<h1>EL - 값(literal) 표현</h1>
\${"문자열"}: ${"문자열"}<br>
\${'문자열'}: ${'문자열'}<br>
\${20}: ${20}<br>
\${3.14}: ${3.14}<br>
\${true}: ${true}<br>
\${null}: ${null}<br>

</body>
</html>

