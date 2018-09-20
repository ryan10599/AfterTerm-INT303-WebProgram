<jsp:include page="Header.jsp?titleName=Register"></jsp:include>
   <center>
       <div class="middle" style="background-color: lightgoldenrodyellow; margin-left: 250px; margin-right: 250px;margin-top: 25px; padding: 25px;border-radius: 25px">
           <form action="Register" method="post" >
           Firstname
           <br>
           <br>
           <input type="text" name="firstname" required>
           <br>
           <br>
           Lastname
           <br>
           <br>
           <input type="text" name="lastname" required>
           <br>
           <br>
           Email
           <br>
           <br>
           <input type="email" name="email" required>
           <br>
           <br>
           Password
           <br>
           <br>
           <input type="password" name="password" required>
           <br>
           <br>
           Address
           <br>
           <br>
           <input type="text" name="address" requried>
           <br>
           <br>
           <input type="submit">
           </form>
       </div>
   </center>
    </body>
</html>
