<%-- 
    Document   : Task
    Created on : Sep 20, 2018, 11:53:41 PM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <form action="Task" method="post">
            User : ${sessionScope.User.username}<input type="text" name="account" value="${sessionScope.User.username}" hidden>
            <br>
            <br>
            New Task : <input type="text" name="newtask" required="">
            <input type="submit">
        </form>

        <table>
            <tr>
                <td>Date</td>
                <td>Task</td>
                <td>Status</td>
            </tr>
            <c:forEach items="${alltask}" var="t" >
                <tr>
                    <td>${t.createdate}</td>
                    <td>${t.task}</td>
                    <td>${t.status}</td>
                </tr>
            </c:forEach>
            
        </table>
    </body>
</html>
