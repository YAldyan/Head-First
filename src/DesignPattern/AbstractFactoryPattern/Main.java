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
public class Main {

    /**
     */
    public static AbstractFactory factory ;
    public static AbstractProduct produk ;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        factory = new TokoKelontong("Toko Kelontong");
        produk = factory.createProduct("Mie Instan") ;       
    }
    
}
