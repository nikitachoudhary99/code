<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="uploadfile" enctype="multipart/form-data" accept-charset="utf-8" method="post">
Username<input type="text" name="username"><br><br>
Password<input type="password" name="password"><br><br>
Select File<input type="file" name="pic" accept="image/*"><br><br>
<input type="submit" value="Upload Data">
</form>
</body>
</html>