/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sambo visal
 */
public class First extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
          
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        Integer count = (Integer)request.getAttribute("count1");
        Random r = new Random();
        int random = r.nextInt(10);
        if(random==4 || random==6){
            pw.println("You have won a lucky number "+random);
            request.setAttribute("luckNum", random);
            RequestDispatcher rd = request.getRequestDispatcher("Success");
            rd.forward(request, response);
        }else{
            pw.println("Your are no. "+count+" And your lucky number is "+random);
            pw.println("Please reload again");
        }
    }


}
