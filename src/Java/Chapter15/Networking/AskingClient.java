/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Chapter15.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author 7
 */
public class AskingClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AskingClient ac = new AskingClient();
        ac.call();
    }
    
    public void call() {
        try {
            @SuppressWarnings("resource")
			Socket client = new Socket("127.0.0.1", 1000);
            InputStreamReader isr = new InputStreamReader(client.getInputStream()); 
            
            try(BufferedReader reader = new BufferedReader(isr)){
                String answer = reader.readLine();
                System.out.println("What's Your Name : " + answer);
            }
        }
        catch (IOException ex)
        {}
    }
    
}
