/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Chapter16.Collection.SortingObject;

import java.util.Comparator;

/**
 *
 * @author Yuhariz
 */
public class SiswaComparator implements Comparator<Siswa>{

    @Override
    public int compare(Siswa s1, Siswa s2) {
        return s1.getName().compareTo(s2.getName());
    }
    
}
