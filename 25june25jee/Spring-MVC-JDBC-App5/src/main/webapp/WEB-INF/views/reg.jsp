<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


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
<br>
<hr>
<h1>New User Registration Page</h1>
<br>
<%
String msg = (String)request.getAttribute("msg");
if(msg!=null)
	out.print(msg);
%>
<br>
<form:form action="addNewUser" method="post" modelAttribute="userObj">
Username<form:input type="text" path="username" name="user"/><br><br>
Password<form:input type="password" path="password" name="pass"/><br><br>
<input type="submit" value="Register Here">
<a href="register">New User Registration</a>
</form:form>
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
