<%-- 
    Document   : Header
    Created on : Aug 10, 2018, 3:12:56 PM
    Author     : INT303
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container-fluid" style="background-color: ${cookie.bgColor.value}">
    <div style="background-color: white">Session ID = ${cookie.JSESSIONID.value}</div>
    <table class="table">
        <tr>
            <td>
                <a href="index.html" title="Back to Home"><img src="https://www.cohnreznick.com/-/media/images/logos/cr_logo_animation.svg" width="120"/></a>
                <h1>${param.title}</h1>
            </td>
            <td>
                <c:if test="${cart!=null}">
                    <a href="ShowCart">Your Cart:(${cart.totalQuantity})</a>
                </c:if>
                &nbsp;&nbsp;&nbsp;
                <c:choose>
                    <c:when test="${sessionScope.user != null}">
                        Hello${sessionScope.user.name}
                    </c:when>
                    <c:otherwise>
                        Hello Guest
                    </c:otherwise>    
                </c:choose>
            </td>
        </tr>
    </table>
</div>
