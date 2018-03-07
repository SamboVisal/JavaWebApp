<%-- 
    Document   : index
    Created on : 15-Feb-2018, 09:10:52
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
        <h1>Page Context</h1>
        <% 
           String userReq = (String) request.getParameter("user");
           if(userReq!=null){
               session.setAttribute("userSess",userReq);
               application.setAttribute("userApp",userReq);
               pageContext.setAttribute("userPageCtx",userReq);
//               pageContext.setAttribute("userSess",userReq,PageContext.SESSION_SCOPE);
//               pageContext.setAttribute("userApp",userReq,PageContext.APPLICATION_SCOPE);
//               pageContext.setAttribute("userPageCtx",userReq);
           }
           String sessInfo = (String)session.getAttribute("userSess");
           String appInfo = (String)application.getAttribute("userApp");
           String userPage = (String)pageContext.getAttribute("userPageCtx");
           out.println("From request  " + userReq);
           out.println("From session "+sessInfo);
           out.println("From application "+appInfo);
           out.println("From context "+userPage);
           
           pageContext.findAttribute("userSess");
        %>
    </body>
</html>
