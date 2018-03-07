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
public class MainClass {

    public static void main(String[] args) {
        
        
       
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingleTonJava d =SingleTonJava.getInstance();
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingleTonJava d1 =SingleTonJava.getInstance();
            }
        });
        t1.start();
        t2.start();
    }
}
