<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Blog | BlogTube</title>
<style>
    @import url('https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap');

    body {
        margin: 0;
        padding: 0;
        font-family: 'Roboto', sans-serif;
        background: linear-gradient(to right, #e0eafc, #cfdef3);
        display: flex;
        justify-content: center;
        align-items: center;
        min-height: 100vh;
    }

    .blog-container {
        background: #fff;
        padding: 40px 50px;
        border-radius: 15px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.1);
        width: 500px;
    }

    h2 {
        text-align: center;
        color: #333;
        margin-bottom: 30px;
    }

    label {
        font-weight: bold;
        display: block;
        margin: 10px 0 5px;
        color: #444;
    }

    input[type="text"], textarea {
        width: 100%;
        padding: 10px 12px;
        border: 1px solid #ccc;
        border-radius: 10px;
        font-size: 15px;
        background: #f9f9f9;
        transition: 0.3s;
    }

    input[type="text"]:focus, textarea:focus {
        border-color: #007BFF;
        background: #fff;
        outline: none;
    }

    textarea {
        resize: none;
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        background-color: #007BFF;
        color: white;
        border: none;
        border-radius: 10px;
        font-size: 16px;
        font-weight: bold;
        margin-top: 20px;
        cursor: pointer;
        transition: 0.3s;
    }

    input[type="submit"]:hover {
        background-color: #0056b3;
    }

    .links {
        margin-top: 20px;
        text-align: center;
    }

    .links a {
        color: #007BFF;
        text-decoration: none;
        font-size: 14px;
        margin: 0 10px;
    }

    .links a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>

<div class="blog-container">
    <h2>✍️ Create New Blog Post</h2>
    <form action="addblog" method="post">
        <label for="title">Title:</label>
        <input type="text" id="title" name="title" required>

        <label for="content">Content:</label>
        <textarea id="content" name="content" rows="8" required></textarea>

        <input type="submit" value="Post Blog">
    </form>

    <div class="links">
        <a href="addBlog.jsp">➕ Create New Blog</a> |
        <a href="index.jsp">🏠 Back to Home</a>
    </div>
</div>

</body>
</html>
