<%-- JSP 구성 요소 : 지시어 엘리먼트 - page --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"
    buffer="8kb"
    autoFlush="true"
    import="java.net.Socket,java.util.ArrayList"%>
<%@ page import="java.io.File"%>
<%@ page import="java.io.Serializable"%>
<%@ page import="java.sql.Date" %>

<!DOCTYPE html>
<html>
<head>
<%
int i = 20;
int j = 30;
%>
	<meta charset=UTF-8">
	<title>JSP</title>
</head>
<body>
<h1>지시 엘리먼트 - page</h1>
<%
out.write("=>" + i * j);
%>
</body>
</html>