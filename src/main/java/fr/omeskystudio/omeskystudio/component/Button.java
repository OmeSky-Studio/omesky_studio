package fr.omeskystudio.omeskystudio.component;

import fr.omeskystudio.omeskystudio.component.ActionListener.MainMenuListener;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton{

    public void create(String name, int x, int y, int width, int height, Color color, int size){
        this.setName(name);
        this.setText(name);
        this.setBackground(color);
        this.setBounds(x, y, width, height);
        this.setFont(new Font("Verdana",Font.BOLD,size));
        this.addActionListener(new MainMenuListener(this.getButton()));

    }

    public JButton getButton(){
        return this;
    }
}
