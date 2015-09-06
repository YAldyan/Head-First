/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.CommandPattern;

/**
 *
 * @author 7
 */
public class FlipDownCommand implements Command{

    private Light theLight ;
    
    public FlipDownCommand(Light theLight){
        this.theLight = theLight ;
    }
    
    @Override
    public void execute() {
        //To change body of generated methods, choose Tools | Templates.
        theLight.turnOff();
    }
    
}
