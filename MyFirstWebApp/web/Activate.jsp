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
        <form action = "Activate" method="post">
            <input type="text" name="email" value="${email}" hidden>
            Activate <input type="text" name="activate">
            <input type="submit">
        </form>
    </body>
</html>
