<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f8ff;
    }
    h1 {
        color: #2e8b57;
    }
    a {
        text-decoration: none;
        font-size: 18px;
        color: #1e90ff;
        transition: color 0.3s, transform 0.2s;
    }
    a:hover {
        color: #ff4500;
        transform: scale(1.05);
    }
    hr {
        border: 1px solid #2e8b57;
        width: 80%;
    }
    address {
        font-style: normal;
        color: #555;
    }
</style>
<script>
    window.onload = function() {
        const username = '<%= request.getAttribute("username") != null ? request.getAttribute("username") : "Guest" %>';
        alert("Welcome " + username + " to Universal Informatics!");
    };
</script>
</head>
<body>
<center>
<h1>Universal Informatics</h1>
<p>place for IT/CS Students</p>
<br>
<hr>
<br>
<h1>WELCOME 
<%
String username = (String)request.getAttribute("username");
out.print(username);
%>

To Universal Informatics</h1>
<a href="amdproduct.jsp">Add /Update Delete Product Details</a><br><br>
<a href="">List Of All Product Details</a><br><br>
<a href="">Search Product Details</a><br><br>
<a href="">Logout</a><br><br>
<br>
<br>
<br>
<hr>
<address>
Universal Informatics <br>
Bhawarkua, Indore<br>
Madhya Pradesh
</address>
</center>
</body>
</html> 
