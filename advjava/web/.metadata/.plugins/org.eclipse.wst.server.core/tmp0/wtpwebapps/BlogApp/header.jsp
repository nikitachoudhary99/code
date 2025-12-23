<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BlogTube</title>
<style>
    nav {
        background-color: #34495e;
        padding: 10px 20px;
        display: flex;
        justify-content: space-between;
        align-items: center;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    }

    nav .logo {
        font-size: 24px;
        color: #ecf0f1;
        font-weight: bold;
        text-decoration: none;
    }

    nav .nav-links a {
        color: #ecf0f1;
        text-decoration: none;
        margin: 0 15px;
        font-size: 16px;
        transition: color 0.3s ease;
    }

    nav .nav-links a:hover {
        color: #1abc9c;
    }
</style>
</head>
<body>

<nav>
    <a class="logo" href="index.jsp">BlogTube</a>
    <div class="nav-links">
        <a href="index.jsp">Home</a>
        <% if (session.getAttribute("user") != null) { %>
            <a href="profile.jsp">Profile</a>
            <a href="addBlog.jsp">Add Blog</a>
            <a href="logout">Logout</a>
        <% } else { %>
            <a href="login.jsp">Login</a>
            <a href="register.jsp">Register</a>
        <% } %>
    </div>
</nav>

</body>
</html>
