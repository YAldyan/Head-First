/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.IteratorPattern;

/**
 *
 * @author 7
 */
public class Item {
    
    String name;
    String description;
    boolean vegetarian;
    double price;
    
    public Item(String name, String description, boolean vegetarian,double price){
        this.name = name;
        this.description = description ;
        this.vegetarian = vegetarian ;
        this.price = price ;
    }
    
    public String getName(){
        return name;
    }
    
    public String description(){
        return description;
    }
    
    public double getPrice(){
        return price;
    }
    
    public boolean isVegetarian(){
        return vegetarian;
    }
}
