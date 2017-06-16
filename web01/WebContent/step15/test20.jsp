<%-- JSP 구성 요소 : JSTL - c:if --%>
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
<h1>JSTL - c:if 태그 사용법</h1>

<c:set var="level" value="관리자"/>

<c:choose>
  <c:when test="${level == '손님'}">손님입니다.</c:when>
  <c:when test="${level == '일반회원'}">일반회원입니다.</c:when>
  <c:when test="${level == '관리자'}">관리자입니다.</c:when>
  <c:otherwise>등급이 없습니다.</c:otherwise>
</c:choose>

</body>
</html>

