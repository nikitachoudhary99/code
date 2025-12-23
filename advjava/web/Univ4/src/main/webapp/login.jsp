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
<h1>Universal Informatics</h1>
<p>place for IT and CS Students</p>

<hr>
<br>
<%
String msg = (String)request.getAttribute("msg");
if(msg!=null)
{
	out.print(msg);
}
%>
<br>
<form action="checkuser.jsp">
Username<input type="text" name="username"><br><br>
Password<input type="password" name="password"><br><br>
<input type="submit" value="Login Here">
</form>
<br>
<br>
<br>
<br>
<hr>
<address>
Universal Informatics<br>
Bhawarkua , Indore<br>
Madhya Pradesh
</address>
</center>
</body>
</html>
