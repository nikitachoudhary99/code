<%@page import="com.univ.pojo.Course"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Search Course</title>
  <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/templatemo-style.css">
</head>
<body>
  <!-- Background video for space theme -->
  <video autoplay muted loop id="bg-video">
    <source src="video/gfp-astro-timelapse.mp4" type="video/mp4">
  </video>

  <%@include file="header.jsp" %>

  <div class="page-container">
    <div class="container tm-content-container">
      <div class="row justify-content-center">
        <div class="col-lg-6">
          <div class="tm-bg-black-transparent p-5 rounded">
            <h3 class="text-center">Select Course Id To Search</h3>
            <br>

            <form action="getCourse" method="post">
              <div class="form-group">
                <label for="courseId">Choose Course Id:</label>
                <select class="form-control" id="courseId" name="s1">
                  <%
                    List<Course> lst = (List<Course>) request.getAttribute("allcourse");
                    if (lst != null) {
                      for (Course c : lst) {
                  %>
                        <option value="<%=c.getId()%>">
                          <%=c.getId()%> - <%=c.getCourseName()%>
                        </option>
                  <%
                      }
                    }
                  %>
                </select>
              </div>

              <br>
              <input type="submit" class="btn btn-primary btn-block" value="Search Course">
              <br>
              <a href="home" class="btn btn-link">⬅ Back To  Home</a>
            </form>

          </div>
        </div>
      </div>
    </div>
  </div>

  <%@include file="footer.jsp" %>
</body>
</html>
