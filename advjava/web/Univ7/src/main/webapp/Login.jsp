<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
<br>
<h3>
<%
String msg = (String)request.getAttribute("msg");
if(msg!=null)
{
	out.print(msg);
}
%>
</h3>
<br>
<form action="LoginServlet" method="post">
Username<input type="text" name="username"><br><br>
Password<input type="password" name="password"><br><br>
<input type="submit" value="Login Here">
<a href="reg.jsp">New User Registration</a>
</form>
<br>
<br>
<%@include file="footer.jsp" %>
</body>
</html>
