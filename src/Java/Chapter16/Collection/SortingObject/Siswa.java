package Java.Chapter16.Collection.SortingObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuhariz
 */
public class Siswa implements Comparable<Object>{
    
    private String nis ;
    private String name ;
    private String kelas ;

    /**
     * @return the nis
     */
    public String getNis() {
        return nis;
    }

    /**
     * @param nis the nis to set
     */
    public void setNis(String nis) {
        this.nis = nis;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the kelas
     */
    public String getKelas() {
        return kelas;
    }

    /**
     * @param kelas the kelas to set
     */
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    @Override
    public int compareTo(Object o) {
        Siswa s = (Siswa) o ;
        return this.kelas.compareTo(s.kelas);
    }
}
