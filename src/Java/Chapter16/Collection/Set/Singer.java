/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Chapter16.Collection.Set;

import java.util.Objects;

/**
 *
 * @author 7
 */
public class Singer implements Comparable<Object>{
    
    private String name ;
    private char sex ;
    private String song ;
    private String country ;
    private String music ;
    
    @Override
    public boolean equals(Object o){
        Singer r = (Singer) o;
        
        return this.getName().equals(r.getName());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.getName());
        return hash;
    }

    
    @Override
    public int compareTo(Object o) {
        Singer r = (Singer) o;
        
        return this.getSong().compareTo(r.getSong()) ;
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
     * @return the sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * @return the song
     */
    public String getSong() {
        return song;
    }

    /**
     * @param song the song to set
     */
    public void setSong(String song) {
        this.song = song;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the music
     */
    public String getMusic() {
        return music;
    }

    /**
     * @param music the music to set
     */
    public void setMusic(String music) {
        this.music = music;
    }
    
    
}
