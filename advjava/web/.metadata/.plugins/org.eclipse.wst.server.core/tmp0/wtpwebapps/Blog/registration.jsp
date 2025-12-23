<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BlogTube - Register</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700&display=swap" rel="stylesheet">

<style>
    body {
        font-family: 'Inter', sans-serif;
        background: linear-gradient(to right, #6a11cb, #2575fc);
        margin: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .register-container {
        background: #fff;
        padding: 40px;
        border-radius: 12px;
        box-shadow: 0 10px 30px rgba(0,0,0,0.1);
        max-width: 450px;
        width: 100%;
    }

    .logo {
        text-align: center;
        margin-bottom: 20px;
    }

    .logo i {
        font-size: 36px;
        color: #2575fc;
    }

    .logo h1 {
        margin: 10px 0 0;
        font-size: 24px;
        color: #333;
    }

    .register-form .form-group {
        margin-bottom: 20px;
    }

    label {
        display: block;
        margin-bottom: 6px;
        font-weight: 500;
        color: #444;
    }

    input[type="text"],
    input[type="email"],
    input[type="password"] {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 6px;
        font-size: 14px;
    }

    .form-group input[type="radio"] {
        margin-right: 6px;
    }

    .error-message {
        color: red;
        font-size: 13px;
        display: none;
        margin-top: 5px;
    }

    .register-btn {
        width: 100%;
        background-color: #2575fc;
        color: #fff;
        padding: 12px;
        border: none;
        border-radius: 6px;
        font-size: 16px;
        cursor: pointer;
        transition: background 0.3s ease;
    }

    .register-btn:hover {
        background-color: #1e63d8;
    }

    .login-link {
        text-align: center;
        margin-top: 20px;
        font-size: 14px;
    }

    .login-link a {
        color: #2575fc;
        text-decoration: none;
        font-weight: 500;
    }

    .server-error {
        text-align: center;
        color: red;
        font-size: 14px;
        margin-bottom: 15px;
    }
</style>
</head>
<body>

<div class="register-container">
    <div class="logo">
        <i class="fas fa-blog"></i>
        <h1>BlogTube</h1>
    </div>

    <div class="server-error">
        <%
        String msg = (String)request.getAttribute("msg");
        if (msg != null) {
            out.print(msg);
        }
        %>
    </div>

    <form class="register-form" id="registerForm" action="register" method="post">
        <div class="form-group">
            <label for="user">Username</label>
            <input type="text" id="user" name="name" placeholder="Enter your full name" required>
        </div>

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

        

        <button type="submit" class="register-btn">Register</button>

        <div class="login-link">
            Already have an account? <a href="login.jsp">Log in</a>
        </div>
    </form>
</div>

<script>
    document.getElementById('registerForm').addEventListener('submit', function(e) {
        const email = document.getElementById('email').value.trim();
        const password = document.getElementById('password').value.trim();
        const confirmPassword = document.getElementById('confirmPassword').value.trim();

        const emailError = document.getElementById('emailError');
        const passwordError = document.getElementById('passwordError');
        const confirmPasswordError = document.getElementById('confirmPasswordError');

        emailError.style.display = 'none';
        passwordError.style.display = 'none';
        confirmPasswordError.style.display = 'none';

        let isValid = true;

        if (!email.includes('@') || !email.includes('.')) {
            emailError.style.display = 'block';
            isValid = false;
        }

        if (password.length < 6) {
            passwordError.style.display = 'block';
            isValid = false;
        }

        if (password !== confirmPassword) {
            confirmPasswordError.style.display = 'block';
            isValid = false;
        }

        if (!isValid) {
            e.preventDefault();
        }
    });
</script>

</body>
</html>
