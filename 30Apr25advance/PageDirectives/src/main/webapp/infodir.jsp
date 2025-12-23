<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page info="Hello I am at JIT." %>
<%
out.print("Info = "+getServletInfo());
%>
</body>
</html>