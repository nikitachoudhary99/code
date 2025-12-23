<%@page import="com.ak.pojo.User"%>
<%@ page session="true" %>
<%
    // Optional: restrict access to only admins
    User user = (User) session.getAttribute("user");
    if (user == null || !"admin@gmail.com".equals(user.getEmail())) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Dashboard</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background-color: #f0f2f5;
            margin: 0;
            padding: 0;
        }
        .header {
            background-color: #343a40;
            color: white;
            padding: 20px;
            text-align: center;
        }
        .admin-container {
            max-width: 800px;
            margin: 30px auto;
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px #ccc;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        .admin-links {
            display: flex;
            flex-direction: column;
            gap: 15px;
            margin-top: 30px;
        }
        .admin-links a {
            background-color: #007BFF;
            color: white;
            text-decoration: none;
            padding: 12px;
            text-align: center;
            border-radius: 5px;
            font-weight: bold;
        }
        .admin-links a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="header">
    <h1>Welcome, Admin </h1>
</div>

<div class="admin-container">
    <h2>Admin Panel</h2>
    <div class="admin-links">
        <a href="allblog.jsp">View All Blogs</a>
        <a href="users.jsp">Manage Users</a>
        <a href="createblog.jsp">Create New Blog</a>
        <a href="logout.jsp">Logout</a>
    </div>
</div>
</body>
</html>
