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
<form action="saveproduct.jsp">
<%
String msg = (String)request.getAttribute("msg");
		if(msg!=null)
		{
			out.print(msg);
		}
int pid=0;
try
{
pid = Integer.parseInt(request.getParameter("s1"));
}
catch(NumberFormatException e)
{
	
}
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
	PreparedStatement ps = 
	con.prepareStatement("select * from product where pid  = ?");
	ps.setInt(1, pid);
	
	ResultSet rs = ps.executeQuery();
	
	if(rs.next()==true)
	{
		%>

		Product-Id<input type="text" name="pid" value="<%=rs.getInt("pid")%>"><br><br>
		Product-Name<input type="text" name="pname" value="<%=rs.getString("pname")%>"><br><br>
		Product-Price<input type="text" name="price" value="<%=rs.getDouble("price")%>"><br><br>
		<input type="submit" value="Update Product Details" name="b1">

		
		<%	
		
	}
	
}
catch(SQLException e)
{
	out.print(e);
}
%>
</form>

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