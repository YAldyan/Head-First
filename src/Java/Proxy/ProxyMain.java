/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Yuhariz
 */
public class ProxyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object[] elements = new Object[1000] ;
        
        for(int i=0;i<elements.length;i++){
            Integer value = i+1 ;
            InvocationHandler handler = new TraceHandler(value) ;
            
            Object proxy = Proxy.newProxyInstance(null, new Class[] {
            Comparable.class}, handler) ;
            
            elements[i] = proxy ;
        }    
            
        Integer key = new Random().nextInt(elements.length) + 1; 
            
        int result = Arrays.binarySearch(elements, key) ;
            
        if(result >= 0) System.out.println(elements[result]) ;
    }
    
}
