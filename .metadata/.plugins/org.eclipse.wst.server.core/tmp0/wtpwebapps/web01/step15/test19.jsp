<%-- JSP 구성 요소 : JSTL - c:set 태그 사용법 --%>
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
<h1>JSTL - c:remove 태그 사용법</h1>
<c:set var="name1" value="홍길동"/>
<c:set var="name2" value="임꺽정"/>
<c:set var="name3" value="유관순"/>
${pageScope.name1}<br>
${pageScope.name2}<br>
${pageScope.name3}<br>
<hr>
<c:remove var="name1"/>
<c:remove var="name2" scope="page"/>
<c:remove var="name3" scope="request"/>
${pageScope.name1}<br>
${pageScope.name2}<br>
${pageScope.name3}<br>

</body>
</html>
