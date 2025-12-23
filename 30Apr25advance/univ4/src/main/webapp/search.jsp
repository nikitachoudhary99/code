<%@page import="com.ak.pojo.Product"%>
<%@page import="java.util.List"%>
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
<form action="modifyproduct.jsp">
<h2>Select Product-Id To Search Product Details</h2>
<select name="s1">
<br>
<%
ProductDaoImpl daoimpl = new ProductDaoImpl();
List<Product> lst = daoimpl.getAllProducts();
		int i=0;
	for(i = 0; i<lst.size(); i++)
	{
		Product pd = lst.get(i);
		%>
		<option value="<%=pd.getpId()%>"><%=pd.getpId()%></option>
		<%	
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