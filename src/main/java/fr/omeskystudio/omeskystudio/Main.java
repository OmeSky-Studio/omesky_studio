package fr.omeskystudio.omeskystudio;

import fr.omeskystudio.omeskystudio.component.Display;
import fr.omeskystudio.omeskystudio.menu.MainMenu;

public class Main {

    static Display window;
    static boolean running = false;
    MainMenu mainMenu;
    public void init(){

        mainMenu = new MainMenu();
        mainMenu.init();
        running = true;
        loop();
    }

    public void update(){

    }

    public void loop(){
        while (!running){
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