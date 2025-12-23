<%@page import="com.univ.pojo.Course"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>List of Courses</title>
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
        <h3 class="text-center"> List of All Courses</h3>
        <table class="table table-dark table-striped table-bordered">
          <tr>
            <th>S.No.</th>
            <th>Course Id</th>
            <th>Course Name</th>
            <th>Description</th>
          </tr>
          <%
            List<Course> lst = (List<Course>) request.getAttribute("allcourse");
            if (lst != null) {
              for (int i = 0; i < lst.size(); i++) {
                Course c = lst.get(i);
          %>
            <tr>
              <td><%=i+1 %></td>
              <td><%=c.getId() %></td>
              <td><%=c.getCourseName() %></td>
              <td><%=c.getDescription() %></td>
            </tr>
          <% }} %>
        </table>
        <a href="home">Back To Home</a><br>
      </div>
    </div>
  </div>
  <%@include file="footer.jsp" %>
</body>
</html>
