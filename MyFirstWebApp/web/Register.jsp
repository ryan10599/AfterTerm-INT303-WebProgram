<%-- 
    Document   : Register
    Created on : Sep 14, 2018, 10:47:30 AM
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
    <center><div id="header"> 
            Register
        </div></center>
    <hr>
    <center>
        <div style="background-color: lightgreen; margin-left: 250px; margin-right: 250px; padding: 25px; border-radius: 25px" >
            <form action="Register" method="post">
                Email
                <br>
                <input type="email" name="email" required/>
                <br>
                <br>
                Password 
                <br>
                <input type="password" name="password" required/>
                <br>
                <br>
                <input type="submit">
            </form>
        </div>
    </center>
</body>

</html>
