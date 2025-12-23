<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>WELCOME
<%
String user = (String)request.getAttribute("user");
String filename = (String)request.getAttribute("filename");

out.print(user);

%>
<img alt="fpic" src="images/<%=filename%>" width="200" height="200">
</h1>
</body>
</html>