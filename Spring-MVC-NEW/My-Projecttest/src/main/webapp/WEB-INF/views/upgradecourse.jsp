<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page import="com.univ.pojo.Course"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Update Course</title>
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/templatemo-style.css">
</head>
<body>
  <video autoplay muted loop id="bg-video">
    <source src="video/gfp-astro-timelapse.mp4" type="video/mp4">
  </video>
  <%@include file="header.jsp" %>

  <div class="page-container">
    <div class="container tm-content-container">
      <div class="tm-bg-black-transparent p-5 rounded">
        <h3 class="text-center">✏️ Update Course</h3>
        <%
          String msg = (String) request.getAttribute("msg");
          if (msg != null) out.println("<p style='color:yellow'>" + msg + "</p>");
          Course c = (Course) request.getAttribute("course");
        %>
        <form action="upgradecourse" method="post">
          <div class="form-group">
            <label>Course Id</label>
            <input type="text" name="id" class="form-control" value="<%=c!=null ? c.getId() : ""%>" readonly/>
          </div>
          <div class="form-group">
            <label>Course Name</label>
            <input type="text" name="courseName" class="form-control" value="<%=c!=null ? c.getCourseName() : ""%>"/>
          </div>
          <div class="form-group">
            <label>Course Description</label>
            <input type="text" name="description" class="form-control" value="<%=c!=null ? c.getDescription() : ""%>"/>
          </div>
          <button type="submit" class="btn btn-success btn-block">Update Course</button>
        </form>
        <a href="home">⬅ Back To Home</a>
      </div>
    </div>
  </div>
  <%@include file="footer.jsp" %>
</body>
</html>
