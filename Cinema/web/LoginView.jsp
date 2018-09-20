
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Header.jsp?titleName=login"></jsp:include>
        <form action="Login" method="post">
            UserName : <input type="text" name="userid">
            Password : <input type="password" name="password">
            
            <input type="submit">
        </form>
        <br>

    <div>
        ${message}
    </div>

    </body>
</html>
