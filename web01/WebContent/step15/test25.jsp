<%-- JSP 구성 요소 : JSTL - c:url --%>
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
<h1>JSTL - c:url 태그 사용법</h1>

<c:set var="url1" value="https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=kotlin"/>
${pageScope.url1}<br>

<c:url var="url2" value="https://search.naver.com/search.naver">
  <c:param name="where" value="nexearch"></c:param>
  <c:param name="sm" value="top_hty"></c:param>
  <c:param name="fbm" value="0"></c:param>
  <c:param name="ie" value="utf8"></c:param>
  <c:param name="query" value="kotlin"></c:param>
</c:url>
${pageScope.url2}<br>

</body>
</html>

