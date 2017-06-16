<%-- JSP 구성 요소 : JSTL - c:forEach II --%>
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
<h1>JSTL - c:forEach 태그 사용법 II</h1>

<c:forEach var="name"
  items="홍길동,임꺽정,유관순,신채호,윤봉길,안중근,김원봉">
  ${name}<br>
</c:forEach>

<hr>

<c:forEach var="name"
  items="홍길동,임꺽정,유관순,신채호,윤봉길,안중근,김원봉"
  begin="3">
  ${name}<br>
</c:forEach>

<hr>

<c:forEach var="name"
  items="홍길동,임꺽정,유관순,신채호,윤봉길,안중근,김원봉"
  end="3">
  ${name}<br>
</c:forEach>

<hr>

<c:forEach var="name"
  items="홍길동,임꺽정,유관순,신채호,윤봉길,안중근,김원봉"
  begin="3"
  end="3">
  ${name}<br>
</c:forEach>

</body>
</html>

