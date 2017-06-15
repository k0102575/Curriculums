<%-- JSP 구성 요소 : JSP 액션 태그 - jsp:include + jsp:param --%>
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

<h1>JSP 액션 태그 - jsp:include + jsp:param</h1>
<jsp:include page="c.jsp">
  <jsp:param name="name" value="홍길동" />
  <jsp:param name="age" value="20" />
</jsp:include>

</body>
</html>
