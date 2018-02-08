/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcbatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author sambo visal
 */
public class JDBCBatch {

   
    public static void main(String[] args)throws Throwable {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch3", "root","");
        Statement stt = con.createStatement();
        
        LinkedList<String> queryList = new LinkedList();
        queryList.add("insert into student values('127','Pirlo','36') ");
        queryList.add("update student set name = 'sambo' where id = '124' ");
        
        Iterator it = queryList.iterator();
        while(it.hasNext()){
            stt.addBatch((String) it.next());
        }
        
        stt.executeBatch();
    }
    
}
