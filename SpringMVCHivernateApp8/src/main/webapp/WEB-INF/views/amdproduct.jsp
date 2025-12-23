<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

<%
String msg =(String)request.getAttribute("msg");
if(msg!=null)
out.print(msg);
%>

 <br>
 <form:form action="saveproduct" modelAttribute="pdObj">
 Enter P-Id<form:input type="text" path="pId" name="pid"/><br><br>
 Enter P-Name<form:input type="text" path="pName" name="pname"/><br><br>
 Enter Price<form:input type="text" path="price" name="price"/><br><br>
 <input type="submit" name="b1" value="Add Product">
 <input type="submit" name="b1" value="Update Product">
 <input type="submit" name="b1" value="Delete Product">
 
 <a href="home">Back To Product Index Page</a>
 </form:form>
 <br>
 <%@include file="footer.jsp" %>
 
 <br>
</body>
</html>