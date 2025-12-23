<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
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
<h1>Universal Imformatics</h1>
<p>Place for IT /CS Students</p>
<br>
<hr>
<table border="2">
<tr>
<th> s.no</th>
<th> Student-ID</th>
<th> Student-Name</th>
<th> Student-Roll</th>
<th> Student-Mob</th>
</tr>
<br>
<%
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
}
catch(Exception e)
{
out.print("Error in loading driver");	
}

try{
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost"+
			":3306/30apr25ad?user=root&password=mishthu99");
			PreparedStatement ps = con.prepareStatement("select * from studentinfo");
			
			ResultSet rs = ps.executeQuery();
			int i=1;
			while(rs.next())
			{
				%>
				<tr>
				<td><%=i %></td>
				<td><%=rs.getInt("id") %></td>
				<td><%=rs.getString("username") %></td>
				<td><%=rs.getInt("roll") %></td>
				<td><%=rs.getInt("mob")%></td>
				</tr>
				<% 
				i++;
			}
}

catch(SQLException e)
{
out.print(e);	
}

%>
</table>
<br>

<br>
<a href="home.jsp">Back To Product Home</a>
<hr>
<address>
Universal Informatics <br>
Bhawarkua, Indore<br>
Madhya Pradesh
</address>

</center>
</body>
</html>