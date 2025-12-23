
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
<h1>Universal Informatics</h1>
<p>place for IT/CS Students</p>
<br>
<hr>
<table border="2">
<tr>
<th>S.No.</th>
<th>Product-Id</th>
<th>Product-Name</th>
<th>Product-Price</th>
</tr>
<br>
<%

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
}
catch(ClassNotFoundException e)
{
	out.print("Error in loading drivers");
}
try
{
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost"+
	":3306/30apr25ad?user=root&password=mishthu99");
	PreparedStatement ps = con.prepareStatement("select * from product");
	
	ResultSet rs = ps.executeQuery();
	int i=1;
	while(rs.next())
	{
		%>
		<tr>
			<td><%= i%></td>
			<td><%= rs.getInt("pid")%></td>
			<td><%= rs.getString("pname")%></td>
			<td><%= rs.getDouble("price")%></td>
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
<a href="Home.jsp">Back To Product Home</a>
<hr>
<address>
Universal Informatics <br>
Bhawarkua, Indore<br>
Madhya Pradesh
</address>
</center>
</body>
</html>
</body>
</html>