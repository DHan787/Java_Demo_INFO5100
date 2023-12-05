/*
 * @Author: Jinag Han
 * @Date: 2023-12-05 02:26:14
 * @Description: 
 * @LastEditTime: 2023-12-05 02:27:22
 * 
 */
package edu.neu.mgen.HW14;

public class ChatClientMain {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 8989;

        ChatClient client = new ChatClient(hostname, port);
        client.execute();
    }
}
