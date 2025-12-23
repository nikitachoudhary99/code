<center>
<h1 style="color: blue;">Universal Informatics</h1>
<p style="color: gray;">place for IT/CS Students</p>
<h2> Welcome
<%
String us = (String)session.getAttribute("us");
if(us!=null)
	out.print(us);		
%>

</h2>
<br>
<hr>
<br>
