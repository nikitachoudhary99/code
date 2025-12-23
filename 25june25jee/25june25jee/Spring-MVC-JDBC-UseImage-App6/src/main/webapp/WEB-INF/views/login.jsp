<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h1><font color="blue">Universal Informatics</font></h1>
<br>
<p>Place For IT / CS Student's</p>
<img alt="" src="images/logouni.png">
<br>
<hr>
<h1>Login Page</h1>
<br>
<%
String msg = (String)request.getAttribute("msg");
if(msg!=null)
	out.print(msg);
%>
<br>
<form action="checkUser" method="post">
Username<input type="text" name="username"><br><br>
Password<input type="password" name="password"><br><br>
<input type="submit" value="Login Here">
<a href="register">New User Registration</a>
</form>
<br>
<br>
<br>
<hr>
<address>
Universal Informatics<br>
Bhawarkuna<br>
Indore
</address>

</center>
</body>
</html>
