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
<p>place for IT/CS Students</p>
<br>
<hr>
<br>
<br>
<h3>add/update/delete student page</h3>
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

<br>

<form action="save.jsp">
studentinfo-Id<input type="text" name="id"><br><br>
studentinfo-Name<input type="text" name="username"><br><br>
studentinfo-roll<input type="text" name="roll"><br><br>
studentinfo-mob<input type="text" name="mob"><br><br>
<input type="submit" value="Add studentinfo" name="b1">
<input type="submit" value="Update studentinfo" name="b1">
<input type="submit" value="Delete studentinfo" name="b1">
</form>
<br>
<a  href="home.jsp">back to home page</a>

<br>
<br>
<hr>
<address>
Universal Informatics <br>
Bhawarkua, Indore<br>
Madhya Pradesh
</address>
</center>
</body>
</html>
