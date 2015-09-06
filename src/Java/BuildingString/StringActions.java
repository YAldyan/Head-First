/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.BuildingString;

/**
 *
 * @author Yuhariz
 */
public class StringActions {

    /**
     */
    public static StringBuffer buffer = new StringBuffer();
    
    class ThreadOne implements Runnable{

        @Override
        public void run() {
            buffer.append("Sel");
        }
        
    }
    
    class ThreadTwo implements Runnable{

        @Override
        public void run() {
            buffer.append("amat");
        }
        
    }
    
    public void go(){
        try {
            new ThreadOne().run();
            new ThreadTwo().run();
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String kata = "Selamat";//Immutable
        
        StringBuilder builder = new StringBuilder(); //Mutable Single Thread
        builder.append("Sel");
        builder.append("amat");
        
        StringActions sa = new StringActions(); //Mutable Multithread
        sa.go();
        
        System.out.println(kata);
        System.out.println(builder);
        System.out.println(StringActions.buffer);
    }
    
}
