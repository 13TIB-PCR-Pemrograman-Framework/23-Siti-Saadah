<%-- 
    Document   : nameView
    Created on : Oct 13, 2015, 8:16:57 AM
    Author     : LabGSG-15
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View</title>
    </head>
    <body>
        <h1>
        <spring:nestedPath path="Login">
    <form action="" method="post">
        Username:
        <spring:bind path="username">
            <input type="text" name="${status.expression}" value="${status.value}">
        </spring:bind>
            <br>
             Password:
        <spring:bind path="password">
            <input type="password" name="${status.expression}" value="${status.value}">
        </spring:bind>
        <input type="submit" value="OK">
    </form>
</spring:nestedPath>
        </h1>
    </body>
</html>
