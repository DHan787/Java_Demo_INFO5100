/*
 * @Author: Jinag Han
 * @Date: 2023-12-05 02:20:53
 * @Description: 
 * @LastEditTime: 2023-12-05 02:29:03
 * 
 */
/*
 * @Author: Jinag Han
 * @Date: 2023-12-05 02:20:53
 * @Description: 
 * @LastEditTime: 2023-12-05 02:20:59
 * 
 */
package edu.neu.mgen.HW14;

import java.io.*;
import java.net.*;

public class ChatClient {
    private String hostname;
    private int port;
    private String userName;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ChatClient(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }

    public void execute() {
        try {
            Socket socket = new Socket(hostname, port);

            System.out.println("Connected to the chat server");

            new ReadThread(socket, this).start();
            new WriteThread(socket, this).start();

        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }
}
