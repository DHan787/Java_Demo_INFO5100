package edu.neu.mgen.HW14;

public class ChatServerMain {
    public static void main(String[] args) {
        int port = 8989;

        ChatServer server = new ChatServer(port);
        server.execute();
    }
}