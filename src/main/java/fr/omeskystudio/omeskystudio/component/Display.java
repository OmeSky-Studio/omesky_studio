package fr.omeskystudio.omeskystudio.component;

import fr.omeskystudio.omeskystudio.Settings;

import javax.swing.*;
import java.awt.*;

public class Display {

    static JFrame jFrame;

    public static void create(){
        jFrame = new JFrame();
        jFrame.setSize(new Dimension(Settings.width,Settings.height));
        jFrame.setTitle(Settings.Titre);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static Dimension getDimension(){
        return jFrame.getSize();
    }

    public static void addComponent(JPanel panel){
        jFrame.add(panel);
    }
}
