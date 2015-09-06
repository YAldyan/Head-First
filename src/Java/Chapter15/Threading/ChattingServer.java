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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JTextArea;

/**
 *
 * @author 7
 */
public final class ChattingServer {
    
    private ArrayList<PrintWriter> clientOutputStreams ;
    @SuppressWarnings("unused")
	private JTextArea txaMessage ;
    
    public ChattingServer(JTextArea txaMessage){
        this.txaMessage = txaMessage ;
        
        go();
    }
    
    public class ClientResponse implements Runnable{

        BufferedReader reader ;
        Socket client ;
        
        public ClientResponse(Socket client){
            try {
                this.client = client ;
                InputStreamReader isr = new InputStreamReader(this.client.getInputStream());
                reader = new BufferedReader(isr);
            } catch (IOException e) {
            }
        }
        
        @Override
        public void run() {
            String message ;
            
            try {
                while((message = reader.readLine()) != null){
                    System.out.println("Message : "+message);
                    forwardToClient(message);
                }
            } catch (IOException e) {
            }
        }
        
    }
    
    public void go() {
        clientOutputStreams = new ArrayList<PrintWriter>();
        try {
            @SuppressWarnings("resource")
			ServerSocket serverSock = new ServerSocket(5000);
            while(true) {
                Socket clientSocket = serverSock.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutputStreams.add(writer);
                
                Thread t = new Thread(new ClientResponse(clientSocket));
                t.start();
                System.out.println("got a connection");
            }
        } catch (IOException ex) {}
    }
    
    public void forwardToClient(String message) {
        @SuppressWarnings("rawtypes")
		Iterator it = clientOutputStreams.iterator();
        while (it.hasNext()) {
            try {
                PrintWriter writer = (PrintWriter) it.next();
                writer.println(message);
                writer.flush();
            } catch (Exception ex) {}
        }
    }
    
}
