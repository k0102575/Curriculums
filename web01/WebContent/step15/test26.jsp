<%-- JSP 구성 요소 : JSTL - c:import --%>
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
<h1>JSTL - c:import 태그 사용법</h1>

<c:url var="url2" value="http://localhost:8080/project01/teacher/list">
  <c:param name="pageNo" value="2"></c:param>
  <c:param name="pageSize" value="3"></c:param>
</c:url>

<textarea cols="80" rows="10"><c:import url="${pageScope.url2}"/></textarea>

<textarea cols="80" rows="10">${pageScope.result}</textarea>
<c:import url="${url2}" var="result"/>


</body>
</html>

