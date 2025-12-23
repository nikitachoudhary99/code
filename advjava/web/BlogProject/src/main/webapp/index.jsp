<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width,initial-scale=1" />
  <title>My Blog</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="style.css" rel="stylesheet">
</head>
<body class="bg-light">

  <!-- Navbar -->
  <nav class="navbar navbar-expand-lg navbar-light bg-white shadow-sm">
    <div class="container">
      <a class="navbar-brand" href="#">My Blog</a>
      <button class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navMenu">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navMenu">
        <ul class="navbar-nav ms-auto">
          <li><a class="nav-link" href="addPost.jsp">New Post</a></li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Hero -->
  <header class="py-5 bg-white border-bottom mb-4">
    <div class="container"><h1 class="fw-bold">Latest Posts</h1></div>
  </header>

  <!-- Main Content + Sidebar -->
  <div class="container">
    <div class="row">
      <div class="col-lg-8">
        <!-- Example Blog Post -->
        <div class="card mb-4">
          <img src="https://via.placeholder.com/900x300" class="card-img-top" alt="...">
          <div class="card-body">
            <h2 class="card-title">Post Title</h2>
            <p class="card-text">Preview text of the blog post goes here...</p>
            <a href="editPost.jsp?id=${id}" class="btn btn-primary">Edit</a>
            <a href="DeletePostServlet?id=${id}" class="btn btn-danger">Delete</a>
          </div>
        </div>
        <!-- Repeat for each post -->
      </div>

      <div class="col-lg-4">
        <!-- About Widget -->
        <div class="card mb-4">
          <h5 class="card-header">About Me</h5>
          <div class="card-body">Short bio or intro.</div>
        </div>
        <!-- Popular Posts Widget -->
        <div class="card mb-4">
          <h5 class="card-header">Popular Posts</h5>
          <div class="list-group list-group-flush">
            <a href="#" class="list-group-item">Post 1</a>
            <a href="#" class="list-group-item">Post 2</a>
          </div>
        </div>
        <!-- Tags Widget -->
        <div class="card mb-4">
          <h5 class="card-header">Tags</h5>
          <div class="card-body">
            <a href="#" class="badge bg-secondary me-1">Java</a>
            <a href="#" class="badge bg-secondary">SQL</a>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- Footer -->
  <footer class="py-4 bg-white mt-auto border-top">
    <div class="container text-center">
      <small>© 2025 My Blog</small>
    </div>
  </footer>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
    