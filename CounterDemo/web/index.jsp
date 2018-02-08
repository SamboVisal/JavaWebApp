
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Counter</title>
    </head>
    <body>
        
        <%
            Integer i= (Integer)application.getAttribute("counter");
            
            if(i==null||i==0)
            {
                i=1;
            }
            else{
                i++;
            }
            out.println(i);
            application.setAttribute("counter", i);
          %>
    </body>
</html>
