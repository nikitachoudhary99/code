<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.blog.pojo.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Profile - BlogTube</title>
<link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;600&display=swap" rel="stylesheet">
<style>
    body {
        font-family: 'Inter', sans-serif;
        margin: 0;
        background-color: #f4f6f8;
    }

    .profile-container {
        max-width: 500px;
        margin: 60px auto;
        padding: 30px;
        background-color: #fff;
        border-radius: 12px;
        box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1);
    }

    .profile-container h2 {
        text-align: center;
        margin-bottom: 30px;
        color: #333;
    }

    .profile-field {
        margin-bottom: 15px;
        font-size: 16px;
    }

    .profile-field strong {
        color: #555;
        display: inline-block;
        width: 90px;
    }

    .profile-actions {
        text-align: center;
        margin-top: 30px;
    }

    .profile-actions a {
        text-decoration: none;
        padding: 10px 22px;
        margin: 0 8px;
        border-radius: 6px;
        font-weight: 600;
        transition: background 0.3s ease;
    }

    .btn-edit {
        background-color: #2980b9;
        color: #fff;
    }

    .btn-edit:hover {
        background-color: #2471a3;
    }

    .btn-home {
        background-color: #2ecc71;
        color: #fff;
    }

    .btn-home:hover {
        background-color: #27ae60;
    }

    .masked-password {
        letter-spacing: 3px;
        font-style: italic;
        color: #999;
    }
</style>
</head>
<body>

<jsp:include page="header.jsp" />

<%
    User user = (User) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<div class="profile-container">
    <h2>👤 My Profile</h2>

    <div class="profile-field"><strong>Name:</strong> <%= user.getName() %></div>
    <div class="profile-field"><strong>Email:</strong> <%= user.getEmail() %></div>
    <div class="profile-field"><strong>Password:</strong> <span class="masked-password">••••••••</span></div>

    <div class="profile-actions">
        <a href="edit-profile.jsp" class="btn-edit">✏️ Edit Profile</a>
        <a href="home.jsp" class="btn-home">🏠 Home</a>
    </div>
</div>

<jsp:include page="footer.jsp" />

</body>
</html>
