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
public class TokoKelontong extends AbstractFactory {

    public TokoKelontong(String name) {
        super(name);
    }
    
    @Override
    public AbstractProduct createProduct(String type) {
        //To change body of generated methods, choose Tools | Templates.
        
        if(type.equals("Mie Instan"))return new MieInstan("Mie Goreng", "Indofood", 2000);
        if(type.equals("Snack")) return new Snack("Biskuit", "Indofood", 5000);   
        
        return null;
    }
    
}
