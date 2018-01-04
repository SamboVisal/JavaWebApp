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
public class Success extends HttpServlet {

/*
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
    
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Success</title>");            
            out.println("</head>");
            out.println("<body>");
        //    out.println("<a href='"s"'>Button</a> ");
            out.println("</body>");
            out.println("</html>");
        }
    }

    */

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        Integer luck = (Integer)request.getAttribute("luckNum");
        if(luck==4){
            pw.println("You have won a lucky number between your lucky number "+luck +" and no. " + "6");
        }else{
             pw.println("You have won a lucky number between your lucky number "+luck +" and no. " + "4");
        }
        
    }


}
