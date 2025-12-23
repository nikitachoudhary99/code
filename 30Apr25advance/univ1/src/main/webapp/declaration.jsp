<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
int add(int x,int y)
{
	return x+y;
}

int sub(int x,int y)
{
	return x-y;
}

int multi(int x,int y)
{
	return x*y;
}
int div(int x,int y)
{
	return x/y;
}

%>

<%
int z = add(10,20);
out.println("<br>Sum = "+z);
z = sub(10,20);
out.println("<br>Diff = "+z);
z = multi(10,20);
out.println("<br>Product = "+z);
z = div(10,20);
out.println("<br>Quotient = "+z);
%>

</body>
</html>