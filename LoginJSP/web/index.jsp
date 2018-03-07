<%-- 
    Document   : index
    Created on : 09-Feb-2018, 08:57:46
    Author     : sambo visal
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
        ArrayList<String> error = new <String>ArrayList();
        %>
         <%
                 error = (ArrayList<String>) session.getAttribute("erros");
                 if(session.getAttribute("erros")==null){
                  request.getSession().removeAttribute("erros");
                 }else{
             //       out.println(error); 
                    Iterator ite = error.iterator();
                    
                    out.println("<h3>Errors Occurred</h3>");
                    while(ite.hasNext()){
                        out.println("<font color=red >");
                        
                        out.print(ite.next() +" <br>");
                        out.println("</font>");
                    }
                    request.getSession().removeAttribute("erros");
                    session.invalidate();
                 }
               request.getSession().removeAttribute("erros");  
              %>
        <form action="validate.jsp" method="post">
            
            
           
            <h3>Sign up JSP</h3>
           
            <label for="name">
                  Username: 
            </label>  
           <input type="text" name="name" id="name"> <br> <br>
            <label for="name">
                   Email:
            </label>  
           <input type="text" name="email" id="email"> <br> <br> 
            Password: <input type="text" name="pass1"> <br><br>
            Confirm Password: <input type="text" name="pass2" > <br><br>
            <% 
                boolean isCkecked = false;
            %>
            Gender: <br><br>
            
    
            <input type="radio" name="gender" value="Male" checked=""> Male <br>
            <input type="radio" name="gender" value="Female"> Female <br>
            <input type="radio" name="gender" value="Other"> Other <br> <br>
            Phone Number: <input type="text" name="phone" > <br><br>
            Date of Birth: <input type="date" name="dob" min="01-01-1990" max="30-12-2017" required> <br><br>
            <input type="submit" value="submit">
        </form>
    </body>
</html>
