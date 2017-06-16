<%-- JSP 구성 요소 : EL - 배열,List,Map 에서 값 꺼내기 --%>
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
<h1>EL - List에서 값 꺼내기</h1>

<% 
ArrayList<String> list = new ArrayList<>();
list.add("홍길동");
list.add("임꺽정");
list.add("유관순");
list.add("윤봉길");

pageContext.setAttribute("list", list);

%>

\${list[0]} : ${list[0]}<br>
\${list[1]} : ${list[1]}<br>
\${list[2]} : ${list[2]}<br>
\${list[3]} : ${list[3]}<br>

</body>
</html>

