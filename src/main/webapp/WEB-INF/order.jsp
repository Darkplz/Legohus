<%-- 
    Document   : Orders
    Created on : Mar 23, 2018, 9:44:54 AM
    Author     : steven
--%>

<%@page import="FunctionLayer.Order"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order site</title>
    </head>
    <body>
        <%@include file="../menu.jsp" %>
        <h1>Your orders!</h1>
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
    </body>
</html>
