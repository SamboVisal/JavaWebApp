/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sambo visal
 */
public class Validate {
    
   
    
    public boolean check(String name, String email) {
        boolean st = true;
        if(name.equals("pisal")&&email.equals("pisal@gmail.com")){
            return st;
        }
        else{
            st = false;
        }
        return st;
    }
    
}
