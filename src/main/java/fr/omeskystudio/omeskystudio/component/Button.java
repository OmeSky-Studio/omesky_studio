package fr.omeskystudio.omeskystudio.component;

import javax.swing.*;
import java.awt.*;

public class Button {

    JButton button;

    public void create(String name, int x, int y, int width, int height, Color color, int size){
        button = new JButton(name);
        button.setBackground(color);
        button.setBounds(x, y, width, height);
        button.setFont(new Font("Verdana",Font.BOLD,size));
    }

    public JButton getButton(){
        return button;
    }
}
