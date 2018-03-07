<%-- 
    Document   : home
    Created on : 15-Feb-2018, 23:59:02
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
              String[] selects;
          %>
        <%
           selects = request.getParameterValues("select");
           String userReq =(String) session.getAttribute("user");
           String sessInfo = (String)session.getAttribute("user");
           String appInfo = (String)application.getAttribute("user");
           String userPage = (String)pageContext.getAttribute("user");
              
               if(sessInfo!=null){
                  out.println("From session ");
               }
               if(appInfo!=null){
                   out.println("From application ");
               }
               if(userPage!=null){
                   out.println("From context "); 
               } 
        %>
    </body>
</html>
