/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.BigNumbers;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author Yuhariz
 */
public class BigNumbers {

    public static BigInteger precisionInteger(){
        return new BigInteger("5678").multiply(new BigInteger("678910")) ;
    }
    
    public static BigDecimal precisionFloating(){
        return new BigDecimal("5.6797").multiply(new BigDecimal("6.6778")) ;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println((5678 * 678910));
        System.out.println(BigNumbers.precisionInteger());
        
        System.out.println(5.6797 * 6.6778);
        System.out.println(BigNumbers.precisionFloating());
    }
    
}
