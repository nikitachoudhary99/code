<%@page import="java.sql.SQLException"%>
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
int id=0;
String username;
int roll=0;
int mob=0;
try{
	id=Integer.parseInt(request.getParameter("id"));
	
}
catch(Exception e)
{
 out.print("only int allowed id");	
}


username=request.getParameter("username");


try{
	
	roll=Integer.parseInt(request.getParameter("roll"));
	
}
catch(Exception e)
{
	out.print("only int allowed roll" +e);	
}

try{
	
	mob=Integer.parseInt(request.getParameter("mob"));
	
}
catch(Exception e)
{
	out.print("only int allowed in mob" +e);	
}

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
}
catch(ClassNotFoundException e)
{
	out.print("Error in loading drivers");
}
String op = request.getParameter("b1");
try
{
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost"+
	":3306/30apr25ad?user=root&password=mishthu99");
	
	if(op.equals("Add studentinfo"))
	{
		PreparedStatement ps=con.prepareStatement("insert into studentinfo values(?,?,?,?)");
		ps.setInt(1,id);
		ps.setString(2,username);
		ps.setInt(3,roll);
		ps.setInt(4, mob);
		int count=ps.executeUpdate();
		if(count>0)
		{
			request.setAttribute("msg", "student successfully added");
		}
		else
		{
			request.setAttribute("msg", "student no added");
		}
	}
	if(op.equals("Update studentinfo"))
	{
		PreparedStatement ps=con.prepareStatement("update studentinfo set username=?,roll=?,mob=? where id=?");
		
		ps.setString(1,username);
		ps.setInt(2,roll);
		ps.setInt(3,mob);
		ps.setInt(4,id);
		int count=ps.executeUpdate();
		if(count>0)
		{
			request.setAttribute("msg", "student successfully updated");
		}
		else
		{
			request.setAttribute("msg", "student no updated");
		}	
	}
	if(op.equals("Delete studentinfo"))
	{
		PreparedStatement ps=con.prepareStatement("delete form studentinfo where id=?");
		ps.setInt(1,id);
		int count=ps.executeUpdate();
		if(count>0)
		{
			request.setAttribute("msg", "student successfully deleted");
		}
		else
		{
			request.setAttribute("msg", "student no deleted");
		}	
	}

}
catch(SQLException e)
{
	out.print(e);
}

%>
<jsp:forward page="studentinfo.jsp"></jsp:forward>
</body>
</html>