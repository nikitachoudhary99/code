<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>AMD Course</title>

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

  <!-- ✅ Form Section -->
  <div class="page-container">
    <div class="container-fluid tm-content-container">
      <div class="row justify-content-center">
        <div class="col-lg-6">
          <div class="tm-bg-black-transparent text-center p-5">
            <h2 class="mb-4">🚀 AMD Course</h2>

            <!-- Success / Error Message -->
            <%
              String msg = (String) request.getAttribute("msg");
              if (msg != null) {
            %>
                <p style="color: #00ffcc; font-weight: bold;"><%= msg %></p>
            <% } %>

            <!-- Form for Course -->
            <form:form action="saveCourse" method="post" modelAttribute="courseObj">

              <div class="form-group mb-3">
                <label for="courseId">Course Id</label>
                <form:input type="text" id="courseId" class="form-control" path="id" placeholder="Enter Course Id"/>
              </div>

              <div class="form-group mb-3">
                <label for="courseName">Course Name</label>
                <form:input type="text" id="courseName" class="form-control" path="courseName" placeholder="Enter Course Name"/>
              </div>

              <div class="form-group mb-3">
                <label for="courseDesc">Course Description</label>
                <form:input type="text" id="courseDesc" class="form-control" path="description" placeholder="Enter Course Description"/>
              </div>

              <div class="d-grid gap-2">
                <input class="btn btn-primary text-uppercase" type="submit" value="Add Course" name="b1">
                <input class="btn btn-warning text-uppercase" type="submit" value="Update Course" name="b1">
                <input class="btn btn-danger text-uppercase" type="submit" value="Delete Course" name="b1">
              </div>

            </form:form>

            <hr class="my-4">
            <a href="home" class="btn btn-secondary">⬅ Back To Home Page</a>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- ✅ Footer -->
  <%@include file="footer.jsp" %>

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
