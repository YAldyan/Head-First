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
public class DarkRoast extends Beverage{
    
    public DarkRoast(){
        description = "Dark Roast Coffee" ;
    }
    @Override
    public double cost() {
        return .99 ;//To change body of generated methods, choose Tools | Templates.
    }
}
