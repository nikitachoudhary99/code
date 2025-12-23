<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>
<center>
 <h1>Universal Informatics</h1>
 <%
  String msg=(String)request.getAttribute("msg");
 if(msg!=null)
	 	out.print(msg);
	 
 %>
</center>
</body>
</html>