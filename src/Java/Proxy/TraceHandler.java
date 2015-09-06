/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @author Yuhariz
 */
public class TraceHandler implements InvocationHandler{

    private final Object object ;
    
    public TraceHandler(Object object){
        this.object = object ;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        
        //print implicit arguments
        System.out.println(this.object);
        
        //print method name
        System.out.println("."+method.getName()+"(");
        
        //print explicit arguments
        if(args != null){
            for (Object arg : args) {
                System.out.println(arg);
                System.out.println(", ");
            }
        }
        
        System.out.println(")");
        
        return method.invoke(object, args) ;
    }
    
}
