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
public class MieInstan extends AbstractProduct{

    public String name = "Mie Instan" ;
    
    public MieInstan(String productName, String factoryName, double price) {
        super(productName, factoryName, price);
    }
    
}
