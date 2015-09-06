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
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author 7
 */
public class ChattingClient {
    
    private BufferedReader reader ;
    private Socket client ;
    private PrintWriter writer ;
    private JTextArea txaMessage ;
    
    public ChattingClient(JTextArea txaMessage){
        
        this.txaMessage = txaMessage ;
       
        go();
    }
    
    private void go(){
        settingNetwork() ;
        
        Thread thread = new Thread(new IncomingReader());
        thread.start();
    }
    
    private void settingNetwork(){
        try {
            client = new Socket("127.0.0.l",5000);
            InputStreamReader isr = new InputStreamReader(client.getInputStream());
            reader = new BufferedReader(isr);
            writer = new PrintWriter(client.getOutputStream());
            System.out.println("Network Established");
        } catch (IOException e) {
        }
    }
    
    public void send(JTextField txdMessage){

        try {
            writer.println(txdMessage.getText());
            writer.flush();    
        }
        catch (Exception ex) {
        }
        
        txdMessage.setText(null);
        txdMessage.requestFocus();
    }
    
    class IncomingReader implements Runnable {
        @Override
        public void run() {
            String message;
            try{
                while (!reader.readLine().isEmpty()) {
                    message = reader.readLine();
                    System.out.println("Client Read " + message);
                    txaMessage.append(message + "\n");
                }
            } catch (IOException ex)
            {}
        }
    }
}
