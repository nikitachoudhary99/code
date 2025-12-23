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
<br>
<form action="modifyproduct.jsp">
<h2>Select Product-Id To Search Product Details</h2>
<select name="s1">
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
	":3306/30apr25ad?user=root&password=root");
	PreparedStatement ps = con.prepareStatement("select * from product");
	
	ResultSet rs = ps.executeQuery();
	
	while(rs.next())
	{
		%>
		<option value="<%=rs.getInt("pid")%>"><%=rs.getInt("pid")%></option>
		<%	
	}
	
}
catch(SQLException e)
{
	out.print(e);
}
%>
</select>

<br>
<br>
<input type="submit" value="Search Product Details">
<br>
</form>
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