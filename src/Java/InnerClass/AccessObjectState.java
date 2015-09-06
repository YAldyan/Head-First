/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.InnerClass;

import javax.swing.JOptionPane;

/**
 *
 * @author 7
 */
public class AccessObjectState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();
        
        JOptionPane.showMessageDialog(null, "Quit Program ?");
        System.exit(0);
    }
    
}
