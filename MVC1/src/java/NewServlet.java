/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.model;

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
        TestDAO tes = new TestDAOImpl();
        model m = new model();
        PrintWriter pw = response.getWriter();
        List<model> list;
        list = (LinkedList) tes.select();
        if(list!=null){
           pw.println(m.getId() + " - " + m.getName());
        }else{
            pw.println("no record");
        }
    }

}
