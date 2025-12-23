<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>3D Login Page</title>
<style>
    body {
        margin: 0;
        padding: 0;
        font-family: 'Poppins', sans-serif;
        background: linear-gradient(135deg, #667eea, #764ba2);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        perspective: 1000px; /* Enables 3D effect */
    }

    .login-container {
        background: rgba(255, 255, 255, 0.1);
        border-radius: 20px;
        padding: 40px;
        width: 320px;
        box-shadow: 0 20px 50px rgba(0, 0, 0, 0.3);
        backdrop-filter: blur(10px);
        transform-style: preserve-3d;
        transition: transform 0.5s ease;
    }

    .login-container:hover {
        transform: rotateY(10deg) rotateX(5deg) scale(1.02);
    }

    .login-container h2 {
        text-align: center;
        color: #fff;
        margin-bottom: 30px;
    }

    .input-box {
        position: relative;
        margin-bottom: 20px;
    }

    .input-box input {
        width: 100%;
        padding: 12px 15px;
        border: none;
        outline: none;
        background: rgba(255, 255, 255, 0.2);
        color: #fff;
        font-size: 16px;
        border-radius: 10px;
        box-shadow: inset 0 2px 5px rgba(0, 0, 0, 0.2);
    }

    .input-box input::placeholder {
        color: rgba(255, 255, 255, 0.7);
    }

    .btn {
        width: 100%;
        padding: 12px;
        border: none;
        background: linear-gradient(135deg, #43e97b, #38f9d7);
        border-radius: 10px;
        font-size: 16px;
        color: #fff;
        cursor: pointer;
        transition: transform 0.3s ease, box-shadow 0.3s ease;
    }

    .btn:hover {
        transform: translateY(-3px);
        box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
    }

    .extra-links {
        text-align: center;
        margin-top: 15px;
    }

    .extra-links a {
        color: #fff;
        text-decoration: none;
        font-size: 14px;
    }

    .extra-links a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>

<form action="checkUser">
<div class="login-container">
    <h2>Login</h2>
    <div class="input-box">
        <input type="text" placeholder="Username">
    </div>
    <div class="input-box">
        <input type="password" placeholder="Password">
    </div>
    <button class="btn">Login</button>
    <div class="extra-links">
        <a href="#">Forgot Password?</a>
    </div>
</div>
</form>
</body>
</html>
