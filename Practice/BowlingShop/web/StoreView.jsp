<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Header.jsp?titleName=Store"></jsp:include>
</body>

<c:forEach var="item" items="${item}">
    <center>
        <div class="column1" style="background-color: lightgoldenrodyellow; font-size: 18px; margin-left: 250px; margin-right: 250px; padding: 25px">
            <img src="${item.picture}" style="max-width: 250px">
            <br>
            ItemId : ${item.itemid}
            <br>
            ItemName : ${item.itemname}
            <br>
            Color : ${item.color}
            <br>
            Price : ${item.price} 
            <br>
            Weight : ${item.weight}
            <br>
            <a><button type="submit" value="add cart">add cart</button></a>
        </div>
    </center>
</c:forEach>
</html>
