<%@page import="com.pojo.Userinfo"%>
<%@page import="com.daoimpl.UserinfoDaoimpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Check</title>
</head>
<body>
<center>
<h1>Universal Informatics</h1>
<p>Place for IT/CS students</p>
<br><br><br>
<h3>
<%
    // Read username and password from request parameters
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username != null && password != null && !username.trim().isEmpty() && !password.trim().isEmpty()) {
        Userinfo u = new Userinfo();
        u.setUsername(username);
        u.setPassword(password);

        UserinfoDaoimpl daoimpl = new UserinfoDaoimpl();
        boolean isvalid = daoimpl.CheckuserCredential(u);

        if (isvalid) {
            // Pass username to next JSP page
            request.setAttribute("username", u.getUsername());
            %><jsp:forward page="Home.jsp" /><%
        } else {
            request.setAttribute("msg", "Invalid Username / Password");
            %><jsp:forward page="Login.jsp" /><%
        }
    } else {
        // If username or password is missing, redirect back with message
        request.setAttribute("msg", "Please enter username and password.");
        %><jsp:forward page="Login.jsp" /><%
    }
%>
</h3>
<br><br><br>
<hr>
<address>
Universal Informatics<br>
Bhawarkua, Indore<br>
Madhya Pradesh
</address>
</center>
</body>
</html>
