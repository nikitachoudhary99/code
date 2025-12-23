<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String username = request.getParameter("username");
String password = request.getParameter("password");

try
{
Class.forName("com.mysql.cj.jdbc.Driver");	
}
catch(ClassNotFoundException e)
{
	out.println("Error in loading driver");
}

try
{
	Connection con = 
	DriverManager.getConnection("jdbc:mysql://localhost:3306/"
			+"30apr25ad?user=root&password=root");
	
	PreparedStatement ps = con.prepareStatement("select * from"
			+" userinfo where username = ? and password = ?");
	ps.setString(1, username);
	ps.setString(2, password);
	
	ResultSet rs = ps.executeQuery();
	if(rs.next()==true)
	{
		request.setAttribute("username", username);
		%>
		<jsp:forward page="home.jsp"></jsp:forward>
		<%
	}
	else
	{
		request.setAttribute("msg", "Invalid Username / Password");
		%>
		<jsp:forward page="login.jsp"></jsp:forward>
		<%
	}
	

}
catch(SQLException e)
{
	out.print("Error in sql statement");
}
%>
</body>
</html>