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
<h1>JSTL - c:set 태그 사용법 II</h1>
<%
pageContext.setAttribute("m", new Member());
%>

<c:set target="${pageScope.m}" property="name" value="홍길동"/>
<c:set target="${pageScope.m}" property="age" value="20"/>
<c:set target="${pageScope.m}" property="working" value="true"/>

name: ${pageScope.m.name}<br>
age: ${pageScope.m.age}<br>
working: ${pageScope.m.working}<br>

</body>
</html>

<%!
public class Member {
  // 필드 선언
  String name2;
  int age;
  boolean working;
  
  // 프로퍼티 선언
  public void setName(String name) {this.name2 = name;}
  public void setAge(int age) {this.age = age;}
  public void setWorking(boolean working) {this.working = working;}
  public String getName() {return this.name2;}
  public int getAge() {return this.age;}
  public boolean isWorking() {return this.working;}
  
}

%>