<%@page import="com.ak.daoimpl.ProductDaoImpl"%>
<%@page import="com.ak.pojo.Product"%>
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
<%
Product p = new Product();
try
{
	p.setpId(Integer.parseInt(request.getParameter("pid")));
}
catch(NumberFormatException e)
{
	out.print("Only Int Allowed");
}
p.setpName(request.getParameter("pname"));

try
{
	p.setPrice(Double.parseDouble(request.getParameter("price")));
}
catch(NumberFormatException e)
{
	
}

String op = request.getParameter("b1");
ProductDaoImpl daoimpl = new ProductDaoImpl();
	if(op.equals("Add Product"))
	{
	
	if(daoimpl.addProduct(p))
	{
		request.setAttribute("msg", "Product Added Successfully");
	}
	else
	{
		request.setAttribute("msg", "Product Could Not Be Added");
	}
	}
	
	if(op.equals("Update Product"))
	{
	
	if(daoimpl.updateProduct(p))
	{
		request.setAttribute("msg", "Product Updated Successfully");
	}
	else
	{
		request.setAttribute("msg", "Product Could Not Be Updated");
	}
	}
	
	if(op.equals("Update Product Details"))
	{
	if(daoimpl.updateProduct(p))
	{
		request.setAttribute("msg", "Product Updated Successfully");
	}
	else
	{
		request.setAttribute("msg", "Product Could Not Be Updated");
	}
	%>
	<jsp:forward page="modifyproduct.jsp"></jsp:forward>
	<%
	}
	
	
	if(op.equals("Delete Product"))
	{
	
	if(daoimpl.deleteProduct(p))
	{
		request.setAttribute("msg", "Product Deleted Successfully");
	}
	else
	{
		request.setAttribute("msg", "Product Could Not Be Deleted");
	}
	}
%>
<jsp:forward page="amdproduct.jsp"></jsp:forward>
</body>
</html>