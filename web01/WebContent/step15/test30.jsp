<%-- JSP 구성 요소 : EL 개요 --%>
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
<h1>EL - 파라미터 값 꺼내기</h1>
name: ${param.name}<br>
age: ${param.age}<br>

</body>
</html>

