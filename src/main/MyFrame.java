package main;

import javax.swing.*;

public class MyFrame extends JFrame {

    JLabel character;
    ImageIcon characterImage;

    public MyFrame() {
        characterImage = new ImageIcon("beI6o3tm_400x400.jpg");
        character = new JLabel();
        character.setIcon(characterImage);


        this.setTitle("SampleJFrame");
        this.setSize(800,400);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
