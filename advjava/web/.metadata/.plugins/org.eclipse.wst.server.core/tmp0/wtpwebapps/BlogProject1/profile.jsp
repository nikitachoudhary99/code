<%@ page import="com.blog.pojo.User" %>
<jsp:include page="header.jsp" />

<%
    User user = (User) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<div style="max-width: 500px; margin: 50px auto; padding: 20px; border: 1px solid #ccc; border-radius: 8px; background: #fff;">
    <h2 style="text-align: center;">My Profile</h2>
    
    <p><strong>Name:</strong> <%= user.getName() %></p>
    <p><strong>Email:</strong> <%= user.getEmail() %></p>
    <p><strong>Password:</strong> <%= user.getPassword() %></p>

    <div style="margin-top: 20px; text-align: center;">
        <a href="edit-profile.jsp" style="text-decoration: none; padding: 10px 20px; background-color: #2980b9; color: white; border-radius: 5px;">✏️ Edit Profile</a>
        <a href="home.jsp" style="text-decoration: none; padding: 10px 20px; background-color: #2ecc71; color: white; border-radius: 5px; margin-left: 10px;">🏠 Home</a>
    </div>
</div>

<jsp:include page="footer.jsp" />
