<%-- 
    Document   : ProductList
    Created on : Aug 8, 2018, 3:22:22 PM
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
        <div class="container">
            <table class="table">
                <tr>
                    <td><h1>Product List::</h1></td>
                    <td>Your Cart:(${cart.totalQuatity})</td>
                </tr>
            </table>
            
            <table id="example" class="table">
                <thead>
                <th>IMG</th>
                <th>No</th>
                <th>Product Code</th>
                <th>Product Name</th>
                <th>Product Line</th>
                <th>Scale</th>
                <th>Price</th>
                <th>Add Cart</th>
                </thead>
                <tbody> 
                    <c:forEach items="${products}" var="p" varStatus="vs">
                        <tr>
                            <td><img src="model-images/${p.productCode}.jpg" width="120"></td>
                            <td>${vs.count}</td>
                            <td>${p.productCode}</td>
                            <td>${p.productName}</td>
                            <td>${p.productLine}</td>
                            <td>${p.productScale}</td>
                            <td>${p.msrp}</td>
                            <td>
                                <form action="AddItemToCart" method="post">
                                    <input type="hidden" value="${p.productCode}" name="productCode"/>
                                    <input type="submit" value="Add To Cart"/>
                                </form>
                                <a href="AddItemToCart?productCode=${p.productCode}">
                                    <input type="button" value="Add To Cart"/>
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>    
            </table>
        </div>
        <script>
            $(document).ready(function () {
                $('#example').DataTable();
            });
        </script>
    </body>
</html>
