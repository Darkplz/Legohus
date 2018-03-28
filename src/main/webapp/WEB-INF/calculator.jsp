<%-- 
    Document   : Calculator
    Created on : Mar 22, 2018, 11:14:46 AM
    Author     : steven
--%>

<%@page import="FunctionLayer.User"%>
<%@page import="FunctionLayer.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Legohus!</title>
    </head>
    <body>
        <h1>Dine Brikker!</h1>
        
        <% Order house = (Order) request.getSession().getAttribute("house"); %>
        <% User user = (User) request.getSession().getAttribute("user"); %>
        
        <div class="table-responsive">
            <table class="table table-sriped table-sm">
                <thead>
                    <tr>
                        <th>Height</th>
                        <th>Width</th>
                        <th>Length</th>
                        <th>Large Bricks(4x2)</th>
                        <th>Medium Bricks(2x2)</th>
                        <th>Small Bricks(x2)</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th><% out.println(house.getHeight());%></th> 
                        <th><% out.println(house.getWidth());%></th> 
                        <th><% out.println(house.getLength());%></th>              
                        <th><% out.println(house.getlB());%></th> 
                        <th><% out.println(house.getmB());%></th> 
                        <th><% out.println(house.getsB());%></th> 
                    </tr>
                </tbody>
            </table>
        </div>
        <a href="../frontcontroller?command=order" Button="submit">Place Order</a>
        <form name="login" action="FrontController" method="POST">
            <input type="hidden" name="command" value="login">
            <input type="hidden" name="email" value="<%user.getEmail();%>">
            <input type="hidden" name="password" value="<%user.getPassword();%>">
            <input type="submit" value="Redo">
        </form>
    </body>
</html>
