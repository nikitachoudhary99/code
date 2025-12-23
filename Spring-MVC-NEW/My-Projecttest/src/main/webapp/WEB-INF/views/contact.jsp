<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Contact Us - My Spring MVC App</title>
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
      <div class="tm-bg-dark p-5 rounded">
        <h2 class="text-white mb-4">Contact Us</h2>
        <form action="sendMessage" method="post">
          <div class="mb-3">
            <label class="form-label text-white">Your Name</label>
            <input type="text" name="name" class="form-control" required />
          </div>
          <div class="mb-3">
            <label class="form-label text-white">Email</label>
            <input type="email" name="email" class="form-control" required />
          </div>
          <div class="mb-3">
            <label class="form-label text-white">Message</label>
            <textarea name="message" class="form-control" rows="5" required></textarea>
          </div>
          <button type="submit" class="btn btn-primary">Send</button>
        </form>
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
