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
<h1>JSTL - c:set 태그 사용법</h1>

<c:out value="출력할 문자열"></c:out><br>

<c:set var="name" value="임꺽정1"/>
<c:set var="name" value="임꺽정2" scope="page"/>
<c:set var="name" value="임꺽정3" scope="request"/>
<c:set var="name" value="임꺽정4" scope="session"/>
<c:set var="name" value="임꺽정5" scope="application"/>

기본:<c:out value="${pageScope.name}"/><br>
PageContext:<c:out value="${pageScope.name}"/><br>
ServletRequest:<c:out value="${requestScope.name}"/><br>
HttpSession:<c:out value="${sessionScope.name}"/><br>
ServletContext:<c:out value="${applicationScope.name}"/><br>

<c:set var="name2">유관순</c:set>
${pageScope.name2}<br>

</body>
</html>
