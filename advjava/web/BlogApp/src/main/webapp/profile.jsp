<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.ak.pojo.User" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Profile - BlogTube</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 600px;
            background: white;
            margin: 50px auto;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
        }
        h2 {
            text-align: center;
            color: #444;
        }
        input[type="text"], input[type="email"] {
            width: 100%;
            padding: 10px;
            margin: 12px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button {
            background: #007BFF;
            color: white;
            padding: 10px 20px;
            border: none;
            margin-top: 10px;
            cursor: pointer;
            border-radius: 5px;
        }
        button:hover {
            background: #0056b3;
        }
    </style>
</head>
<body>
<%@ include file="header.jsp" %>

<div class="container">
    <%
      User user = (User) session.getAttribute("user");
      if (user != null) {
    %>
        <h2>Update Profile</h2>
        <form action="profile" method="post">
            Name: <input type="text" name="name" value="<%= user.getName() %>" required><br>
            Email: <input type="email" name="email" value="<%= user.getEmail() %>" required><br>
            <button type="submit">Update</button>
        </form>
    <%
      } else {
    %>
        <p>You are not logged in. Please <a href="login.jsp">login</a>.</p>
    <%
      }
    %>
</div>

<%@ include file="footer.jsp" %>
</body>
</html>
