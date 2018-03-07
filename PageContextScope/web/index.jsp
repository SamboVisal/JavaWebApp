<%-- 
    Document   : index
    Created on : 15-Feb-2018, 10:21:08
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
        <h1>Input Information</h1>
        <form action="valid.jsp" method="post">
        <label for="username">
            Username : 
        </label>
            <input id="username" type="text" name="name" placeholder="name"> <br>
        <label for="checkbox">
            Activities :
        </label> 
            <br>
            <input type="checkbox" id="checkbox" name="select" value="session">Session <br>
            <input type="checkbox" id="checkbox2" name="select" value="application">Application <br>
            <input type="checkbox" id="checkbox2" name="select" value="page context">PageContext<br>
            <input type="submit" value="submit">
        </form>
    </body>
</html>
