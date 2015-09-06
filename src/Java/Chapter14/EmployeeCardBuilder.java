/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Chapter14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

/**
 *
 * @author 7
 */
public class EmployeeCardBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        try {
            FileOutputStream fos = new FileOutputStream("employee.ser");
            
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(EmployeeCardBuilder.createObject("1", "Arriz", "CEO"));
                oos.writeObject(EmployeeCardBuilder.createObject("2", "Aldy", "CTO"));
                oos.writeObject(EmployeeCardBuilder.createObject("3", "Yourz", "COO"));
                
                oos.flush();
                
                oos.close();
                
                JOptionPane.showMessageDialog(null, "Success Save Object");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to Save Object");
        }
        
    }
    
    public static EmployeeCard createObject(String nip, String nama, String jabatan){
        
        EmployeeCard ec = new EmployeeCard();
        
        ec.setNip(nip);
        ec.setName(nama);
        ec.setJabatan(jabatan);
        
        return ec;
    }
    
}
