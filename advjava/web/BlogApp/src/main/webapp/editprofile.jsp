<%@page import="com.ak.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
    User user = (User) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<body>
<div class="form-container">
    <h2>Edit Profile</h2>
    <form action="updateProfile" method="post">
        <input type="hidden" name="id" value="<%= user.getId()%>"/>

        <label>Name:</label>
        <input type="text" name="name" value="<%= user.getName() %>" required />

        <label>Email:</label>
        <input type="email" name="email" value="<%= user.getEmail() %>" required />

        <label>Password:</label>
        <input type="password" name="password" value="<%= user.getPassword()	 %>" required />

        <input type="submit" value="Update Profile" />
    </form>
</div>
</body>
</html>