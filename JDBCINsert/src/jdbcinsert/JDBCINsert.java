/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcinsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author sambo visal
 */
public class JDBCINsert {

   
    public static void main(String[] args)throws Throwable {
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch3", "root","");
        Statement stt = c.createStatement();
        int id = 0,age=0; String name;
        Scanner s = new Scanner(System.in);
        System.out.println("Input id "); id =  s.nextInt();
        System.out.println("Input age "); age =  s.nextInt();
        System.out.println("Input name "); name = s.next();
        
        stt.execute("insert into student values('"+id+"','"+name+"','"+age+"')");
        
        
    }
    
}
