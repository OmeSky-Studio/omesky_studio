package fr.omeskystudio.omeskystudio.component;

import javax.swing.*;
import java.awt.*;

public class Button {

    static JButton button;

    public void create(String name, int x, int y, int width, int height, Color color){
        button = new JButton(name);
        button.setBackground(color);
        button.setBounds(x, y, width, height);
    }

    public JButton getButton(){
        return button;
    }
}
