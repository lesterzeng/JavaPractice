<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hi customer. Welcome back.</h1>
<%@ page import = "java.util.*" %>
<%@ page import = "com.accenture.customer.model.*" %>
<%
	ArrayList<ViewCustomerCarModelArray> al = (ArrayList<ViewCustomerCarModelArray>)session.getAttribute("al");
	for (ViewCustomerCarModelArray x:al){
		out.println(x);
	}
%>
</body>
</html>