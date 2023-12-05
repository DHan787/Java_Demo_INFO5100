/*
 * @Author: Jinag Han
 * @Date: 2023-12-03 22:32:36
 * @Description: 
 * @LastEditTime: 2023-12-05 02:44:22
 * 
 */
package edu.neu.mgen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab3 {

    private static class ColorCirclePanel extends JPanel {
        private Color color = Color.WHITE;

        public void setColor(Color newColor) {
            color = newColor;
            setBackground(newColor);
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(color);
            g.fillOval(10, 10, 100, 100);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Chooser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        ColorCirclePanel circlePanel = new ColorCirclePanel();
        frame.add(circlePanel);

        String[] colors = { "Red", "Blue", "Green" };
        JComboBox<String> colorDropdown = new JComboBox<>(colors);
        JTextField colorText = new JTextField(10);
        colorText.setEditable(false);

        colorDropdown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String) colorDropdown.getSelectedItem();
                colorText.setText(selectedColor);

                switch (selectedColor) {
                    case "Red":
                        circlePanel.setColor(Color.RED);
                        break;
                    case "Blue":
                        circlePanel.setColor(Color.BLUE);
                        break;
                    case "Green":
                        circlePanel.setColor(Color.GREEN);
                        break;
                }
                circlePanel.repaint();
            }
        });

        frame.add(colorDropdown);
        frame.add(colorText);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}