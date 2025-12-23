<%@page import="java.util.Date"%>
<%@ page language="java" contentType="application/msword; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Home Page..........!</h1>
<%
Date d = new Date();
out.print(d);
out.print(d.getDate()+"<br>");
out.print(d.getDay()+"<br>");
out.print(d.getYear()+"<br>");
out.print((1+d.getMonth())+"<br>");
%>
</body>
</html>