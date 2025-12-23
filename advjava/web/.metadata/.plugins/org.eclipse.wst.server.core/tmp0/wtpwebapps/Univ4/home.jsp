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
<h1>WELCOME
<%
String msg = (String)request.getAttribute("msg");
		
if(msg!=null)
{
	out.print(msg);
}
%>
To universal informatic</h1>
<br>
<br>
<a href="studentinfo.jsp">Add/Update/Delete Student Details</a><br><br>
<a href="getallstudent.jsp">List Of All Students</a><br><br>
<a href="search.jsp">Search Student</a><br><br>
<a href="">Logout</a><br><br>
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
