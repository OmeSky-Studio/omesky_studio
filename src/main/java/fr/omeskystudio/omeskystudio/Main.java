package fr.omeskystudio.omeskystudio;

import fr.omeskystudio.omeskystudio.component.DisplayManager;
import fr.omeskystudio.omeskystudio.component.FolderManager;
import fr.omeskystudio.omeskystudio.menu.MainMenu;

public class Main {

    static DisplayManager window;
    static boolean running = false;
    MainMenu mainMenu = new MainMenu();

    public void init(){
        mainMenu.init();
        running = true;
        loop();
    }
    int tick = 0;
    public void update(){
        if(!FolderManager.isRootCreated()){
            FolderManager.createDefaultFolder();
        }
        mainMenu.update();
        DisplayManager.update();
        //System.out.println(Display.getDimension().getWidth() +"x"+Display.getDimension().getHeight());
    }

    public void loop(){
        while (running){
            update();
        }
    }

    public static void main(String[] args) {

        /*CREATE DISPLAY*/
        window.create();
        Main main = new Main();


        main.init();
    }
}