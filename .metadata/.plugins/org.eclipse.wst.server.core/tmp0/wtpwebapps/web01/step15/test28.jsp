<%-- JSP 구성 요소 : JSTL - fmt:parseDate --%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>JSP</title>
</head>
<body>
<h1>JSTL - fmt:parseDate 태그 사용법</h1>

<fmt:parseDate value="2017-06-16" pattern="yyyy-MM-dd" var="date1"/>
<fmt:parseDate value="06/17/2017" pattern="MM/dd/yyyy" var="date2"/>


<%

java.util.Date date3 = (java.util.Date) pageContext.getAttribute("date1");
out.println(date3);
out.println("<br>");

java.util.Date date4 = (java.util.Date) pageContext.getAttribute("date2");
out.println(date4);

%>







</body>
</html>

