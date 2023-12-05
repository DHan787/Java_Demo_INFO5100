/*
 * @Author: Jinag Han
 * @Date: 2023-12-05 02:22:11
 * @Description: 
 * @LastEditTime: 2023-12-05 02:22:17
 * 
 */
package edu.neu.mgen.HW14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatApplicationGUI {

    private JFrame frame;
    private JTextField messageField;
    private JTextArea chatArea;
    private JButton sendButton;

    public ChatApplicationGUI() {
        createWindow();
        setupChatArea();
        setupMessageField();
        setupSendButton();
        frame.setVisible(true);
    }

    private void createWindow() {
        frame = new JFrame("Chat Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
    }

    private void setupChatArea() {
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        frame.add(scrollPane, BorderLayout.CENTER);
    }

    private void setupMessageField() {
        messageField = new JTextField();
        frame.add(messageField, BorderLayout.SOUTH);
    }

    private void setupSendButton() {
        sendButton = new JButton("Send");
        frame.add(sendButton, BorderLayout.EAST);
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
    }

    private void sendMessage() {
        String message = messageField.getText();
        chatArea.append("You: " + message + "\n");
        messageField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChatApplicationGUI();
            }
        });
    }
}
