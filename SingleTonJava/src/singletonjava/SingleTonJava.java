/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonjava;

/**
 *
 * @author sambo visal
 */
public class SingleTonJava {

  
    private static SingleTonJava stc;
    private SingleTonJava(){
        System.out.println("object created...");
    }
    public void sayHello(){
        System.out.println("Hello world");
    }
    public static  SingleTonJava getInstance(){
        if(stc==null)
            stc = new SingleTonJava();
        
        
        return stc;
    }
}
