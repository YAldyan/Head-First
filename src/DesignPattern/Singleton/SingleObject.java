/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.Singleton;

/**
 *
 * @author 7
 */
public class SingleObject {
    
    // create single object
    private static SingleObject instance = new SingleObject();
    
    private SingleObject(){};
    
    public static SingleObject getInstance(){
        return instance ;
    }
}
