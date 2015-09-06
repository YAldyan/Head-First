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
public class IronFactory extends AbstractFactory{

    @Override
    public AbstractProduct createProduct() {
       return new IronProduct(); //To change body of generated methods, choose Tools | Templates.
    }    
}
