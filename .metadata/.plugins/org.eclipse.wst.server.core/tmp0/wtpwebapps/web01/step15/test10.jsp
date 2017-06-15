<%-- JSP 구성 요소 : JSP 액션 태그 - jsp:useBean II --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP</title>
</head>
<body>
<h1>JSP 액션 태그 - jsp:useBean II</h1>
<jsp:useBean id="list" type="java.util.ArrayList" scope="page"></jsp:useBean>

<%--
  위의 태그는 다음과 비슷한 자바 코드를 생성한다.
  java.util.ArrayList list = (java.util.ArrayList) page.Context.getAttribute("list");
  if (list == null) {
  list = new java.util.ArrayList();
  pageContext.setAttribute("list", list);
  }
  
 --%>

<%-- 
<%
list.add("홍길동");
list.add("임꺽정");
--%>

for (Object value : list) {
  out.println(value + "<br>");
}
%>

</body>
</html>

