<%-- JSP 구성 요소 : EL - 배열,List,Map 에서 값 꺼내기 --%>
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
<h1>EL - Map에서 값 꺼내기</h1>

<% 

HashMap<String, String> map = new HashMap<>();
map.put("s01", "홍길동");
map.put("s02", "임꺽정");
map.put("s03", "유관순");
map.put("s04", "안중근");
map.put("s05", "윤봉길");

pageContext.setAttribute("map", map);

%>

\${map.s02} : ${map.s02}<br>
\${map['s03']} : ${map['s03']}<br>
\${map["s04"]} : ${map["s04"]}<br>
\${map[s05]} : ${map[s05]}<br>

</body>
</html>

