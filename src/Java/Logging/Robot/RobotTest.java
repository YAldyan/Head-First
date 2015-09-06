/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Logging.Robot;

import java.awt.EventQueue;
import java.awt.Frame;

/**
 *
 * @author 7
 */
public class RobotTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                // make frame with button panel
                Frame frame = new Frame();
                frame.setTitle("Button Test");
            }
        });
    }
    
}
