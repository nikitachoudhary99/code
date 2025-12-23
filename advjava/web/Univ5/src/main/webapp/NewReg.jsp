<%@ page import="java.sql.*" %>
<%@ page import="com.pojo.Userinfo" %>
<%@ page import="com.daoimpl.UserinfoDaoimpl" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Register User</title></head>
<body>
<center>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String msg = "";

    if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
        msg = "Username and Password are required!";
        request.setAttribute("msg", msg);
        request.getRequestDispatcher("regest.jsp").forward(request, response);
        return;
    }

    try {
        Userinfo u = new Userinfo();
        u.setUsername(username);
        u.setPassword(password);

        UserinfoDaoimpl dao = new UserinfoDaoimpl();

        boolean isAdded = dao.addNewUser(u);
        if (isAdded) {
            msg = "Registration successful! Please login.";
            request.setAttribute("msg", msg);
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        } else {
            msg = "Registration failed. User may already exist.";
            request.setAttribute("msg", msg);
            request.getRequestDispatcher("regest.jsp").forward(request, response);
        }
    } catch (Exception e) {
        msg = "Error: " + e.getMessage();
        request.setAttribute("msg", msg);
        request.getRequestDispatcher("regest.jsp").forward(request, response);
    }
%>
</center>
</body>
</html>
