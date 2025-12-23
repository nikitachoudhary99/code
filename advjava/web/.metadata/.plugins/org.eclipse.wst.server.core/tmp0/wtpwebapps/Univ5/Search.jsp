<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Product</title>
</head>
<body>
<center>
<h1>Universal Informatics</h1>
<p>Place for IT/CS Students</p>
<hr>

<form action="Searchresult.jsp" method="get">
    <label for="searchTerm">Enter Product Name or ID:</label><br><br>
    <input type="text" name="searchTerm" id="searchTerm" required>
    <br><br>
    <input type="submit" value="Search Product Details">
</form>

<br>
<a href="Home.jsp">Back To Product Home</a>
<hr>
<address>
Universal Informatics <br>
Bhawarkua, Indore<br>
Madhya Pradesh
</address>
</center>
</body>
</html>
