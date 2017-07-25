/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto_programmazione_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author Antonio
 */
public class SimilarityServerIO {
    
    public void sendToServer(String str) {
        BufferedReader in = null;
        PrintStream out = null;
        Socket socket = null;
        try {
            socket = new Socket("localhost", 4000);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintStream(socket.getOutputStream(), true);
            out.println("upload");
            out.flush();
            out.println(str);
            out.flush();
            out.close();
            in.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
