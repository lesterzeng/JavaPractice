<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
 	out.println("Dear "+ session.getAttribute("name")+ ", below is your results");
	out.println(session.getAttribute("id"));
	out.println(session.getAttribute("name"));
	out.println(session.getAttribute("marks1"));
	out.println(session.getAttribute("marks2"));
	out.println(session.getAttribute("marks3"));
 %>
</body>
</html>