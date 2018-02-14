<%-- 
    Document   : validate
    Created on : 09-Feb-2018, 08:34:24
    Author     : sambo visal
--%>
<%@page errorPage="Error.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String num1 = request.getParameter("num1");
            String num2 = request.getParameter("num2");
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            int res = n1/n2;
            out.println(res);
          %>
    </body>
</html>
