/*
 * @Author: Jinag Han
 * @Date: 2023-12-05 02:18:49
 * @Description: 
 * @LastEditTime: 2023-12-05 02:31:58
 * 
 */
/*
 * @Author: Jinag Han
 * @Date: 2023-12-05 02:18:49
 * @Description: 
 * @LastEditTime: 2023-12-05 02:19:01
 * 
 */
package edu.neu.mgen.HW14;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private int port;
    private Set<String> userNames = new HashSet<>();
    private Set<UserThread> userThreads = new HashSet<>();

    public ChatServer(int port) {
        this.port = port;
    }

    public void execute() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Chat Server is listening on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                UserThread newUser = new UserThread(socket, this);
                userThreads.add(newUser);
                newUser.start();
            }
        } catch (IOException ex) {
            System.out.println("Error in the server: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}