
import java.sql.Connection;
import java.util.List;
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
public interface TestDAO {
     public Connection getCon();
     public int insert(model m);
     public int update(model m);
     public List<model> select();
}
