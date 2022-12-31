package fr.omeskystudio.omeskystudio.menu;

import fr.omeskystudio.omeskystudio.Settings;
import fr.omeskystudio.omeskystudio.component.Button;
import fr.omeskystudio.omeskystudio.component.Display;
import fr.omeskystudio.omeskystudio.component.Panel;
import fr.omeskystudio.omeskystudio.component.TextLabel;

import javax.swing.*;
import java.awt.*;

public class MainMenu {

    Panel panel;

    public void init(){
        panel = new Panel();
        panel.create("MainMenu");

        //INIT TITLE
        TextLabel titre = new TextLabel();
        titre.create(Settings.Titre,Display.getDimension().width /2 - 200/2,50,300,100,24);


        /*calcule posX*/
        int size_Width = 200;
        int size_Height = 50;
        int posX = Display.getDimension().width /2 - size_Width / 2;
        int posY = Display.getDimension().height /2 - size_Height;

        Button website = new Button();
        website.create("SiteWeb",posX,posY,200,50, Color.gray, 16);

        posY += size_Height+10;

        Button love2d = new Button();
        love2d.create("Love2d",posX,posY,200,50, Color.gray,16 );

        panel.addComponent(titre.getLabel());
        panel.addComponent(website.getButton());
        panel.addComponent(love2d.getButton());
        Display.addComponent(panel.getPanel());
    }

    public void update(){

    }


}
