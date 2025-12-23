<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
<center>
<h1 style="color: blue;">Universal Informatics</h1>
<p style="color: gray;">place for IT/CS Students</p>

<br>
<hr>
<br>
<br>
<br>
<%
String msg = (String)request.getAttribute("msg");
if(msg!=null)
	out.print(msg);
%>
<br>
<h3>User Registration Page</h3>
<br>
<form:form action="adduser" method="post" modelAttribute="userObj">
Username<form:input type="text" path="username" name="user"/><br><br>
Password<form:input type="password" path="password" name="pass"/><br><br>
<input type="submit" value="Login Here">
<a href="registration">New User Registration</a>
</form:form>
<br>
<br>
<br>
<address>
Universal Informatics,<br>
Bhawarkua, Indore.
</address>
<br>
</center>
</body>
</html>
