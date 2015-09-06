/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Logging.EventTracer;

import java.awt.Component;
import java.awt.Container;
import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * @author 7
 */
public class EventTracer {
    
    private InvocationHandler handler ;
    
    public EventTracer(){
        
        handler = new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method+" : "+args[0]);
                return null;
            }
        };
    }
    
    public void add(Component c){
        
        try {
            // get all events to which this component can listen
            BeanInfo info = Introspector.getBeanInfo(c.getClass());
            
            EventSetDescriptor[] eventSets = info.getEventSetDescriptors();
            for(EventSetDescriptor eventSet : eventSets)
                addListener(c, eventSet);
        } catch (IntrospectionException e) {
        }
        
        if(c instanceof Container){
            // get all children and call add recursively
            for(Component comp : ((Container)c).getComponents())
                add(comp);
        }
    } 
    
    public void addListener(Component c, EventSetDescriptor eventSets){
        // make proxy object for this listener type and route all calls to the handler
        Object proxy = Proxy.newProxyInstance(null, new Class[]{eventSets.getListenerType()}, handler);
        
        // add the proxy as a listener to the component
        Method addListenerMethod = eventSets.getAddListenerMethod();
        
        try {
            addListenerMethod.invoke(c, proxy);
        } catch (IllegalAccessException e) {
        } catch (IllegalArgumentException e) {
        } catch (InvocationTargetException e) {
        }
    }
    
}
