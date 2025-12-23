<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BlogTube - Login</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700&display=swap" rel="stylesheet">

<style>
    body {
        margin: 0;
        font-family: 'Inter', sans-serif;
        background: linear-gradient(to right, #667eea, #764ba2);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .login-container {
        background: #ffffff;
        padding: 40px;
        border-radius: 12px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.1);
        width: 360px;
        max-width: 100%;
    }

    .logo {
        text-align: center;
        margin-bottom: 20px;
    }

    .logo i {
        font-size: 40px;
        color: #764ba2;
    }

    .logo h1 {
        margin: 10px 0 0;
        font-size: 24px;
        color: #333;
    }

    h5 {
        color: red;
        text-align: center;
        margin-bottom: 20px;
    }

    .login-form .form-group {
        margin-bottom: 20px;
    }

    label {
        display: block;
        margin-bottom: 5px;
        font-weight: 500;
        color: #333;
    }

    input[type="email"],
    input[type="password"] {
        width: 100%;
        padding: 10px 12px;
        border: 1px solid #ccc;
        border-radius: 6px;
        font-size: 14px;
    }

    .login-btn {
        width: 100%;
        background: #764ba2;
        color: #fff;
        padding: 12px;
        border: none;
        border-radius: 6px;
        font-size: 16px;
        cursor: pointer;
        margin-top: 10px;
        transition: background 0.3s ease;
    }

    .login-btn:hover {
        background: #5e3c8d;
    }

    .forgot-password {
        text-align: right;
        margin-top: 5px;
        font-size: 13px;
    }

    .forgot-password a {
        color: #764ba2;
        text-decoration: none;
    }

    .register-link {
        text-align: center;
        margin-top: 20px;
        font-size: 14px;
    }

    .register-link a {
        color: #764ba2;
        text-decoration: none;
        font-weight: 500;
    }

    .error-message {
        color: red;
        font-size: 13px;
        display: none;
        margin-top: 5px;
    }
</style>
</head>
<body>
    <div class="login-container">
        <div class="logo">
            <i class="fas fa-blog"></i>
            <h1>BlogTube</h1>
        </div>
        <h5>
            <%
                String msg = (String)request.getAttribute("msg");
                if(msg != null) {
                    out.print(msg);
                }
            %>
        </h5>
        <form class="login-form" id="loginForm" action="LoginServlet" method="post">
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email" placeholder="Enter your email" required>
                <div class="error-message" id="emailError">Please enter a valid email</div>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" placeholder="Enter your password" required>
                <div class="error-message" id="passwordError">Password must be at least 6 characters</div>
            </div>
            <div class="forgot-password">
                <a href="#">Forgot password?</a>
            </div>
            <input type="submit" class="login-btn" value="Log In">
            <div class="register-link">
                Don't have an account? <a href="registration.jsp">Register</a>
            </div>
        </form>
    </div>

    <script>
        document.getElementById('loginForm').addEventListener('submit', function(e) {
            const email = document.getElementById('email').value;
            const password = document.getElementById('password').value;
            const emailError = document.getElementById('emailError');
            const passwordError = document.getElementById('passwordError');

            emailError.style.display = 'none';
            passwordError.style.display = 'none';

            let isValid = true;

            if (!email || !email.includes('@') || !email.includes('.')) {
                emailError.style.display = 'block';
                isValid = false;
            }

            if (!password || password.length < 6) {
                passwordError.style.display = 'block';
                isValid = false;
            }

            if (!isValid) {
                e.preventDefault();
            }
        });
    </script>
</body>
</html>
