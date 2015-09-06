/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Chapter16.Collection.Map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 7
 */
public class MapTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Map<String, String> staff = new HashMap<>();
        
        staff.put("144-25-5464", "Amy Lee");
        staff.put("567-24-2546", "Harry Hacker");
        staff.put("157-62-7935", "Gary Cooper");
        staff.put("456-62-5527", "Fransesca Cruz");
        
        // print all entries
        System.out.println(staff);
        
        // remove an entry
        staff.remove("567-24-2546");
        
        //replace an entry
        staff.put("456-62-5527", "Fransesca Cruz");
        
        // look up a value
        System.out.println(staff.get("157-62-7935"));
        
        for(Map.Entry<String, String> entry : staff.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println("Key = "+key+", Value = "+value);
        }
    }
    
}
