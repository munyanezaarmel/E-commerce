<%-- 
    Document   : adminpanel
    Created on : Nov 6, 2022, 7:35:55 AM
    Author     : armelmunyaneza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cn.armel.booking.connection.ConnectionDB"%>
<% ConnectionDB db=new ConnectionDB(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin | panel</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%=db.getCon()%>
    </body>
</html>
