<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<%@include file="header.jsp" %>
<h2>Login Form</h2>
<img src="images/login.jpeg" width="80" height="70">
<br>
<%
String msg = (String)request.getAttribute("msg");
if(msg!=null)
{
	out.println(msg);
}
%>
<br>
<form:form action="checkuser" method="post" modelAttribute="userObj">
Username<form:input type="text" path="username" name="user"/><br><br>
Password<form:input type="password" path="password" name="pass"/><br><br>
<input type="submit" value="Login Here">
<a href="reg">New User Registration</a><br><br>
</form:form>
<br>
<%@include file="footer.jsp" %>
</body>
</html>
