package fr.omeskystudio.omeskystudio.menu;

import fr.omeskystudio.omeskystudio.Settings;
import fr.omeskystudio.omeskystudio.component.ButtonManager;
import fr.omeskystudio.omeskystudio.component.DisplayManager;
import fr.omeskystudio.omeskystudio.component.PanelManager;
import fr.omeskystudio.omeskystudio.component.TextLabelManager;

import java.awt.*;

public class MainMenu {

    public static PanelManager panel;
    ButtonManager website = new ButtonManager(),love2d = new ButtonManager();;
    TextLabelManager titre = new TextLabelManager();
    public void init(){
        DisplayManager.setDimension(new Dimension(517,517));
        panel = new PanelManager();
        panel.create("MainMenu");

        //INIT TITLE

        titre.create(Settings.Titre, DisplayManager.getDimension().width /2 - 200/2,50,300,100,24);


        /*calcule posX*/
        int size_Width = 200;
        int size_Height = 50;
        int posX = DisplayManager.getDimension().width /2 - size_Width / 2;
        int posY = DisplayManager.getDimension().height /2 - size_Height;


        website.create("SiteWeb",posX,posY,size_Width,size_Height, Color.gray, 16);

        posY += size_Height+10;

        love2d.create("Love2d",posX,posY,size_Width,size_Height, Color.gray,16 );

        panel.addComponent(titre.getLabel());
        panel.addComponent(website.getButton());
        panel.addComponent(love2d.getButton());
    }

    public void update(){
        panel.update();
        int size_Width = 200;
        int size_Height = 50;
        int posX = DisplayManager.getDimension().width /2 - size_Width / 2;
        int posY = DisplayManager.getDimension().height /2 - size_Height;
        website.update(posX,posY,size_Width,size_Height);
        posY += size_Height+10;
        love2d.update(posX,posY,size_Width,size_Height);
        titre.update(DisplayManager.getDimension().width /2 - 200/2,50,300,100);

    }


}
