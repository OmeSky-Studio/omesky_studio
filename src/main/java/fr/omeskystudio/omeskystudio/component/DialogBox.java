package fr.omeskystudio.omeskystudio.component;

import javax.swing.*;

public class DialogBox {

    public static void Info(String msg){
        JOptionPane box = new JOptionPane();
        box.showMessageDialog(null,msg,"Info",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void Warning(String msg){
        JOptionPane box = new JOptionPane();
        box.showMessageDialog(null,msg,"Info",JOptionPane.WARNING_MESSAGE);
    }

    public static void Erreur(String msg){
        JOptionPane box = new JOptionPane();
        box.showMessageDialog(null,msg,"Info",JOptionPane.ERROR_MESSAGE);
    }

    public static String Question(String msg){
        JOptionPane box = new JOptionPane();
        return box.showInputDialog(null,msg,"Question",JOptionPane.QUESTION_MESSAGE);
    }

}
