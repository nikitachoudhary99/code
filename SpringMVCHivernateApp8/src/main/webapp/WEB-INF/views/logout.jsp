<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
<%@include file="header.jsp" %>
<br>
<br>
<h1>Bye, </h1>
<%
String msg = (String)session.getAttribute("us");
if(msg!=null)
	out.print(msg);
%>
Thanks for visiting........Fir Annnnnaaaa....!
<br>
<a href="index">Back To Login Page</a>

<%@include file="footer.jsp" %>
<br>
<br>
</body>
</html>
