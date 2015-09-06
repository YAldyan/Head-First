/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Chapter15.Threading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author 7
 */
public class ChattingClientB {
    
    BufferedReader reader ;
    PrintWriter writer ;
    Socket client ;
    
    @SuppressWarnings("unused")
	private void settingNetwork(){
        try {
            client = new Socket("127.0.0.1", 1000);
            InputStreamReader isr = new InputStreamReader(client.getInputStream());
            
            reader = new BufferedReader(isr);
            writer = new PrintWriter(client.getOutputStream());
            System.out.println("Networking Established");            
        } catch (IOException e) {
        }
    }
    
    class IncomingReader implements Runnable {
        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("client read " + message);
                    //incoming.append(message + "\n");
                }
            } catch (IOException ex)
            {}
        }
    }
}
