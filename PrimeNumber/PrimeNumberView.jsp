<%-- 
    Document   : PrimeNumberView
    Created on : Aug 7, 2018, 12:26:27 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="Head" style="background-color: lightblue; padding: 10px; margin: 50px; border-radius: 20px">
            <center><h1 style="font-size: 48px">Prime Number</h1></center>
        </div>
        
            <div id="number" style="background-color: lightblue; padding: 10px; margin: 50px; border-radius: 20px">
                <center> 
                    <p style="font-size: 72px">${PrimeNumber.input}</p>
                <p style="font-size: 72px">${PrimeNumber.result2}</p>
                </center>
            </div>
    </body>
</html>
