/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sambo visal
 */
public class NewServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter p = response.getWriter();
        String addName = request.getRemoteAddr();
        String host = request.getRemoteHost();
        String Welcome  = request.getParameter("name");
        p.println("Welcome " + Welcome);
        p.println("You  ip address "+addName+" and your computer name "+host);
        ServletContext ctx = getServletContext();
        String c =(String) ctx.getInitParameter("color");
        ServletConfig cf = getServletConfig();
        String school = cf.getInitParameter("school");
        
        p.println(c);
        p.println("Your school name "+school);
        
        //http session
        HttpSession s = request.getSession();
  
       
    }


}
