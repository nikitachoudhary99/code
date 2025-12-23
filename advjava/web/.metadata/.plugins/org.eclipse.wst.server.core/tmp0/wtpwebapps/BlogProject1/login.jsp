
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:include page="header.jsp"/>

<!DOCTYPE html>
<html>
<head>
    <title>Login - Blog App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .login-container {
            max-width: 400px;
            margin: 80px auto;
            padding: 25px;
            background-color: #ffffff;
            border-radius: 15px;
            box-shadow: 0px 0px 10px rgba(0,0,0,0.1);
        }
        .btn-primary {
            width: 100%;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="login-container">
            <h3 class="text-center mb-4">Login to Your Blog</h3>
            <form action="LoginServlet" method="post">
                <div class="mb-3">
                    <label>Email address</label>
                    <input type="email" class="form-control" name="email" required />
                </div>
                <div class="mb-3">
                    <label>Password</label>
                    <input type="password" class="form-control" name="password" required />
                </div>
                <input class="btn btn-primary" type="submit" value="Login">
            </form>
            <div class="mt-3 text-center">
                <small>Don't have an account? <a href="register.jsp">Register</a></small>
            </div>
        </div>
    </div>

</body>
</html>

<jsp:include page="footer.jsp"/>
