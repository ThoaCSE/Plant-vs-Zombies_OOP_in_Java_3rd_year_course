package com.plantsdefense.view;

import javax.swing.*;
import java.awt.*;

public class Frame {

    public Frame(){
        JFrame frame = new JFrame("Plants Defense");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);

        frame.setVisible(true);
    }
    public static void main(String[]  args){
        SwingUtilities.invokeLater(Frame::new);
    }
}
