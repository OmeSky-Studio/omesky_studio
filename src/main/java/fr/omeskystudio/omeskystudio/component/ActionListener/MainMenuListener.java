package fr.omeskystudio.omeskystudio.component.ActionListener;

import fr.omeskystudio.omeskystudio.component.ButtonManager;
import fr.omeskystudio.omeskystudio.component.DialogBox;
import fr.omeskystudio.omeskystudio.component.FolderManager;
import fr.omeskystudio.omeskystudio.menu.MainMenu;
import fr.omeskystudio.omeskystudio.menu.SiteWebMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuListener extends ButtonManager implements ActionListener {

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
            if(!FolderManager.isCreated("htdocs")){
                DialogBox.Erreur("Directory /htdocs is not created");
                FolderManager.createFolder("htdocs");
                DialogBox.Info("Directory /htdocs is created");
            }
            System.out.println(button.getName());
            SiteWebMenu siteWebMenu = new SiteWebMenu();
            siteWebMenu.init(DialogBox.Question("Nom du siteWeb ?"));
            MainMenu.panel.getPanel().setVisible(false);
        } else if (button.getName() == "Love2d") {
            if(!FolderManager.isCreated("love2d-workspace")){
                DialogBox.Erreur("Directory /love2d-workspace is not created");
                FolderManager.createFolder("love2d-workspace");
                DialogBox.Info("Directory /love2d-workspace is created");
            }
            DialogBox.Question("Nom du projet ?");
        }else {
            System.exit(1);
        }
    }
}
