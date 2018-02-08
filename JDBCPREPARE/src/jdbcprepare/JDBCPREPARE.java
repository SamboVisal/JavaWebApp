/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcprepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author sambo visal
 */
public class JDBCPREPARE {

    public static void main(String[] args)throws Throwable {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch3", "root", "");
        PreparedStatement ps = con.prepareStatement("insert into student values (?,?,?)");
        ps.setInt(1,125);
        ps.setString(2,"Messi");
        ps.setInt(3,32);
        ps.execute();
        Statement ss= con.createStatement();
        ResultSet re = ss.executeQuery("select * from student");
        while(re.next()){
            int id = re.getInt("id");
            System.out.println(id);
        }
    }
    
}
