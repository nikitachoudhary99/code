<%@ page import="com.blog.pojo.User" %>
<jsp:include page="header.jsp" />

<%
  User user = (User) session.getAttribute("user");
  if (user == null) {
    response.sendRedirect("login.jsp");
    return;
  }
%>

<div class="hero">
  <h1>Welcome, <%= user.getName() %>!</h1>
  <a href="add-blog.jsp" class="btn">Add New Blog</a>
</div>

<section class="posts-grid">
  <!-- Loop your blog posts here -->
  <article class="post-card">
    <img src="images/post1.jpg" alt="Post Image">
    <div class="content">
      <h2>Blog Post Title</h2>
      <p>Short excerpt goes here…</p>
      <a href="read.jsp?id=1" class="read-more">Read More →</a>
    </div>
  </article>
  <!-- Repeat -->
</section>

<jsp:include page="footer.jsp" />
