<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Number Guessing Game</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(to right, #00c6ff, #0072ff);
            color: white;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background-color: rgba(0,0,0,0.6);
            padding: 40px 60px;
            border-radius: 20px;
            text-align: center;
            box-shadow: 0 0 20px rgba(0,0,0,0.3);
        }
        h2 {
            font-size: 30px;
            margin-bottom: 20px;
        }
        input[type="number"] {
            padding: 12px 20px;
            font-size: 18px;
            width: 80%;
            border: none;
            border-radius: 10px;
            margin-bottom: 20px;
            outline: none;
        }
        input[type="submit"] {
            padding: 12px 30px;
            font-size: 18px;
            border: none;
            border-radius: 10px;
            background-color: #28a745;
            color: white;
            cursor: pointer;
            transition: 0.3s;
        }
        input[type="submit"]:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>🎯 Guess a number between <span style="color: yellow;">1 and 10</span></h2>
        <form action="guess" method="post">
            <input type="number" name="guess" required min="1" max="10" placeholder="Enter your guess"/>
            <br>
            <input type="submit" value="🎮 Submit Guess">
        </form>
    </div>
</body>
</html>
