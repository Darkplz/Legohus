<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>

<%@page import="FunctionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
        <%@include file="../menu.jsp" %>
        <% User user = (User) request.getSession().getAttribute("user"); %>
        <h1>Hello <% out.println(user.getEmail()); %> </h1>
        You are now logged in as a customer of our wonderful site.
        <form name="calculator" action="FrontController" method="POST">
            <input type="hidden" name="command" value="calculator">
            Height:<br>
            <input type="text" name="height" placeholder="6">
            <br>
            Width:<br>
            <input type="text" name="width" placeholder="6">
            <br>
            Length:<br>
            <input type="text" name="length" placeholder="6">
            <br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
