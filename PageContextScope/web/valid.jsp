<%-- 
    Document   : valid
    Created on : 15-Feb-2018, 23:51:10
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
        <form action="index/home.jsp">
          <%!
              String[] select;
              String sessReq;
              String appReq;
              String pagectx;
              
          %>
          <%
              String user = request.getParameter("name");
              session.setAttribute("user", user);
              select = request.getParameterValues("select");
              if(select!=null){
                  for(String se:select){
                   Integer scope = se.equals("session")?PageContext.SESSION_SCOPE:(se.equals("application")?PageContext.APPLICATION_SCOPE:PageContext.PAGE_SCOPE);
                   pageContext.setAttribute("user", user ,scope);
                  } 
              }else{
                  out.println("nonoe");
              }
            
          %>
          <input type="submit" value="view">
           
          
        </form>
          <form action="index/delete.jsp">
              <input type="submit" value="delete"><br> 
            <input type="checkbox"  name="select" value="session">Session <br>
            <input type="checkbox"  name="select" value="application">Application <br>
            <input type="checkbox"  name="select" value="page context">PageContext<br>
          </form>
    </body>
</html>
