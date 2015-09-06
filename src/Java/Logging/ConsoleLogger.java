/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Logging;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yuhariz
 */
public class ConsoleLogger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Logger log = Logger.getLogger("Case Test");
        
        for(int i=0;i<15;i++){
            log.log(Level.INFO, "Sequence : {0}", i);
        }
    }
}
