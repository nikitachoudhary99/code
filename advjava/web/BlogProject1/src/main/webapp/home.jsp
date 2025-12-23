<%@ page import="com.blog.pojo.User" %>
<jsp:include page="header.jsp" />

<%
    User user = (User) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<div style="padding: 30px; max-width: 900px; margin: auto;">

    <h2 style="color: #2c3e50;">Welcome, <%= user.getName() %> 👋</h2>

    <div style="margin-top: 20px;">
        <a href="add-blog.jsp" style="
            background-color: #3498db;
            color: white;
            padding: 10px 20px;
            text-decoration: none;
            border-radius: 4px;
            margin-right: 10px;
        ">➕ Add New Blog</a>

        <a href="profile.jsp" style="margin-right: 10px;">👤 My Profile</a>
        <a href="logout.jsp" style="color: red;">🚪 Logout</a>
    </div>

    <hr style="margin: 30px 0;">

    <h3>📝 Recent Blog Posts</h3>

    <!-- Placeholder for dynamic blog posts -->
    <div style="background: #f9f9f9; padding: 20px; border-radius: 5px;">
        <p><strong>Title:</strong> How to Build a Blog in Java</p>
        <p><strong>Author:</strong> <%= user.getName() %></p>
        <p><strong>Date:</strong> 13 June 2025</p>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit...</p>
        <a href="#">Read more →</a>
    </div>

    <!-- More blog entries can go here -->
</div>

<jsp:include page="footer.jsp" />
