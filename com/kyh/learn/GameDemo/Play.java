package com.kyh.learn.GameDemo;

import javax.swing.JFrame;

public class Play extends JFrame{
    public Play(){
        GameWindow gw = new GameWindow();
        this.add(gw);
        this.addKeyListener(gw);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        
        new Play();
    }

}
