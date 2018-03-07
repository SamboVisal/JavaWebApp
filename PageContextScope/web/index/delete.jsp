<%-- 
    Document   : delete
    Created on : 16-Feb-2018, 09:58:07
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
       <%!
           String selects[];
       %>
       <%
           selects = request.getParameterValues("select");
           String userReq =(String) session.getAttribute("user");
           String sessInfo = (String)session.getAttribute("user");
           String appInfo = (String)application.getAttribute("user");
           String userPage = (String)pageContext.getAttribute("user");
           
               for(String se:selects){
                   Integer scope = se.equals("session")?PageContext.SESSION_SCOPE:(se.equals("application")?PageContext.APPLICATION_SCOPE:PageContext.PAGE_SCOPE);
                   pageContext.setAttribute("user", null ,scope);
                  
               }
           
       
       %>
    </body>
</html>
