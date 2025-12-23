<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
  body {
    font-family: Arial, sans-serif;
    background-color: #f8faff;
    color: #333;
    margin: 0; padding: 0;
  }
  center {
    margin-top: 50px;
  }
  h1 {
    color: #007acc;
  }
  hr {
    border: none;
    border-top: 2px solid #007acc;
    width: 60%;
    margin: 20px auto;
  }
  form {
    background-color: white;
    padding: 20px;
    border-radius: 8px;
    border: 1px solid #ccc;
    width: 320px;
  }
  label {
    display: block;
    margin-bottom: 8px;
    font-weight: bold;
  }
  input[type="text"], input[type="password"] {
    width: 100%;
    padding: 8px;
    margin-bottom: 15px;
    border: 1px solid #aaa;
    border-radius: 4px;
  }
  input[type="submit"] {
    background-color: #007acc;
    color: white;
    border: none;
    padding: 10px 16px;
    border-radius: 5px;
    font-weight: bold;
    cursor: pointer;
    width: 100%;
  }
  input[type="submit"]:hover {
    background-color: #005f99;
  }
  a {
    display: inline-block;
    margin-top: 15px;
    color: #007acc;
    font-weight: bold;
    text-decoration: none;
  }
  a:hover {
    text-decoration: underline;
  }
  h3 {
    color: red;
  }
  address {
    font-style: normal;
    color: #666;
    margin-top: 40px;
  }
</style>
</head>
<body>
<center>
<h1>Universal Informatics</h1>
<p>Place for IT/CS Students</p>
<hr>

<h3>
<%
String msg = (String)request.getAttribute("msg");
if(msg != null) {
    out.print(msg);
}
%>
</h3>

<form action="checkuser.jsp" method="post">
  <label for="username">Username</label>
  <input type="text" name="username" id="username" required>

  <label for="password">Password</label>
  <input type="password" name="password" id="password" required>

  <input type="submit" value="Login Here">
</form>

<a href="regest.jsp">New User Registration</a>

<hr>
<address>
Universal Informatics <br>
Bhawarkua, Indore<br>
Madhya Pradesh
</address>
</center>
</body>
</html>
