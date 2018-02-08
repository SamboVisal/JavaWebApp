<%-- 
    Document   : success
    Created on : 07-Feb-2018, 09:24:15
    Author     : sambo visal
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name = (String)session.getAttribute("name");
            PrintWriter pw = response.getWriter();
            pw.println("Hi "+name);
            
        %>
        <a href="index.html">Logout</a>
    </body>
</html>
