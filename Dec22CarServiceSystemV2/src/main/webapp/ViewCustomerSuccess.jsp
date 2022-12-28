<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import = "java.util.*" %>
<%@ page import = "com.accenture.customer.model.*" %>
<%
	ArrayList<CustomerDetail> al = (ArrayList<CustomerDetail>)session.getAttribute("al");
	for(CustomerDetail x: al){
		out.println(x);
	}
%>
</body>
</html>