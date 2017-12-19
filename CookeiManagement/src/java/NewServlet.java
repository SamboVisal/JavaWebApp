/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
        String Myname = request.getParameter("name");
        String Myemail = request.getParameter("email");

        Cookie NAME = new Cookie("name",Myname);
        Cookie PASS = new Cookie("pass",Myemail);
        response.addCookie(NAME);
        response.addCookie(PASS);
        
        RequestDispatcher rd = request.getRequestDispatcher("Second");
        rd.forward(request, response);
    }

}
