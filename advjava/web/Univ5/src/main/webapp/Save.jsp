
<%@page import="com.daoimpl.ProductDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Save</title>
</head>
<body>
<center>
<%
    int pid = 0;
    double price = 0.0;
    String pname = request.getParameter("pname");
    String msg = "";

    try {
        pid = Integer.parseInt(request.getParameter("pid"));
    } catch (NumberFormatException e) {
        out.println("<p style='color:red;'>Invalid Product ID. Only integers allowed.</p>");
        return;
    }
    try {
        price = Double.parseDouble(request.getParameter("price"));
    } catch (NumberFormatException e) {
        out.println("<p style='color:red;'>Invalid price format.</p>");
        return;
    }

    if (pname == null || pname.trim().isEmpty()) {
        out.println("<p style='color:red;'>Product Name is required.</p>");
        return;
    }
    
    String b1 = (String)request.getAttribute("b1");
    ProductDaoImpl pdaoimpl = new ProductDaoImpl();
    
    if(b1=="Add Product"){
    	if(pdaoimpl.addProduct(p)==true){
    		
    	}
    }
%>

<h2><%= msg %></h2>
<a href="amdproduct.jsp">Back to Product Management</a>

</center>
</body>
</html>
