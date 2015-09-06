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
public abstract class AbstractFactory {
    
    public AbstractFactory(String name){
        System.out.println("Selamat Datang di "+name);
    }
    
    public abstract AbstractProduct createProduct(String type);
}
