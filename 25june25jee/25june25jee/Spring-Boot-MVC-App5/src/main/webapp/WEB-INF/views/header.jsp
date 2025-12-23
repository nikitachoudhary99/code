<center>
<h1><font color="Blue">Universal Informatics</font> </h1>
<p>Place for IT & CS Students</p>
<h4>WELCOME
<%
String username = (String)session.getAttribute("username");
if(username!=null)
	out.print(username);
%>
</h4>
<br>
<hr>
