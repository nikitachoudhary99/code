<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f6f9;
            margin: 0;
            padding: 0;
        }
        header {
            background: #2c3e50;
            color: white;
            padding: 15px;
            text-align: center;
        }
        nav {
            background: #34495e;
            padding: 10px;
            text-align: center;
        }
        nav a {
            color: white;
            text-decoration: none;
            margin: 0 15px;
            font-weight: bold;
        }
        nav a:hover {
            text-decoration: underline;
        }
        .content {
            padding: 20px;
        }
        .logout {
            text-align: right;
            margin: 10px;
        }
        .logout a {
            color: red;
            font-weight: bold;
            text-decoration: none;
        }
    </style>
</head>
<body>
    <header>
        <h1>Admin Dashboard</h1>
        <p>${message}</p>
    </header>

    <div class="logout">
        <a href="logout">Logout</a>
    </div>

    <nav>
        <a href="manageUsers">Manage Users</a>
        <a href="Quize">Quiz</a>
        <a href="amdQuize">add update delete quize</a>
        <a href="backL">Back to Home</a>
    </nav>

    <div class="content">
        <h2>Welcome, Admin!</h2>
        <p>Yahan se aap users ko manage kar sakte ho, reports dekh sakte ho aur system settings update kar sakte ho.</p>
    </div>
</body>
</html>
