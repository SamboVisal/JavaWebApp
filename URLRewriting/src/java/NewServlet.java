/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sambo visal
 */
public class NewServlet extends HttpServlet {





    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String path = "/URLRewriting/Second?name="+name+"&email="+email;
        PrintWriter pw = response.getWriter();
        pw.println("Welcome "+name+" Your email is "+email);
        pw.println("<br><a href='welcome'>View Details</a>");
        pw.print("<a href='second?uname="+name+"'>visit</a>");
    }

   
    
}
