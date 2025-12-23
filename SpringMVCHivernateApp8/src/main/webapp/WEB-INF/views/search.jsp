<%@page import="java.util.ArrayList"%>
<%@page import="com.ak.pojo.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
<form action="getproduct" method="post">
<h1>Select Product Id To Search Product Info:</h1>
<select name="s1">
<%
List<Product>lst = (ArrayList)request.getAttribute("allproducts");
if(lst!=null)
{
	for(int i=0; i<lst.size(); i++)
	{
		Product pd = lst.get(i);
		%>
		<option value="<%=pd.getpId()%>"><%=pd.getpId()%></option>
		<%
	}
}
%>
</select>
<br>
<input type="submit" value="Search Product Info">
</form>
<br>
<br>
 <a href="home">Back To Product Index Page</a><br><br>
 <br>
 <%@include file="footer.jsp" %>
 
 <br>
</body>
</html>