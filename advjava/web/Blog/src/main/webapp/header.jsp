<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700&display=swap" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>
<body>
	 <header>
        <div class="menu-toggle">
            <i class="fas fa-bars"></i>
        </div>
        
        <div class="logo">
            <i class="fas fa-blog"></i>
            <h1>BlogTube</h1>
        </div>
        
        <div class="search-bar">
            <input type="text" placeholder="Search blogs...">
            <button><i class="fas fa-search"></i></button>
        </div>
        
        <div class="user-actions">
            <i class="fas fa-search mobile-search"></i>
            <i class="fas fa-video"></i>
            <i class="fas fa-bell"></i>
            <div class="user-avatar" onclick="window.location.href='profile.jsp'"></div>
        </div>
    </header>
</body>
</html>