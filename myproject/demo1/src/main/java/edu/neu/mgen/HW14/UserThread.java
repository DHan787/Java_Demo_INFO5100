/*
 * @Author: Jinag Han
 * @Date: 2023-12-05 02:19:24
 * @Description: 
 * @LastEditTime: 2023-12-05 02:19:29
 * 
 */
package edu.neu.mgen.HW14;

import java.io.*;
import java.net.*;

public class UserThread extends Thread {
    private Socket socket;
    private ChatServer server;
    private PrintWriter writer;

    public UserThread(Socket socket, ChatServer server) {
        this.socket = socket;
        this.server = server;
    }

    public void run() {
        try {
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            OutputStream output = socket.getOutputStream();
            writer = new PrintWriter(output, true);

            // Implement logic for message handling

        } catch (IOException ex) {
            System.out.println("Error in UserThread: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    // Implement methods to send messages to client
}
