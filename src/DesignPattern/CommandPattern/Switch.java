/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 7
 */
public class Switch {
    
    private List<Command> history = new ArrayList<Command>();
    
    public Switch(){}
    
    public void storeAndExecute(Command cmd){
        this.history.add(cmd);
        cmd.execute();
    }
}
