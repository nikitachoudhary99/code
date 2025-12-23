
<%@page import="com.ak.daoimpl.UserInfoDaoimpl"%>
<%@page import="com.ak.pojo.userinfo"%>

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
userinfo u = new userinfo();
u.setUsername(request.getParameter("username"));
u.setPassword(request.getParameter("password"));

UserInfoDaoimpl daoimpl = new UserInfoDaoimpl();
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