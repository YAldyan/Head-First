/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.FactoryPattern;

/**
 *
 * @author 7
 */
public class Main {

    /**
     */
    public static AbstractFactory factory ;
    public static AbstractProduct product ;
    
    public static void main(String[] args) {
        // TODO code application logic here
        factory = new WoodFactory();
        product = factory.createProduct();
        
        factory = new IronFactory();
        product = factory.createProduct();
    }
    
}
