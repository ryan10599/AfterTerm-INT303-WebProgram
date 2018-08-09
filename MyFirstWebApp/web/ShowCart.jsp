<%-- 
    Document   : ShowCart
    Created on : Aug 9, 2018, 4:23:15 PM
    Author     : INT303
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap.min.css">
    </head>
    <body>
        <h1>Your Cart</h1>
        <table>
            <th>
            <td>No.</td>
            <td>Product</td>
            <td>Price</td>
            <td>Quantity</td>
            <td>Total Price</td>
        </th>

        <c:forEach items="${cart}" var="lineItem" varStatus="vs">
            <tr>
                <td> ${lineItem.getProduct().getProductCode()} </td>
                <td> ${lineItem.getProduct().getProductName()}</td>
                <td> ${lineItem.getQuantity()}</td>
                <td> ${lineItem.getTotalPrice()}</td>

            </tr>
        </c:forEach>

    </table>
</body>
</html>
