/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author 7
 */
public class DailyAdviceClient
{
    @SuppressWarnings("resource")
	public void go() {
        try {
            Socket s = new Socket("127.0.0.1", 4242);
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream()); 
            try (BufferedReader reader = new BufferedReader(streamReader)) {
                String advice = reader.readLine();
                System.out.println("Today you should: " + advice);
            }
        }
        catch (IOException ex)
        {}
    }
    
    public static void main(String[] args)
    {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
