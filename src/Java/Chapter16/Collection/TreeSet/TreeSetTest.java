/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Chapter16.Collection.TreeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author 7
 */
public class TreeSetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4561));
        parts.add(new Item("Modem",9912));
        
        System.out.println(parts);
        
        SortedSet<Item> sortByDescription = new TreeSet<>(new 

            Comparator<Item>()
            {
                @Override
                public int compare(Item a, Item b){
                    String descrA = a.getDescription();
                    String descrB = b.getDescription();
                    
                    return descrA.compareTo(descrB);
                }
                
            });
        
        sortByDescription.addAll(parts) ;
        System.out.println(sortByDescription);
    }
    
}
