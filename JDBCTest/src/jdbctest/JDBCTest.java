package jdbctest;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author sambo visal
 */
public class JDBCTest {

  
    public static void main(String[] args)throws Throwable {
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "");
        Statement stt = con.createStatement();
        ResultSet s = stt.executeQuery("select * from bank");
        String name = null,Address = null;
        int age=0,id=0;
        
        while(s.next()){
            id = s.getInt("id");
            age = s.getInt("sage");
            name = s.getString("sname");
            Address = s.getString("sadd");
            System.out.println("name is "+name +" address is "+Address);
        }
        
    }
    
}
