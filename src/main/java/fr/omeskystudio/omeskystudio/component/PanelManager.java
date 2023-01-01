package fr.omeskystudio.omeskystudio.component;

import javax.swing.*;

public class PanelManager extends JPanel{


    public void create(String name){
        this.setName(name);
        this.setBounds(0,0, DisplayManager.jFrame.getWidth(), DisplayManager.jFrame.getHeight());
        DisplayManager.addComponent(this);
    }


    public void update(){
        this.setBounds(0,0, DisplayManager.jFrame.getWidth(), DisplayManager.jFrame.getHeight());
    }
    public JPanel getPanel(){
        return this;
    }

    public void addComponent(JButton component){
        this.add(component);
    }
    public void addComponent(JLabel component){
        this.add(component);
    }
}
