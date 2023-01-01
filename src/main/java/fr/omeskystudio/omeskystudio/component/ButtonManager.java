package fr.omeskystudio.omeskystudio.component;

import fr.omeskystudio.omeskystudio.component.ActionListener.MainMenuListener;

import javax.swing.*;
import java.awt.*;

public class ButtonManager extends JButton{

    public void create(String name, int x, int y, int width, int height, Color color, int size){
        this.setName(name);
        this.setText(name);
        this.setBackground(color);
        this.setBounds(x, y, width, height);
        this.setFont(new Font("Verdana",Font.BOLD,size));
        this.addActionListener(new MainMenuListener(this.getButton()));

    }

    public void update(int x, int y, int width, int height){
        this.setBounds(x, y, width, height);
    }

    public JButton getButton(){
        return this;
    }
}
