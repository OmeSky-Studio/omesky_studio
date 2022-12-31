package fr.omeskystudio.omeskystudio.component.ActionListener;

import fr.omeskystudio.omeskystudio.component.Button;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuListener extends Button implements ActionListener {

    JButton button;

    public MainMenuListener(JButton _button) {
        button = _button;
    }

    void MainMenuListener(JButton _button){
        button = _button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(button.getName() == "SiteWeb"){
            System.out.println("Lancemant de la page de création de site web");
        } else if (button.getName() == "Love2d") {
            System.out.println("Lancemant de la page de création de projet love2d");
        }else {
            System.exit(1);
        }
    }
}
