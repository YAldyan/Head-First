/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Chapter14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author 7
 */
public class EmployeeCardReader {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        
        try {
            FileInputStream fis = new FileInputStream("employee.ser");
            
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                EmployeeCard ec1 = (EmployeeCard) ois.readObject();
                EmployeeCard ec2 = (EmployeeCard) ois.readObject();
                EmployeeCard ec3 = (EmployeeCard) ois.readObject();
                
                EmployeeCardReader.printEmployeeDetails(ec1);
                EmployeeCardReader.printEmployeeDetails(ec2);
                EmployeeCardReader.printEmployeeDetails(ec3);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to Read Object");
        }
        
    }
    
    public static void printEmployeeDetails(EmployeeCard ec){
        
        System.out.println("-Employee Details-");
        System.out.println("Employee Number   : "+ec.getNip());
        System.out.println("Employee Name     : "+ec.getName());
        System.out.println("Employee Position : "+ec.getJabatan());
        System.out.println("*******************");
        
    }
}
