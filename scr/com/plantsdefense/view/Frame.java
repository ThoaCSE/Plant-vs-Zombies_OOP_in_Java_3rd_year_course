package com.plantsdefense.view;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{
    public static String title = "Plants Defense";
    public static Dimension size = new Dimension(1920, 1080);

    public Frame (){
        setTitle(title);
        setSize(size);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        new Frame();
    }
}
