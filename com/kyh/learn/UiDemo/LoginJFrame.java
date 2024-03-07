package com.kyh.learn.UiDemo;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class LoginJFrame extends JFrame {
    public LoginJFrame(){

        initializeJFrame();
        initializeJMenuBar();
        
        this.setVisible(true);
    }

    private void initializeJFrame() {
        this.setSize(600, 400);
        //this.setLocation(660, 340);
        this.setLocationRelativeTo(null);
        this.setTitle("LOGIN");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void initializeJMenuBar() {
        // Initialize Menu
        JMenuBar jMenuBar = new JMenuBar();

        // Menu
        JMenu funcJMenu = new JMenu("open");
        JMenu aboutMenu = new JMenu("about");

        // MenuItem
        JMenuItem openItem = new JMenuItem("打开");
        JMenuItem saveItem = new JMenuItem("保存");
        JMenuItem lcwItem = new JMenuItem("另存为");
        
        JMenuItem gzhItem = new JMenuItem("公众号");

        // Add JMenuItem to JMenu
        funcJMenu.add(openItem);
        funcJMenu.add(saveItem);
        funcJMenu.add(lcwItem);

        aboutMenu.add(gzhItem);

        // Add JMenu to JMenuBar
        jMenuBar.add(funcJMenu);
        jMenuBar.add(aboutMenu);

        // Add JMenuBar to JFrame
        this.setJMenuBar(jMenuBar);
    }
}
