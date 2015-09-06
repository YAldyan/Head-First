/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.DecoratorPattern;

/**
 *
 * @author 7
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso" ;
    }
    @Override
    public double cost() {
        return 1.99 ;//To change body of generated methods, choose Tools | Templates.
    }
}
