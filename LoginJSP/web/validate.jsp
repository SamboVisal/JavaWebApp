<%-- 
    Document   : validate
    Created on : 09-Feb-2018, 08:52:10
    Author     : sambo visal
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String pass1 = request.getParameter("pass1");
            String pass2 = request.getParameter("pass2");
            String phone = request.getParameter("phone");
            String dob = request.getParameter("dob");
           
           ArrayList<String> erros = new ArrayList();
           
           char a[] = name.toCharArray();
           for(char ab:a){
              if(Character.isDigit(ab)){
                  erros.add("Name cannot contain number");
                  break;
               }
           }
           char ph[] = phone.toCharArray();
           for(char p:ph){
               if(Character.isAlphabetic(p)){
                   erros.add("phone number cannot contain alphabet");
                   break;
               }
           }
           if(name.isEmpty()){
               erros.add("Name cannot empty");
             
           }
           if(!email.contains("@")){
               erros.add("Email should contain @");
           }
           
           if(phone.length()>9){
               erros.add("Phone number cannot more than 9");
           }
           else if(phone.isEmpty()){
               erros.add("Phone cannot empty");
           }
           if(!pass1.matches(pass2)){
               erros.add("Password not match");
            }
            if(erros.size()>0){
                out.println(erros);
               
                session.setAttribute("erros",erros);
                request.getRequestDispatcher("index.jsp").forward(request, response);
                request.getSession().removeAttribute("erros");
            }else{
                request.getRequestDispatcher("success.jsp").forward(request, response);
            }
            %>
    </body>
</html>
