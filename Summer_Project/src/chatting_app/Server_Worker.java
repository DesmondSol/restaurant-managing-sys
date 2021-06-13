/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatting_app;

import org.apache.commons.lang3.StringUtils;
//import com.sun.xml.internal.ws.util.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class Server_Worker extends Thread{
    private final Socket clientSocket;
    
public Server_Worker(Socket clientSocket) {
        this.clientSocket=clientSocket;
    }
    
    @Override
    public void run() {
        try {
            handleClientSocket();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(Server_Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handleClientSocket() throws IOException, InterruptedException{
        InputStream inputStream= clientSocket.getInputStream();
        OutputStream outputStream = clientSocket.getOutputStream();
                
        BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
        String line;
        int trk=1;
        while((line=reader.readLine())!=null){
            
            if(trk==1){
                 String msg1="please write quit to exit "+"\n";
            outputStream.write(msg1.getBytes());
            
            }
            
            String[] token=StringUtils.split(line);
            if (token != null && token.length > 0){
            
                String cmd=token[0];
            if ("quit".equalsIgnoreCase(line)){
                trk=1;
                break;
            }else{
                  String msg="Unknown command "+cmd+"\n";
            outputStream.write(msg.getBytes());
            trk++;
            }
            }
          
        }
                
                
                for(int i=0;i<=10;i++){
                    outputStream.write(("now the time is = "+new Date()+"\n").getBytes());
                    Thread.sleep(1000);
                }
                
                clientSocket.close();
    }
    
    
}
