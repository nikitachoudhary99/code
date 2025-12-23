<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
<br>
<h1>WELCOME 
<%
String username = (String)request.getAttribute("username");
out.print(username);
%>

To Universal Informatics</h1>

<a href="amdproduct.jsp">Add /Update /Delete Product Details</a><br><br>
<a href="listofallproducts.jsp">List Of All Product Details</a><br><br>
<a href="search.jsp">Search Product Details</a><br><br>
<a href="logout.jsp">Logout</a><br><br>
<br>
<br>
<br>
<%@include file="footer.jsp" %>
</body>
</html>
