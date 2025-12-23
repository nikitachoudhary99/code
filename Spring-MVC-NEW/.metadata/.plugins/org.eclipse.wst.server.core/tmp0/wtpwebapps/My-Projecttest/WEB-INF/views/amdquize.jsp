<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Manage Quiz</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="navbar">Manage Quiz</div>
    <div class="container">
        <h2>⚙ Add / Update / Delete Quiz</h2>
        
        <!-- Add Quiz Form -->
        <form action="AddQuizServlet" method="post">
            <input type="text" name="quizTitle" placeholder="Enter Quiz Title" required>
            <button type="submit">Add Quiz</button>
        </form>


        <a href="admin-home.jsp">⬅ Back to Admin Home</a>
    </div>
</body>
</html>
