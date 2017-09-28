<%-- 
    Document   : ageCalc
    Created on : Sep 26, 2017, 2:34:20 PM
    Author     : 684243
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age next Birthday</h1>
        <p>Enter your current age:
                <form action="AgeCalc" method="POST">
                    <input type="text"name="age">
                    <input type="submit" value="submit">
                </form>
        <c:if test="${a != null}">
            <span>${a}</span>
        </c:if>
        </p>
    </body>
</html>
