<%@page import="com.ak.pojo.Product"%>
<%@page import="com.ak.daoimpl.ProductDaoImpl"%>
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
ProductDaoImpl daoimpl = new ProductDaoImpl();
Product pd = daoimpl.searchProduct(pid);
	if(pd!=null)
	{
		%>

		Product-Id<input type="text" name="pid" value="<%=pd.getpId()%>"><br><br>
		Product-Name<input type="text" name="pname" value="<%=pd.getpName()%>"><br><br>
		Product-Price<input type="text" name="price" value="<%=pd.getPrice()%>"><br><br>
		<input type="submit" value="Update Product Details" name="b1">

		
		<%	
		
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