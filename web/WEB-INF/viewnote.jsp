<%-- 
    Document   : viewnote
    Created on : 5-Feb-2023, 7:45:32 PM
    Author     : 886152
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper </h1>
        <h2>View Note</h2><br>
        <h3>Title:</h3>${mynote.title}
        
        <h3>Contents:</h3>
        ${mynote.content}
        
        <br>
         <a href="ModifyServlet">Edit</a> 
    </body>
   

</html>
