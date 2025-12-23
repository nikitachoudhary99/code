<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Course Home</title>

  <!-- Fonts & CSS -->
  <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@300;400&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/slick.css" type="text/css" /> 
  <link rel="stylesheet" href="css/templatemo-style.css">
</head>
<body>
  <!-- Background video -->
  <video autoplay muted loop id="bg-video">
    <source src="video/gfp-astro-timelapse.mp4" type="video/mp4">
  </video>

  <!-- ✅ Header -->
  <%@include file="header.jsp" %>

  <!-- ✅ Page Content -->
  <div class="page-container">
    <div class="container-fluid tm-content-container">
      <div class="row justify-content-center">
        <div class="col-lg-6">
          <div class="tm-bg-black-transparent text-center p-5">
            <h2 class="mb-4">🚀 Course Home Page</h2>
            
            <!-- Links for Course -->
            <a href="amdcourse">Add / Update / Delete Course Details</a><br><br>
            <a href="listcourse">List Of All Course Details</a><br><br>
            <a href="searchcourse">Search Course Details</a><br><br>
            <a href="logout">Logout</a><br><br>

          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- ✅ Footer -->
  <%@ include file="footer.jsp" %>

  <!-- Loader -->
  <div id="loader-wrapper">            
    <div id="loader"></div>
    <div class="loader-section section-left"></div>
    <div class="loader-section section-right"></div>
  </div>  

  <!-- Scripts -->
  <script src="js/jquery-3.5.1.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/slick.js"></script>
  <script src="js/templatemo-script.js"></script>
</body>
</html>
