<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>About Us - My Spring MVC App</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/templatemo-style.css">
</head>
<body>
  <!-- Background Video -->
  <video autoplay muted loop id="bg-video">
    <source src="${pageContext.request.contextPath}/resources/video/gfp-astro-timelapse.mp4" type="video/mp4">
  </video>

  <!-- Header -->
  <%@ include file="header.jsp" %>

  <!-- Content -->
  <div class="page-container">
    <div class="container tm-content-container">
      <div class="tm-bg-dark tm-about-container p-5 rounded">
        <h2 class="text-white mb-4">About Us</h2>
        <p class="text-white">
          Welcome to <b>My Spring MVC Application</b>.  
          This project is built using Spring MVC, JSP, Servlets, and MySQL database.  
          You can describe your team, your mission, or purpose here.
        </p>
        <p class="text-white">
          ✨ This template is responsive and uses Bootstrap + TemplateMo AstroMotion theme.
        </p>
      </div>
    </div>
  </div>

  <!-- Footer -->
  <%@ include file="footer.jsp" %>

  <!-- Scripts -->
  <script src="${pageContext.request.contextPath}/resources/js/jquery-3.5.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
