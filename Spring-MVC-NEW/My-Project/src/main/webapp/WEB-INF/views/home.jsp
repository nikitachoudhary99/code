<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Astro Motion by TemplateMo</title>
  <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@300;400&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/slick.css" type="text/css" /> 
  <link rel="stylesheet" href="css/templatemo-style.css">
</head>
<body>
  <video autoplay muted loop id="bg-video">
    <source src="video/gfp-astro-timelapse.mp4" type="video/mp4">
  </video>

  <!-- ✅ Header include -->
  <%@include file="header.jsp" %>

  <!-- ✅ Page content -->
  <div class="page-container">
    <div class="container-fluid tm-content-container">
      <ul class="cd-hero-slider mb-0 py-5">
        <!-- Existing Sections (Home, Gallery, About, Contact) same as your code -->
        <!-- copy <li> ... </li> content here from original page -->
      </ul>
    </div>
  </div>

  <!-- ✅ Footer include -->
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

  <!-- Script to load header & footer dynamically -->
  <script>
    $(function(){
      $("#header").load("header.jsp");
      $("#footer").load("footer.jsp");
    });
  </script>
</body>
</html>
