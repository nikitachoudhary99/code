<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Blogs | BlogTube</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: #f9f9fb;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 80%;
            margin: 40px auto;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 30px;
        }

        .blog-card {
            background: #fff;
            border-radius: 10px;
            padding: 20px;
            margin-bottom: 20px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.05);
            transition: all 0.3s ease;
        }

        .blog-card:hover {
            box-shadow: 0 6px 14px rgba(0, 0, 0, 0.1);
        }

        .blog-card h3 {
            color: #2c3e50;
            margin-bottom: 10px;
        }

        .blog-card p {
            color: #555;
            line-height: 1.6;
        }

        .blog-card small {
            color: #999;
        }

        .back-link {
            display: block;
            text-align: center;
            margin-top: 30px;
        }

        .back-link a {
            color: #007bff;
            text-decoration: none;
            font-weight: bold;
        }

        .back-link a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<%@ include file="header.jsp" %>

<div class="container">
    <h2>📚 All Blog Posts</h2>

    <c:forEach var="blog" items="${blogList}">
        <div class="blog-card">
            <h3>${blog.title}</h3>
            <p>${blog.content}</p>
            <small>Posted by User ID: ${blog.userId}</small>
        </div>
    </c:forEach>

    <div class="back-link">
        <a href="home.jsp">⬅ Back to Home</a>
    </div>
</div>

<%@ include file="footer.jsp" %>

</body>
</html>
