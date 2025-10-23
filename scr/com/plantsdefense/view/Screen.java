package com.plantsdefense.view;

import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel{
    public static int frameWidth, frameHeight;
    public static boolean isFirst = true;

    public Screen(){
        setBackground(new Color(120,90,70));
        setLayout(new GridLayout(1,0));
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(isFirst){
            frameWidth = getWidth();
            frameHeight = getHeight();
            isFirst = false;
        }
    }
}