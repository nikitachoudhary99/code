<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<%@include file="header.jsp" %>
<h2>New User Registration Form</h2>
<br>
<%
String msg = (String)request.getAttribute("msg");
if(msg!=null)
{
	out.println(msg);
}
%>
<br>
<form:form action="addnewuser" method="post" modelAttribute="userObj">
Username<form:input type="text" path="username" name="user"/><br><br>
Password<form:input type="password" path="password" name="pass"/><br><br>
<input type="submit" value="Register Here">
<a href="index">Back To Login Page</a><br><br>
</form:form>
<br>
<%@include file="footer.jsp" %>
</body>
</html>
