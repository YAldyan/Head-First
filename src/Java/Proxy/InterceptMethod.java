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
public class InterceptMethod implements InvocationHandler {

    private final Object object ;
    private final String name ;
    
    public InterceptMethod(Object object, String name){
        this.object = object ;
        this.name = name ;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        
        if(method.getName().equalsIgnoreCase(name)){
            return 0 ;
        }
        
        return method.invoke(object, args) ;
    }
    
}
