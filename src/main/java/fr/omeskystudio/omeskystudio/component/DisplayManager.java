package fr.omeskystudio.omeskystudio.component;

import fr.omeskystudio.omeskystudio.Settings;

import javax.swing.*;
import java.awt.*;

public class DisplayManager {

    static JFrame jFrame;

    public static void create(){
        jFrame = new JFrame();
        jFrame.setSize(new Dimension(Settings.width,Settings.height));
        jFrame.setTitle(Settings.Titre);
        jFrame.setResizable(Settings.setResizable);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void update(){
        /*if (jFrame.getWidth() <= 517.0f || jFrame.getHeight() <= 517.0f){
            jFrame.setResizable(false);
            jFrame.setSize(517,517);
            jFrame.setLocation((Settings.width/2)-(517/2),(Settings.height/2)-(517/2));
            jFrame.setResizable(true);
        }*/
    }

    public static Dimension getDimension(){
        return jFrame.getSize();
    }
    public static void setDimension(Dimension dimension){
        jFrame.setSize(dimension);
        jFrame.setLocation((Settings.width/2)-(dimension.width/2),(Settings.height/2)-(dimension.height/2));
    }

    public static void addComponent(JPanel panel){
        jFrame.add(panel);
    }
}
