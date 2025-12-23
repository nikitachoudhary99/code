<%@page import="com.ak.pojo.Blog"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Blog | BlogTube</title>
<style>
    @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap');

    body {
        font-family: 'Poppins', sans-serif;
        background: linear-gradient(135deg, #e0f7fa, #fff);
        display: flex;
        justify-content: center;
        align-items: center;
        min-height: 100vh;
        margin: 0;
    }

    .edit-container {
        background: #ffffff;
        padding: 40px;
        width: 500px;
        border-radius: 15px;
        box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
    }

    h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #333;
    }

    label {
        font-weight: 600;
        margin-bottom: 5px;
        display: block;
    }

    input[type="text"],
    textarea {
        width: 100%;
        padding: 10px 12px;
        border: 1px solid #ccc;
        border-radius: 8px;
        margin-bottom: 20px;
        font-size: 15px;
    }

    textarea {
        resize: none;
    }

    button[type="submit"] {
        width: 100%;
        background-color: #007BFF;
        color: white;
        padding: 12px;
        border: none;
        font-size: 16px;
        font-weight: bold;
        border-radius: 8px;
        cursor: pointer;
        transition: background-color 0.3s;
    }

    button[type="submit"]:hover {
        background-color: #0056b3;
    }

    .back-link {
        margin-top: 15px;
        text-align: center;
    }

    .back-link a {
        text-decoration: none;
        color: #007BFF;
        font-size: 14px;
    }

    .back-link a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>

<%
  Blog blog = (Blog) request.getAttribute("blog");
%>

<div class="edit-container">
    <h2>📝 Edit Blog</h2>
    <form action="editBlog" method="post">
        <input type="hidden" name="id" value="<%= blog.getId() %>">

        <label for="title">Title:</label>
        <input type="text" name="title" id="title" value="<%= blog.getTitle() %>" required>

        <label for="content">Content:</label>
        <textarea name="content" id="content" rows="8" required><%= blog.getContent() %></textarea>

        <button type="submit">Update Blog</button>
    </form>

    <div class="back-link">
        <a href="AllBlog.jsp">⬅ Back to All Blogs</a>
    </div>
</div>

</body>
</html>
