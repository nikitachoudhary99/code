<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
<center>
<h1><font color="black">Universal Informatics</font></h1>
<br>
<p>Place For IT / CS Student's</p>
<br>
<hr>
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