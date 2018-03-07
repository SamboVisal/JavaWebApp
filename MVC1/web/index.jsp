<%-- 
    Document   : index
    Created on : 21-Feb-2018, 09:19:23
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
        <h1>Insert New Data</h1>
        <form action="Servlet" method="post">
            Id : <input type="id" name="id"> <br>
            Username : <input type="text" name="name"> <br>
            Email : <input type="email" name="email"> <br>
            <input type="submit" value="submit">
        </form>
        <form action="NewServlet" method="post">
            <input type="submit" value="Show Result">
        </form>
        <h1>Update Result</h1>
        <form action="Servlet" method="post">
            Id : <input type="text" name="upid"> <br>
            Username : <input type="text" name="upname"> <br>
            Email : <input type="email" name="upemail"> <br>
            <input type="submit" value="Update Row">
        </form>
    </body>
</html>
