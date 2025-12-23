<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login | BlogTube</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Roboto:wght@300;500;700&display=swap');
        
        body {
            font-family: 'Roboto', sans-serif;
            background: url('https://images.unsplash.com/photo-1515378791036-0648a3ef77b2?auto=format&fit=crop&w=1470&q=80') no-repeat center center fixed;
            background-size: cover;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .card {
            background: rgba(255, 255, 255, 0.95);
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 8px 30px rgba(0,0,0,0.2);
            width: 350px;
            text-align: center;
        }

        .card h2 {
            margin-bottom: 25px;
            color: #333;
        }

        input[type="text"], input[type="email"], input[type="password"] {
            width: 90%;
            padding: 12px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 10px;
            font-size: 14px;
        }

        button {
            width: 95%;
            padding: 12px;
            margin-top: 20px;
            border: none;
            border-radius: 10px;
            background-color: #ff6347;
            color: white;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
            transition: background 0.3s ease;
        }

        button:hover {
            background-color: #e6533b;
        }

        .footer-link {
            margin-top: 20px;
            font-size: 14px;
        }

        .footer-link a {
            color: #ff6347;
            text-decoration: none;
        }

        .footer-link a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<%@ include file="header.jsp" %>

<div class="card">
    <h2>Welcome to BlogTube</h2>
    <form action="login" method="post">
        <input type="text" name="name" placeholder="Your Name" required><br>
        <input type="email" name="email" placeholder="Email Address" required><br>
        <input type="password" name="password" placeholder="Password" required><br>
        <button type="submit">Login</button>
    </form>
    <div class="footer-link">
        Don't have an account? <a href="register.jsp">Register Now</a>
    </div>
</div>

<%@ include file="footer.jsp" %>

</body>
</html>
