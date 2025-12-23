<%@page import="com.ak.pojo.Blog"%>
<%@page import="com.ak.pojo.User"%>
<%@page import="java.util.List"%>
<%@page import="com.ak.daoimpl.BlogDaoImpl"%>
<%@page import="com.ak.dao.BlogDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BlogTube | Home</title>
<style>
    @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;700&display=swap');

    body {
        margin: 0;
        padding: 0;
        font-family: 'Poppins', sans-serif;
        background: linear-gradient(to right, #f5f7fa, #c3cfe2);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        background-color: white;
        padding: 40px 50px;
        border-radius: 20px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.15);
        width: 500px;
        text-align: center;
    }

    h2 {
        color: #333;
        font-size: 28px;
        margin-bottom: 30px;
    }

    .nav-links a {
        display: block;
        background: #ff6b6b;
        color: white;
        text-decoration: none;
        padding: 12px 20px;
        margin: 10px auto;
        border-radius: 12px;
        font-weight: 500;
        width: 80%;
        transition: background 0.3s;
    }

    .nav-links a:hover {
        background: #ff4d4d;
    }

    .nav-links a::before {
        content: '👉 ';
    }

    .footer-text {
        margin-top: 30px;
        font-size: 14px;
        color: #666;
    }
</style>
</head>

<body>

<div class="container">
    <h2>Welcome to <span style="color:#ff6b6b;">BlogTube</span></h2>
    <div class="nav-links">
        <a href="index.jsp">🏠 Home</a>
        <a href="editprofile.jsp">📝 Edit Profile</a>
        <a href="CreateBlog.jsp">➕ Create Blog</a>
        <a href="AllBlog.jsp">📚 View All Blogs</a>
        <a href="logout.jsp">🚪 Logout</a>
    </div>
    <div class="footer-text">
        Happy Blogging! 📢 Share your thoughts with the world.
    </div>
</div>

<%@ include file="footer.jsp" %>

</body>
</html>
