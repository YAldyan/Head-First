/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Chapter16.Collection.PriorityQueue;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;

/**
 *
 * @author 7
 */
public class PriorityQueueTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PriorityQueue<GregorianCalendar> pq = new PriorityQueue<>();
        
        pq.add(new GregorianCalendar(1906, Calendar.DECEMBER, 9)) ; // Hopper
        pq.add(new GregorianCalendar(1815, Calendar.DECEMBER, 10)) ; // A. Lovelace
        pq.add(new GregorianCalendar(1903, Calendar.DECEMBER, 3)) ; // J. Von Neumann
        pq.add(new GregorianCalendar(1910, Calendar.JUNE, 22)); // K .Zuse
        
        System.out.println("Iterating Over Elements...");
        
        for(GregorianCalendar date:pq){
            System.out.println(date.get(Calendar.YEAR));
        }
        
        System.out.println("Removing Elements...");
        
        while(!pq.isEmpty()){
            System.out.println(pq.remove().get(Calendar.YEAR));
        }
    }
    
}
