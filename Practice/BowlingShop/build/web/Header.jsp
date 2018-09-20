<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>BowlingShop - ${param.titleName}</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
<body style="margin: 0%">
        
        <div class="header" style="background-color: gold; height: 50px">
            <a href="Home.jsp" style="font-size: 25px">BowlingShop</a>
            <a href="Register" style="font-size: 21px;margin-left: 25px">Register</a>
            <a href="Store" style="font-size: 21px"> Store</a>
            <c:if test="${sessionScope.Login != null}">
                Hello <a href="Logout">${sessionScope.Login.email}</a>
                <a href="Cart">Cart</a>
            </c:if>
        </div>
