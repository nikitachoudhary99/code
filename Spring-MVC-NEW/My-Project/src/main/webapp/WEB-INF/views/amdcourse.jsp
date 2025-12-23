<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>AMDCourse - Space Portal</title>

<!-- Bootstrap -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

<!-- Space Theme Custom CSS -->
<style>
    body {
        background: url('images/space-bg.jpg') no-repeat center center fixed;
        background-size: cover;
        font-family: 'Orbitron', sans-serif;
        color: #fff;
    }
    .card {
        background: rgba(0,0,0,0.75);
        border: 2px solid #0ff;
        border-radius: 15px;
        box-shadow: 0px 0px 25px #0ff;
    }
    .card-title {
        color: #0ff;
        font-weight: bold;
        text-shadow: 0 0 15px #0ff;
    }
    label {
        color: #0ff;
        font-size: 14px;
        text-transform: uppercase;
        letter-spacing: 1px;
    }
    .form-control {
        background: transparent;
        border: 1px solid #0ff;
        color: #fff;
        border-radius: 10px;
    }
    .form-control:focus {
        background: rgba(0, 255, 255, 0.1);
        outline: none;
        box-shadow: 0 0 15px #0ff;
    }
    .btn {
        background: linear-gradient(45deg, #0ff, #00f);
        border: none;
        border-radius: 25px;
        font-weight: bold;
        color: #000;
        text-transform: uppercase;
        transition: 0.3s ease;
    }
    .btn:hover {
        background: linear-gradient(45deg, #00f, #0ff);
        color: #fff;
        box-shadow: 0 0 20px #0ff;
    }
    a {
        color: #0ff;
        text-decoration: none;
    }
    a:hover {
        text-shadow: 0 0 15px #0ff;
    }
    .msg-box {
        background: rgba(0,255,255,0.1);
        border: 1px solid #0ff;
        padding: 10px;
        border-radius: 10px;
        text-align: center;
        margin-bottom: 10px;
    }
</style>

<!-- Google Fonts for Space Look -->
<link href="https://fonts.googleapis.com/css2?family=Orbitron:wght@500;700&display=swap" rel="stylesheet">

</head>
<body>
<%@include file="header.jsp" %>

<div class="login_section">
  <div class="container">
    <div class="row justify-content-center">
      <div class="col-sm-9 col-md-7 col-lg-5">
        <div class="card card-signin my-5 p-4">
          <div class="card-body">
            <h5 class="card-title text-center">🚀 AMD Course Portal</h5>
            <br>
            <%
              String msg = (String)request.getAttribute("msg");
              if(msg!=null){
            %>
              <div class="msg-box"><%= msg %></div>
            <% } %>
            <br>

            <!-- Space Form -->
            <form:form class="form-signin" action="saveCourse" method="post" modelAttribute="courseObj">

              <div class="form-label-group mb-3">
                <form:input type="text" id="courseId" class="form-control" path="id" placeholder="Course Id"/>
                <label for="courseId">Course Id</label>
              </div>

              <div class="form-label-group mb-3">
                <form:input type="text" id="courseName" class="form-control" path="courseName" placeholder="Course Name"/>
                <label for="courseName">Course Name</label>
              </div>

              <div class="form-label-group mb-4">
                <form:input type="text" id="courseDesc" class="form-control" path="description" placeholder="Course Description"/>
                <label for="courseDesc">Course Description</label>
              </div>

              <input class="btn btn-lg btn-block text-uppercase mb-2" type="submit" value="Add Course" name="b1">
              <input class="btn btn-lg btn-block text-uppercase mb-2" type="submit" value="Update Course" name="b1">
              <input class="btn btn-lg btn-block text-uppercase" type="submit" value="Delete Course" name="b1">

            </form:form>
            <!-- End Space Form -->

            <hr style="border-top: 1px solid #0ff;">
            <br>
            <a href="home">⬅ Back To Home Page</a>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>

<%@include file="footer.jsp" %>     
</body>
</html>
