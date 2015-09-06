/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Chapter15.Networking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author 7
 */
public class AnsweringServer {

    /**
     * @param args the command line arguments
     */
    String[] nameList = {"Dude Herlino", 
                         "Joko Widodo",
                         "Basuki Thahaya Purnama",
                         "Nurdin Abdullah",
                         "Abdullah Azhar Annas",
                         "Hugua",
                         "Ridwan Kamil",
                         "Bima Arya",
                         "Tri Rismaharini",
                         "Ganjar Pranowo"};
    
    public static void main(String[] args) {
        // TODO code application logic here
        AnsweringServer an = new AnsweringServer();
        an.start();
    }
    
    public void start(){
        try {
            while(true){
                @SuppressWarnings("resource")
				Socket client = new ServerSocket(1000).accept();

                try(PrintWriter writer = new PrintWriter(client.getOutputStream())){
                    
                    String name = answer();
                    
                    writer.println(name);
                    
                    System.out.println(name);
                }
            }      
        } catch (IOException e) {
        }
    }
    
    private String answer() {
        int random = (int) (Math.random() * nameList.length);
        return nameList[random];
    }
    
}
