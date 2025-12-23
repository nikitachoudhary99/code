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
<table border="3">
<tr>
<th>S.No.</th>
<th>Product-Id</th>
<th>Product-Name</th>
<th>Price</th>

</tr>
<%
List<Product>lst = (ArrayList)request.getAttribute("allproducts");
if(lst!=null)
{
	for(int i=0; i<lst.size(); i++)
	{
		Product pd = lst.get(i);
		%>
		<tr>
			<td><%=i+1 %></td>
			<td><%=pd.getpId() %></td>
			<td><%=pd.getpName() %></td>
			<td><%=pd.getPrice() %></td>
		</tr>
		<%
	}
}
%>
</table>
<br>
<br>
 <a href="home">Back To Product Index Page</a><br><br>
 <br>
 <%@include file="footer.jsp" %>
 
 <br>
</body>
</html>