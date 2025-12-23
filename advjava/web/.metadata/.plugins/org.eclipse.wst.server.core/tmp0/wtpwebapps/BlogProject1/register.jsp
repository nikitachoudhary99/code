<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #ecf0f1;
            margin: 0;
            padding: 0;
        }
        .register-box {
            width: 350px;
            background: white;
            margin: 80px auto;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0px 0px 10px #aaa;
        }
        h2 {
            text-align: center;
            color: #2c3e50;
        }
        input[type="text"], input[type="email"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        button {
            background-color: #2ecc71;
            color: white;
            padding: 10px;
            width: 100%;
            border: none;
            border-radius: 4px;
            margin-top: 10px;
            font-size: 16px;
        }
        .error {
            color: red;
            text-align: center;
            margin-top: 10px;
        }
        a {
            display: block;
            text-align: center;
            margin-top: 15px;
            color: #2980b9;
            text-decoration: none;
        }
    </style>
</head>
<body>

    <div class="register-box">
        <h2>Register</h2>
        <form action="register" method="post">
            <input type="text" name="name" placeholder="Full Name" required>
            <input type="email" name="email" placeholder="Email Address" required>
            <input type="password" name="password" placeholder="Password" required>
            <button type="submit">Sign Up</button>
        </form>

        <% if (request.getParameter("error") != null) { %>
            <div class="error">Registration failed. Try again.</div>
        <% } %>

        <a href="login.jsp">Already have an account? Login</a>
    </div>

</body>
</html>
