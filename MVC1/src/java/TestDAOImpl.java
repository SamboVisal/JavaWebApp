
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sambo visal
 */
public class TestDAOImpl implements TestDAO {
     public Connection getCon() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(model.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc","root","");
        } catch (SQLException ex) {
            Logger.getLogger(model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
     @Override
    public int insert(model m){
        Connection con = getCon();
        try {
            PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
            
            
            ps.setInt(1, m.getId());
            ps.setString(2, m.getName());
            ps.setString(3, m.getEmail());
            ps.execute();
            return 1;  
            
            
        } catch (SQLException ex) {
            Logger.getLogger(model.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    @Override
    public int update(model m){
        Connection con = getCon();
        String sql = "UPDATE employee SET name = ? , "
                + "email = ? "
                + "WHERE id = ?";
         try {
             PreparedStatement stt = con.prepareStatement(sql);
            
             stt.setString(1,m.getName());
             stt.setString(2,m.getEmail());
             stt.setInt(3, m.getId());
             stt.executeUpdate();
             return 1;
         } catch (SQLException ex) {
             Logger.getLogger(TestDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
             return 0;
         }
        
    }
    
     @Override
    public List<model> select(){
        Connection con = getCon();
        List<model> list = new LinkedList<>();
        
        Statement stt;
         try {
             stt = con.createStatement();
             ResultSet res = stt.executeQuery("select * from employee");
             while(res.next()){
                 model m = new model();
                 int id = res.getInt("id");
                 String name = res.getString("name");
                 String email = res.getString("email");
                 
                 m.setId(id);
                 m.setName(name);
                 m.setEmail(email);
                 
                 list.add(m);
             }
             
             res.close();
         } catch (SQLException ex) {
             Logger.getLogger(TestDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         if(list.size()>0){
             return list;
         }else{
             return null;
         }
    }
    
}
