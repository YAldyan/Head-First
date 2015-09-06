/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Chapter16.Collection.TreeSet;

import java.util.Objects;

/**
 *
 * @author 7
 */
public class Item implements Comparable<Item>{

    private String description ;
    private int partNumber ;
    
    public Item(String aDescription, int aPartNumber){
        this.description = aDescription ;
        this.partNumber = aPartNumber ;
    }
    
    public String getDescription(){
        return this.description ;
    }
    
    @Override
    public String toString(){
        return "[description = "+ description +", partNumer = " + partNumber+"]" ;
    }
    
    @Override
    public boolean equals(Object otherObject){
        if(this == otherObject) return true ;
        if(otherObject == null) return false ;
        if(getClass() != otherObject.getClass()) return false ;
        
        Item other = (Item) otherObject ;
        return Objects.equals(description, other.description) && partNumber == other.partNumber ;
    }

    public int hashcode(){
        return Objects.hash(description, partNumber) ;
    }
    
    @Override
    public int compareTo(Item other){
        return Integer.compare(partNumber, other.partNumber);
    }
       
}
