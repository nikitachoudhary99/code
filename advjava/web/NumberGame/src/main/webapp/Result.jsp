<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="javax.servlet.http.*, javax.servlet.*" %>
<%
    Boolean isCorrect = (Boolean) request.getAttribute("isCorrect");
    String message = (String) request.getAttribute("message");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Game Result</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(to top left, #1e3c72, #2a5298);
            color: white;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 0;
        }

        .result-box {
            background: rgba(0, 0, 0, 0.7);
            padding: 50px;
            border-radius: 20px;
            text-align: center;
            box-shadow: 0 0 25px rgba(0, 0, 0, 0.5);
        }

        .result-box h3 {
            font-size: 28px;
            margin-bottom: 30px;
            color: #ffde59;
        }

        .result-box a {
            display: inline-block;
            padding: 14px 28px;
            font-size: 18px;
            background-color: #00c851;
            color: white;
            border-radius: 10px;
            text-decoration: none;
            transition: 0.3s;
        }

        .result-box a:hover {
            background-color: #007e33;
        }
    </style>
</head>
<body>
    <div class="result-box">
        <h3><%= message %></h3>

        <% if (!isCorrect) { %>
            <a href="home.jsp">🔁 Try Again</a>
        <% } else { %>
            <a href="home.jsp">🎮 Play Again</a>
            <% session.removeAttribute("GameModel"); %>
        <% } %>
    </div>
</body>
</html>
