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
<h4><font color="green"> 
<%
String msg = (String)request.getAttribute("msg");
if(msg!=null)
out.print(msg);
%>
</font></h4>
<h1>Student Service Form</h1>
<br>
<form action="savestudent" method="post">
Rollno<input type="text" name="roll"><br><br>
Name<input type="text" name="name"><br><br>
Marks<input type="text" name="marks"><br><br>
<input type="submit" value="Add" name="op">
<input type="submit" value="Update" name="op">
<input type="submit" value="Delete" name="op">
<br>
</form>
<br>
<a href="home">Back To Student Index page</a><br><br>
</br>
<%@include file="footer.jsp" %>
</body>
</html>