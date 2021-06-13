/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatting_app;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */

public class Server_main {
    public static void main(String[] args) {
        int port= 8881;
        try {
            ServerSocket serverSocket=new ServerSocket(port);
            while(true){
                System.out.println("About to accept client connection");
            Socket clientSocket=serverSocket.accept();
                System.out.println("connection accepted from"+clientSocket);
                
                Server_Worker worker= new Server_Worker(clientSocket);
                worker.start();
                
                
                
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Server_main.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    
    
}
