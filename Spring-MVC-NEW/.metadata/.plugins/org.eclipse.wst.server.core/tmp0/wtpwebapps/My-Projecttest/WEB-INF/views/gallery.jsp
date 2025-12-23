<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Gallery - My Spring MVC App</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/slick.css">
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
        <h2 class="text-white mb-4">Gallery</h2>
        <div class="row g-4">
          <!-- Image 1 -->
          <div class="col-md-4">
            <div class="card bg-dark text-white shadow">
              <img src="${pageContext.request.contextPath}/resources/images/gallery1.jpg" class="card-img-top" alt="Gallery Image 1">
              <div class="card-body">
                <p class="card-text">Beautiful Landscape</p>
              </div>
            </div>
          </div>
          <!-- Image 2 -->
          <div class="col-md-4">
            <div class="card bg-dark text-white shadow">
              <img src="${pageContext.request.contextPath}/resources/images/gallery2.jpg" class="card-img-top" alt="Gallery Image 2">
              <div class="card-body">
                <p class="card-text">City Lights</p>
              </div>
            </div>
          </div>
          <!-- Image 3 -->
          <div class="col-md-4">
            <div class="card bg-dark text-white shadow">
              <img src="${pageContext.request.contextPath}/resources/images/gallery3.jpg" class="card-img-top" alt="Gallery Image 3">
              <div class="card-body">
                <p class="card-text">Starry Sky</p>
              </div>
            </div>
          </div>
          <!-- Add more images as needed -->
        </div>
      </div>
    </div>
  </div>

  <!-- Footer -->
  <%@ include file="footer.jsp" %>

  <!-- Scripts -->
  <script src="${pageContext.request.contextPath}/resources/js/jquery-3.5.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/js/slick.js"></script>
  <script src="${pageContext.request.contextPath}/resources/js/templatemo-script.js"></script>
</body>
</html>
