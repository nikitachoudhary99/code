<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
<c:forTokens items="Rahul-Nakul-Rajesh" delims="a" var="name">  
   <c:out value="${name}"/><p>  
</c:forTokens>  
</body>  
</html>  