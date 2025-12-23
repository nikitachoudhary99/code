<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<style>
    ul {
        list-style-type: none;
        padding: 0;
    }
    ul li {
        margin: 10px 0;
    }
    a {
        text-decoration: none;
        color: #005f99;
        font-weight: bold;
    }
    a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>
<center>
<h1>Universal Informatics</h1>
<p>Place for IT/CS students</p>
<br>

<%
    String username = (String) request.getAttribute("username");
    if (username == null || username.trim().isEmpty()) {
        response.sendRedirect("Login.jsp");
        return;
    }
%>

<h1>WELCOME <%= username %> TO Universal Informatics</h1>

<ul>
  <li><a href="amdproduct.jsp">Add / Update / Delete Product Details</a></li>
  <li><a href="ListOfProduct.jsp">List of All Product Details</a></li>
  <li><a href="Search.jsp">Search Product Details</a></li>
  <li><a href="Logout.jsp">Logout</a></li>
</ul>

<br><br><br>
<hr>
<address>
Universal Informatics <br>
Bhawarkua, Indore<br>
Madhya Pradesh
</address>

</center>
</body>
</html>
