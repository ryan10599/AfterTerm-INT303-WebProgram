<%-- 
    Document   : ViewParameter
    Created on : Aug 8, 2018, 1:59:50 PM
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
        <h1>Favorite Subject</h1>
        <form action="TestRequestParam" method="post">
            Your Student Id:<input type="text" name="id"/><br>
            Your Name: <input type="text" name="name"/><br>
            Favorite Subject:
            <input type="checkbox" name="subjects" value="Web Programming">Web Programming<br>
            <input type="checkbox" name="subjects" value="Computer Network">Computer Network<br>
            <input type="checkbox" name="subjects" value="Network Programming">Network Programming<br>
            <input type="checkbox" name="subjects" value="Database Administrator">Database Administrator<br>
            <input type="checkbox" name="subjects" value="Computer Security">Computer Security<br>
            <input type="checkbox" name="subjects" value="Software Process">Software Process<br>
            <input type="submit"/>
        </form>
    </body>
</html>