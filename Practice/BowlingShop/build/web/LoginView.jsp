<jsp:include page="Header.jsp?titleName=Login"></jsp:include>
    <center>
       <div class="middle" style="background-color: lightgoldenrodyellow; margin-left: 250px; margin-right: 250px;margin-top: 25px; padding: 25px;border-radius: 25px">
            <form action="Login" method="post">
                Username
                <br>
                <br>
                <input type="text" name="username" required>
                <br>
                <br>
                Password
                <br>
                <br>
                <input type="password" name="password" required>
                <br>
                <br>
                <input type="submit">
            </form>
        </div>
    </center>
</body>
</html>
