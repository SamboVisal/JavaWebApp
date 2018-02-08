/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transactiontest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sambo visal
 */
public class TransactionTest {

    public static Connection getCon(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transaction", "root","");
                con.setAutoCommit(false);
            } catch (SQLException ex) {
                Logger.getLogger(TransactionTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TransactionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    public static void debit(int acno,int amt,Connection con) throws SQLException{
        Statement stt = con.createStatement();
        stt.execute("update bank set balance = balance - '"+amt+"' where id = '"+acno+"' ");
    }
    public static void credit(int acno,int amt,Connection con) throws SQLException{
       Statement stt = con.createStatement();
       stt.execute("update bank set balance = balance + '"+amt+"' where id = '"+acno+"' ");
    }
    public static void main(String[] args) {
        try {
            int debAc,creAc,amt;
            Connection con = getCon();
            con.setAutoCommit(false);
            
        } catch (SQLException ex) {
            Logger.getLogger(TransactionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
