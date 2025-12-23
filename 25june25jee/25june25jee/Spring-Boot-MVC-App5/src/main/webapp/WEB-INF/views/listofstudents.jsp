<%@page import="java.util.ArrayList"%>
<%@page import="com.univ.pojo.Student"%>
<%@page import="java.util.List"%>
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
<h1><font color="green"> 
List Of All Students
</font></h1>

<br>
<table border="2">
<tr>
<th>S.No.</th>
<th>Rollno</th>
<th>Student - Name</th>
<th>Per - Marks</th>
</tr>

<%
List<Student>lst = (ArrayList)request.getAttribute("allstudents");
for(int i=0; i<lst.size(); i++)
{
	Student s = new Student();
	s = lst.get(i);
	%>
		<tr>
			<td><%=i+1 %></td>
			<td><%=s.getRoll() %></td>
			<td><%=s.getName()%></td>
			<td><%=s.getMarks()%></td>
		</tr>
	<%
	
	
}
%>
</table>
<br>
<br>
<a href="home">Back To Student Index page</a><br><br>

<br>

<%@include file="footer.jsp" %>
</body>
</html>