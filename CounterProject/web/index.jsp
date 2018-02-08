<%-- 
    Document   : index
    Created on : 08-Feb-2018, 09:56:03
    Author     : sambo visal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Integer counter = (Integer) application.getAttribute("counter");
            if(counter==null || counter==0){
                counter =1;
            }else{
                counter++;
            }
            out.println(counter);
            application.setAttribute("counter",counter);
         %>
    </body>
</html>
