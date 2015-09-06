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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Light lamp = new Light();
        
        Command switchUp   = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);
        
        Switch s = new Switch();
        
        try {
            if(args[0].equalsIgnoreCase("ON")){
                s.storeAndExecute(switchUp);
                System.exit(0);
            }
            if(args[0].equalsIgnoreCase("Off")){
                s.storeAndExecute(switchDown);
                System.exit(0);
            }
        } catch (Exception e) {
        }
    }
    
}
