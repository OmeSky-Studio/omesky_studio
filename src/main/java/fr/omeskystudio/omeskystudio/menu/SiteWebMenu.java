package fr.omeskystudio.omeskystudio.menu;

import fr.omeskystudio.omeskystudio.Settings;
import fr.omeskystudio.omeskystudio.component.*;
import fr.omeskystudio.omeskystudio.component.PanelManager;

import java.awt.*;

public class SiteWebMenu {

    public static PanelManager panel = new PanelManager();
    public static String SiteName;
    public void init(String name){
        DisplayManager.setDimension(new Dimension(Settings.width,Settings.height));
        panel.create("SiteWeb: " + name);
        System.out.println("Load SiteWeb");
        TextLabelManager titre = new TextLabelManager();
        titre.create("SITE WEB: " + name, DisplayManager.getDimension().width /2 - 200/2,50,300,100,24);
        panel.addComponent(titre);

        if(!FolderManager.isCreatedHtdocs(name)){
            DialogBox.Info("Aucun projet a ete trouver");
            DialogBox.Info("Creations du projet");
            FolderManager.createFolderHtdocs(name);
            FolderManager.createFolderHtdocs(name+"\\css");
            FolderManager.createFolderHtdocs(name+"\\res");
            FolderManager.createFolderHtdocs(name+"\\pages");
            DialogBox.Info("Projet cree");
        }else{
            DialogBox.Info("Projet Charger");
        }
    }
}
