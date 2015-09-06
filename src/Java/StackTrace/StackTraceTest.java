/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.StackTrace;

import java.util.Scanner;

/**
 *
 * @author Yuhariz
 */
public class StackTraceTest {

    private static Scanner in;

	/**
     * @param n
     * @return 
     */
    public static int factorial(int n){
        
        System.out.println("Factorial("+n+") :");
        Throwable t = new Throwable();
        
        StackTraceElement[] frames = t.getStackTrace();
        
        for(StackTraceElement f : frames){
            System.out.println(f);
        }
        
        int r;
        if(n<=1) r=1 ;
        else r=n*factorial(n-1);
        
        System.out.println("Return "+r) ;
        
        return r ;
    }
    
    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = in.nextInt();
        factorial(n);
    }
    
}
