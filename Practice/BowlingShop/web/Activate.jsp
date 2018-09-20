<jsp:include page="Header.jsp?titleName=Activate"></jsp:include>
    <center>
        <div class="middle" style="background-color: lightgoldenrodyellow;margin-left: 250px;margin-right: 250px;margin-top: 25px;padding: 25px;border-radius: 25px">
            <form action="Activate" method="post">
            ActivateKey
            <br>
            <br>
            <input type="text" name="email" value="${email}" hidden>
            <input type="text" name="acitvatekey" required>
            <br>
            <br>
            <input type="submit">
            </form>
        </div>
    </center>
    </body>
</html>
