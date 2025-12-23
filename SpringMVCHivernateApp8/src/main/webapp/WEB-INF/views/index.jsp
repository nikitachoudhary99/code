<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
<%@include file="header.jsp" %>
<br>
<br>
<%
String msg = (String)request.getAttribute("msg");
if(msg!=null)
	out.print(msg);
%>

<br>
<h3>User Login Page</h3>
<b1>
<form:form action="checkuser" method="post" modelAttribute="userObj">
Username<form:input type="text" path="username" name="user"/><br><br>
Password<form:input type="password" path="password" name="pass"/><br><br>
<input type="submit" value="Login Here">
<a href="registration">New User Registration</a>
</form:form>
<%@include file="footer.jsp" %>
<br>
<br>
</body>
</html>
