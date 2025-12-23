<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Update Password</title>

  <!-- Bootstrap + Space Theme CSS -->
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/templatemo-style.css">
</head>
<body>
  <!-- Background video -->
  <video autoplay muted loop id="bg-video">
    <source src="video/gfp-astro-timelapse.mp4" type="video/mp4">
  </video>

  <!-- ✅ Header -->
  <%@include file="header.jsp" %>

  <!-- Page Content -->
  <div class="page-container">
    <div class="container tm-content-container">
      <div class="row justify-content-center">
        <div class="col-lg-6">
          <div class="tm-bg-black-transparent p-5 rounded text-center">
            <h3 class="mb-4">Update Your Password</h3>

            <!-- Success / Error message -->
            <%
              String msg = (String) request.getAttribute("msg");
              if (msg != null) {
                  out.println("<p style='color:yellow'>" + msg + "</p>");
              }
            %>

            <!-- Update Password Form -->
            <form:form method="post" action="updatePassword" modelAttribute="userObj">
              
              <div class="form-group">
                <label for="username">Username</label>
                <form:input path="username" id="username" class="form-control" placeholder="Enter your username" />
              </div>

              <div class="form-group">
                <label for="newPassword">New Password</label>
                <form:password path="newPassword" id="newPassword" class="form-control" placeholder="Enter new password" />
              </div>

              <div class="form-group">
                <label for="confirmPassword">Confirm New Password</label>
                <form:password path="confirmPassword" id="confirmPassword" class="form-control" placeholder="Re-enter new password" />
              </div>

              <button type="submit" class="btn btn-primary btn-block mt-3">Update Password</button>
            </form:form>

            <br>
            <a href="home" class="text-white">⬅ Back To Home</a>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- ✅ Footer -->
  <%@include file="footer.jsp" %>

  <!-- Scripts -->
  <script src="js/jquery-3.5.1.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
</body>
</html>
