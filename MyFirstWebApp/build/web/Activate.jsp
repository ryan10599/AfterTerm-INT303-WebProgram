<%-- 
    Document   : Activate
    Created on : Sep 14, 2018, 12:19:24 PM
    Author     : INT303
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <div style="background-color: lightcoral; margin-left: 250px; margin-right: 250px; padding: 25px; border-radius: 25px">
            <form action = "Activate" method="post">
                <input type="text" name="email" value="${email}" hidden>
                Activate 
                <br>
                <input type="text" name="activate" required>
                <br>
                <br>
                <input type="submit">
            </form>
        </div>
    </center>
</body>
</html>
