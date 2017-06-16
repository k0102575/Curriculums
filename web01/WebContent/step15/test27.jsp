<%-- JSP 구성 요소 : JSTL - c:redirect --%>
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
<h1>JSTL - c:redirect 태그 사용법</h1>

<c:if test="${param.menu == 'test26'}">
  <c:redirect url="test26.jsp"/>
</c:if>
<h1>하하~~~</h1>
</body>
</html>

