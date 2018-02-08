<%-- 
    Document   : Validate
    Created on : 07-Feb-2018, 09:09:46
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
        <h3>Hello</h3>
        <%
            String user = request.getParameter("name");
            String email = request.getParameter("email");
            if(user.equals("visal")){
                if(email.equals("p@gmail.com")){
                    session.setAttribute("name",user);
                    session.setAttribute("email",email);
                    RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
                    rd.forward(request, response);
                }
                out.println("email is not correct");
                
            }
            out.println("username is not correct");
         %>
    </body>
</html>
