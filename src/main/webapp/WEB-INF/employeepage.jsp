<%-- 
    Document   : employeepage.jsp
    Created on : Aug 24, 2017, 6:31:57 AM
    Author     : kasper
--%>

<%@page import="FunctionLayer.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee home page</title>
    </head>
    <body>
        <%@include file="../menu.jsp" %>
        <% User user = (User) request.getSession().getAttribute("user"); %>
        <h1>Hello <% out.println(user.getEmail()); %> </h1>

        <% ArrayList<Order> orderList = (ArrayList) request.getSession().getAttribute("orderList");%>
        <div class="table-responsive">
            <table class="table table-sriped table-sm">
                <thead>
                    <tr>
                        <th>Order No.</th>
                        <th>Height</th>
                        <th>Width</th>
                        <th>Length</th>
                        <th>Status</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Order ord : orderList) {%>
                    <tr>
                        <th><% out.println(ord.getId()); %></th> 
                        <th><% out.println(ord.getHeight()); %></th> 
                        <th><% out.println(ord.getWidth()); %></th>              
                        <th><% out.println(ord.getLength()); %></th> 
                        <th><% out.println(ord.getStatus()); %></th>
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
                <form name="approve" action="FrontController" method="POST">
            <input type="hidden" name="command" value="approve">
            Approve Order: <input type="text" name="id" placeholder="0">
            <input type="submit" value="Approve">
            </form>
    </body>
</html>
