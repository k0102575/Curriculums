<%-- JSP 구성 요소 : EL - 객체 에서 값 꺼내기 --%>
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
<h1>EL - 객체 에서 값 꺼내기</h1>

<% 

Member member = new Member();
member.setName("홍길동");
member.setAge(20);
member.setWorking(true);

pageContext.setAttribute("member", member);

%>

\${member.name} : ${member.name}<br>
\${member['name']} : ${member['name']}<br>

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