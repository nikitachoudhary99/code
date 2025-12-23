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
        background-color: #f0f4f8;
        color: #333;
        margin: 0;
        padding: 0;
    }
    center {
        margin-top: 40px;
    }
    h1 {
        color: #005f99;
    }
    p {
        font-size: 18px;
        color: #666;
    }
    hr {
        border: none;
        border-top: 2px solid #005f99;
        width: 60%;
    }
    h3 {
        color: #444;
    }
    form {
        background-color: #ffffff;
        border: 1px solid #ccc;
        border-radius: 8px;
    }
    input[type="text"] {
       
        border: 1px solid #aaa;
        border-radius: 4px;
    }
    input[type="submit"] {
        
        background-color: #005f99;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-weight: bold;
    }
    input[type="submit"]:hover {
        background-color: #004477;
    }
    a {
        color: #005f99;
        text-decoration: none;
        font-weight: bold;
    }
    a:hover {
        text-decoration: underline;
    }
    address {
        
        font-style: normal;
        color: #666;
    }
</style>
</head>
<body>
<center>
<h1>Universal Imformatics</h1>
<p>Place for IT/CS students</p>
<br>
<hr>
<br>
<h3>Add/Update/Delete?product page</h3>
<br>
<h3>
<%
String msg=(String)request.getAttribute("msg");
		if(msg!=null)
		{
			out.print(msg);
		}

		%>
	</h3>
	<form action="Save.jsp">
	Product-Id<input type="text" name="pid"><br>
	<br><br>
	Product-Name<input type="text" name="pname"><br><br><br>
	Product-Price<input type="text" name="price"><br><br><br>
	<input type="submit" value="Add Product" name="b1"><br><br><br>
	<input type="submit" value="Update Product" name="b1"><br><br><br>
	<input type="submit" value="Delete Product" name="b1"><br><br><br>
	
</form>
<br>
<a href="Home.jsp">Back to Home page</a>
<hr>
<address>
Universal Informatics <br>
Bhawarkua, Indore<br>
Madhya Pradesh
</address>
	
</center>
</body>
</html>