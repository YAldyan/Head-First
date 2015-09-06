/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Proxy;

import java.lang.reflect.Proxy;
import java.util.AbstractList;
import java.util.ArrayList;

/**
 *
 * @author Yuhariz
 */
public class InterceptSizeList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AbstractList<Object> list = new ArrayList<>();
        list.add("Testing1");
        //list.add("Testing2");
        
        Proxy proxy = (Proxy)Proxy.newProxyInstance(ArrayList.class.getClassLoader(), 
                new Class[]{Comparable.class}, new InterceptMethod(list, "size"));
        
        list.set(0,(Object) proxy) ;
        
        System.out.println(list.size());
    }
    
}
