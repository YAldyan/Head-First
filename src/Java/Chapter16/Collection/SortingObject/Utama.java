/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Chapter16.Collection.SortingObject;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Yuhariz
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Siswa[] sum = new Siswa[3];
        
        sum[0] = new Siswa();
        sum[0].setNis("13");
        sum[0].setName("Mahmud");
        sum[0].setKelas("3");

        sum[1] = new Siswa();
        sum[1].setNis("11");
        sum[1].setName("Amin");
        sum[1].setKelas("1");
        
        sum[2] = new Siswa();
        sum[2].setNis("25");
        sum[2].setName("Murder");
        sum[2].setKelas("2");
        
        Arrays.sort(sum);
        
        for (Siswa sum1 : sum) {
            System.out.println("NIS     : "+sum1.getNis());
            System.out.println("NAMA    : "+sum1.getName());
            System.out.println("KELAS   : "+sum1.getKelas()+"\n");
        }
        
        Collections.sort(Arrays.asList(sum), new SiswaComparator());
        
        for (Siswa sum1 : sum) {
            System.out.println("NIS     : "+sum1.getNis());
            System.out.println("NAMA    : "+sum1.getName());
            System.out.println("KELAS   : "+sum1.getKelas()+"\n");
        }
    }
    
}
