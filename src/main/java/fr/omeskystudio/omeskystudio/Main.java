package fr.omeskystudio.omeskystudio;

import fr.omeskystudio.omeskystudio.component.DisplayManager;
import fr.omeskystudio.omeskystudio.component.FolderManager;
import fr.omeskystudio.omeskystudio.menu.MainMenu;

public class Main {
    
    /*
        INIT DEFAULT VAR:
            Display, Running, MainMenu
    */
    static DisplayManager window;
    static boolean running = false;
    MainMenu mainMenu = new MainMenu();

    /*
        Init MAINMENU, SET RUNNING TRUE
        Vérification si le dossier root et créé
        Lancment de la fonction loop
    */
    public void init(){
        if(!FolderManager.isRootCreated()){
            FolderManager.createDefaultFolder();
        }
        mainMenu.init();
        running = true;
        loop();
    }
    
    /*
        Function update
            Update MainMenu et DisplayManager
    */
    public void update(){
        mainMenu.update();
        DisplayManager.update();
        //System.out.println(Display.getDimension().getWidth() +"x"+Display.getDimension().getHeight());
    }

    /*
        Function loop
    */
    public void loop(){
        while (running){
            update();
        }
    }

    /*
        Function pricipale
        Création de la fenêtre
        lancement de la fonction Init
    */
    public static void main(String[] args) {

        /*CREATE DISPLAY*/
        window.create();
        Main main = new Main();


        main.init();
    }
}
