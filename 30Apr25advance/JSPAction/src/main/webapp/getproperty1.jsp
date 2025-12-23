<html>
   <head>
      <title>Using JavaBeans in JSP</title>
   </head>
   <body>
      <center>
         <h2>Using JavaBeans in JSP</h2>
         <jsp:useBean id = "user" class = "example.User" />
         <jsp:setProperty name = "user" property = "username" value = "Hello JSP...Page...." />
         <p>Got message....</p>
         <jsp:getProperty name = "user" property = "username" />
      </center>
   </body>
</html>