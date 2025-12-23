<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header.jsp"/>

<!DOCTYPE html>
<html>
<head>
    <title>Edit Profile - Blog System</title>
    <style>
        body {
            background: linear-gradient(to right, #f2f9ff, #e3f2fd);
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        .profile-container {
            width: 100%;
            max-width: 500px;
            margin: 80px auto;
            padding: 30px;
            background-color: #ffffff;
            border-radius: 12px;
            box-shadow: 0px 0px 12px rgba(0, 0, 0, 0.1);
        }

        .profile-container h2 {
            text-align: center;
            color: #333;
            margin-bottom: 25px;
        }

        .profile-container label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
            color: #444;
        }

        .profile-container input[type="text"],
        .profile-container input[type="email"],
        .profile-container input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 18px;
            border: 1px solid #bbb;
            border-radius: 6px;
            font-size: 14px;
        }

        .profile-container button {
            width: 100%;
            padding: 10px;
            background-color: #008cba;
            color: white;
            border: none;
            font-size: 16px;
            border-radius: 6px;
            cursor: pointer;
        }

        .profile-container button:hover {
            background-color: #006f99;
        }
    </style>
</head>
<body>

<div class="profile-container">
    <h2>Edit Profile</h2>
    <form action="EditProfileServlet" method="post">
        <label for="name">Full Name:</label>
        <input type="text" name="name" id="name" value="<%= session.getAttribute("user_name") %>" required>

        <label for="email">Email:</label>
        <input type="email" name="email" id="email" value="<%= session.getAttribute("user_email") %>" required>

        <label for="password">New Password:</label>
        <input type="password" name="password" id="password" placeholder="Leave blank to keep current">

        <button type="submit">Update Profile</button>
    </form>
</div>

</body>
</html>

<jsp:include page="footer.jsp"/>
    