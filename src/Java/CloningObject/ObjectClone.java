/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.CloningObject;

/**
 *
 * @author Yuhariz
 */
public class ObjectClone {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        //Without Clone
        Song s1 = new Song();
        s1.setSinger("NOAH");
        s1.setTitle("Tertinggal Waktu");
        
        Song s2 = s1 ;
        s2.setSinger("Peterpan");
        s2.setTitle("Mungkin Nanti");
        
        System.out.println("1. "+s1.getSinger()+" : "+s1.getTitle());
        System.out.println("2. "+s2.getSinger()+" : "+s2.getTitle());
        
        //Using Clone
        Song s3 = new Song();
        s3.setSinger("Iwan Fals");
        s3.setTitle("Bento");
        
        Song s4 = (Song) s3.clone() ;
        s4.setSinger("Slank");
        s4.setTitle("Virus");
        
        System.out.println("3. "+s3.getSinger()+" : "+s3.getTitle());
        System.out.println("4. "+s4.getSinger()+" : "+s4.getTitle());
        
    }
    
}
