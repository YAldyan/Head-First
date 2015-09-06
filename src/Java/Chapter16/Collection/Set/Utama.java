/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Chapter16.Collection.Set;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author 7
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Singer> singer = new ArrayList<Singer>();
    
    public void contentOfList(){
        
        Singer s1 = new Singer();
        s1.setCountry("Indonesia");
        s1.setMusic("POP");
        s1.setSex('L');
        s1.setSong("Sahabatku Kekasihku");
        s1.setName("Raffi Ahmad");
        
        Singer s2 = new Singer();
        s2.setCountry("Indonesia");
        s2.setMusic("POP");
        s2.setSex('L');
        s2.setSong("Sahabat Sejati");
        s2.setName("Sheila on 7");
        
        Singer s3 = new Singer();
        s3.setCountry("Indonesia");
        s3.setMusic("POP");
        s3.setSex('L');
        s3.setSong("Langit Tak Mendengar");
        s3.setName("Peterpan");
        
        Singer s4 = new Singer();
        s4.setCountry("Indonesia");
        s4.setMusic("POP");
        s4.setSex('L');
        s4.setSong("Bento");
        s4.setName("Iwan Fals");
        
        Singer s5 = new Singer();
        s5.setCountry("Indonesia");
        s5.setMusic("POP");
        s5.setSex('L');
        s5.setSong("Salam 2 Jari");
        s5.setName("Iwan Fals");
        
        singer.add(s1);
        singer.add(s2);
        singer.add(s3);
        singer.add(s4);
        singer.add(s5);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Singer> singerSet = new HashSet<Singer>();
        
        singerSet.addAll(Utama.singer) ;
    }
    
}
