/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author Yuhariz
 */
public class AnalyseCapabilityClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class<?> cl = Class.forName("java.util.Date") ;
            
            Constructor<?> cnst[] = cl.getConstructors();
            Field fld[] = cl.getDeclaredFields();
            Method mtd[] = cl.getMethods();

            System.out.println("Nama Konstruktornya");
            for (Constructor<?> cnst1 : cnst) {
                System.out.println(cnst1.getName());
            }

            System.out.println("Nama Fieldnya");
            for (Field fld1 : fld) {
                System.out.println(fld1.getName());
            }
            
            System.out.println("Nama Methodnya");
            for (Method mtd1 : mtd) {
                System.out.println(mtd1.getName());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        }
        
    }  
    
}
