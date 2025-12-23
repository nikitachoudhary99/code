<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
String UserName=request.getParameter("UserName");
String Password=request.getParameter("Password");
try{
 Class.forName("com.mysql.cj.jdbc.Driver");	
}
catch(ClassNotFoundException e)
{
	out.println("ERROR IN LOADING DRIVER");
}
try{
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/30apr25ad?user=root&password=mishthu99");
	PreparedStatement ps=con.prepareStatement("select * from userinfo where username=? and password=?");
	ps.setString(1,UserName);
	ps.setString(2, Password);
	ResultSet rs=ps.executeQuery();
	if(UserName.equals("abc@gmail.com")&& Password.equals("abc@123"))
	{
	out.println("<font color=green size=5>Welcome"+UserName+"to Univarsal Informatic</font>");
	}
	else
	{
	out.println("<font color=red size=5>"+"Invalid UserName/Password</font>");
	}
}
catch(Exception e)
{
	out.println("ERROR IN SQL STATEMENT");
	}



%>
</body>
</html>