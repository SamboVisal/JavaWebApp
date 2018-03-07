/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.model;


/**
 *
 * @author sambo visal
 */
public class Servlet extends HttpServlet {

  

 
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        model sm = new model();
        PrintWriter pw = response.getWriter();
        int res=0;
        TestDAO tes = new TestDAOImpl();
        
        //insert data
        int id = Integer.valueOf(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        
        //update data
        int upid = Integer.valueOf(request.getParameter("upid"));
        String upname = request.getParameter("upname");
        String upemail = request.getParameter("upemail");
        
        //insert new data
        
        if(!request.getParameter("id").isEmpty()){
           sm.setId(id);
           sm.setName(name);
           sm.setEmail(email);
           res = tes.insert(sm);
        }
        
        
        //update data
        
        if(!request.getParameter("upid").isEmpty()){
            sm.setId(upid);
            sm.setEmail(upemail);
            sm.setName(upname);
            res = tes.update(sm);
        }
        
        
        if(res == 1){
            RequestDispatcher dis = request.getRequestDispatcher("success.html");
            dis.forward(request, response);
        }
        else{
            pw.println("failed");
        }
        
        
    }
    


}
