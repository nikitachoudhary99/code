<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
response.setHeader("Cache-Control","no-cache , no-store, must-revalidate");
response.setHeader("pragma", "no-cache");
response.setDateHeader("Expires", -1);
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>

 <br>
 <a href="amdproduct">Add /  Update / Delete Product Information</a><br><br>
 <a href="listofproducts">List Of All Products</a><br><br>
 <a href="search">Search Product Information</a><br><br>
 <a href="logout">Logout</a><br><br>
 <br>
 <%@include file="footer.jsp" %>
 
 <br>
</body>
</html>