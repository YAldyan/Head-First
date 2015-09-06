/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.InnerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author 7
 */
public class AnonymousInnerClass {
    
    public void start(int interval, final boolean beep){
        
        ActionListener listener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date() ;
                System.out.println("At the Tone The Time is : "+now);
                if(beep)
                    Toolkit.getDefaultToolkit().beep();
            }
        };
        
        Timer t = new Timer(interval, listener) ;
        t.start();
    }
}
