<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
 <h1><font color=black>Universal Imformatics</h1><br><br><br><br><br>
 <%
  String msg=(String)request.getAttribute("msg");
 if(msg!=null)
	 out.print(msg);
 %>
 <form action="checkUser" method="post">
 username<input type="text" name="username"><br><br><br>
 password<input type="password" name="password"><br><br><br>
 <input type="submit" value="login hear">
 </form>
 <br>
 <a href="register"> add new user</a>
 <br>
 <hr>
 <address>
Universal Informatics<br>
Bhawarkuna<br>
Indore
</address>
</center>
</body>
</html>