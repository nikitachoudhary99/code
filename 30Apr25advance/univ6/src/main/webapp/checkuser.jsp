
<%@page import="com.ak.daoimpl.UserInfoDaoImpl"%>
<%@page import="com.ak.pojo.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
UserInfo u = new UserInfo();
u.setUsername(request.getParameter("username"));
u.setPassword(request.getParameter("password"));

UserInfoDaoImpl daoimpl = new UserInfoDaoImpl();
boolean isValid = daoimpl.checkUserCredential(u);
if(isValid==true)
{
	request.setAttribute("username",u.getUsername());
	%>
	<jsp:forward page="home.jsp"></jsp:forward>
	<%
	
}
else
{
	request.setAttribute("msg","Invalid Username / Password");
	%>
	<jsp:forward page="login.jsp"></jsp:forward>
	<%
}
%>
</body>
</html>