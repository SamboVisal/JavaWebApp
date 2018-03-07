<%-- 
    Document   : index
    Created on : 20-Feb-2018, 10:59:28
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
        <jsp:useBean id="sm1" class="model. StudentModel"> </jsp:useBean>
            <%
                sm1.setId(123);
                sm1.setAge(19);
                sm1.setName("visal");
                
                out.println(sm1.getName());

            %>
           
    </body>
</html>
