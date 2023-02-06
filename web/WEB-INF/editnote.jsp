<%-- 
    Document   : editnote
    Created on : 5-Feb-2023, 7:45:55 PM
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
        <form method="post" >
        <h3>Title:</h3><input type="text" name="title" value="${mynote.title}">
        
        <h3>Contents:</h3>
        <textarea  name="content" rows="9" cols="70" width="100px" >
        ${mynote.content}
        </textarea>
        <br>
        <input type="submit" value="Save">
        
        </form>
        
        <a href="NoteServlet">VIEW</a>
        
    </body>
</html>
