package fr.omeskystudio.omeskystudio.menu;

import fr.omeskystudio.omeskystudio.component.Button;
import fr.omeskystudio.omeskystudio.component.Display;
import fr.omeskystudio.omeskystudio.component.Panel;

import javax.swing.*;
import java.awt.*;

public class MainMenu {

    Panel panel;

    public void init(){
        panel = new Panel();
        panel.create("MainMenu");

        /*calcule posX*/
        int size_Width = 200;
        int size_Height = 50;
        int posX = Display.getDimension().width /2 - size_Width / 2;
        int posY = Display.getDimension().height /2 + size_Height;

        Button website = new Button();
        website.create("SiteWeb",posX,100,200,50, Color.gray);
        panel.addComponent(website.getButton());
        Button love2d = new Button();
        love2d.create("Love2d",posX,200,200,50, Color.gray);
        panel.addComponent(love2d.getButton());
        Display.addComponent(panel.getPanel());
    }

    public void update(){

    }


}
