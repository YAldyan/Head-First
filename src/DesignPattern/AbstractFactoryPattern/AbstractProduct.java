/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.AbstractFactoryPattern;

/**
 *
 * @author 7
 */
public class AbstractProduct {
    
    public String productName;
    public String factoryName;
    public double price ;
    
    public AbstractProduct(String productName, String factoryName, double price){
        this.productName = productName ;
        this.factoryName = factoryName ;
        this.price = price;
        System.out.println("Beli "+this.productName+" di "+this.factoryName);
    }
    
    public void pay(){
        System.out.println("Bayar "+this.price+" ke "+this.factoryName);
    }
}
