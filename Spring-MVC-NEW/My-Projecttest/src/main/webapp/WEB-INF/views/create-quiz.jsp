<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Create Quiz</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="navbar">➕ Create Quiz</div>
    <div class="container">
        <form action="QuizServlet" method="post">
            <input type="hidden" name="action" value="create">

            <label>Quiz Title:</label>
            <input type="text" name="title" required><br><br>

            <label>Description:</label>
            <textarea name="description" rows="4" cols="30"></textarea><br><br>

            <button type="submit">Create Quiz</button>
            <a href="admin-dashboard.jsp">Cancel</a>
        </form>
    </div>
</body>
</html>
