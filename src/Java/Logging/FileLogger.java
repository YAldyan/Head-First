/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yuhariz
 */
public class FileLogger {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Logger log = Logger.getLogger("Case Test");
        
        Handler handler = new FileHandler("file-log.log");
        
        log.addHandler(handler);
        
        for(int i=0;i<15;i++){
            log.log(Level.INFO, "Sequence : {0}", i);
        }
    }
    
}
