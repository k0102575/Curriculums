<%-- JSP 구성 요소 : EL - 조건 연산자 사용법 --%>
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
<h1>EL - 조건 연산자 사용법</h1>

<c:set var="name" value="홍길동"/>
<c:set var="age" value="18"/>

\${name == '홍길동' ? '반가워요!' : '어서오세요'} :
${name == '홍길동' ? '반가워요!' : '어서오세요'} <br>

\${age < 19 ? '미성년' : '성년'} :
${age < 19 ? '미성년' : '성년'}

</body>
</html>
