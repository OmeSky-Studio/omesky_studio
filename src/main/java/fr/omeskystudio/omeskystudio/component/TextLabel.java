package fr.omeskystudio.omeskystudio.component;

import javax.swing.*;
import java.awt.*;

public class TextLabel extends JLabel{

    public void create(String titre, int x, int y, int width, int height, int size) {
        this.setBounds(x, y, width, height);
        this.setText(titre);
        this.setFont(new Font("Verdana",Font.BOLD,size));
    }

    public JLabel getLabel() {
        return this;
    }
}
