<!DOCTYPE html>
<html lang="en">

<head>
</head>

<body data-bs-spy="scroll" data-bs-target=".navbar" data-bs-offset="200">

	<%
    String msg =(String) request.getAttribute("msg");
	if(msg!=null)
		out.print(msg);
    %>

	<form action="UploadServlet" enctype="multipart/form-data" method="post">
	Username<input type="text" name="t1"><br><br>
	Password<input type="password" name="t2"><br><br>
	Select File :<input type="file" name="fpic" accept="image/*" required> 
	<button type="submit">Submit</button>
	<br>
	<%
	String filename =(String) request.getAttribute("filename");
	if(filename!=null)
	{
	%>
	<img alt="dp" src="images/<%=filename%>">
	<%
	}
	 %>
	</form>

</body>

</html>
