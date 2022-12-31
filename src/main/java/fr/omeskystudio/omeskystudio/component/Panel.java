package fr.omeskystudio.omeskystudio.component;

import javax.swing.*;

public class Panel {

    static JPanel panel;

    public void create(String name){
        panel = new JPanel();
        panel.setName(name);
        panel.setBounds(0,0,Display.jFrame.getWidth(),Display.jFrame.getHeight());
    }

    public JPanel getPanel(){
        return panel;
    }

    public void addComponent(JButton button){
        panel.add(button);
    }
}
