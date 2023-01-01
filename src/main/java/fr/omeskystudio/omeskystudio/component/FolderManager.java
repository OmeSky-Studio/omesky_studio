package fr.omeskystudio.omeskystudio.component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FolderManager {

    static String rootPath = "C:\\Users\\Guillaume\\AppData\\Roaming\\OmeSky_Studio";
    static String htdocsPath = "C:\\Users\\Guillaume\\AppData\\Roaming\\OmeSky_Studio\\htdocs";

    public static void createDefaultFolder(){
        try {
            Files.createDirectories(Paths.get(rootPath));
            FolderManager.createFolder("htdocs");
            FolderManager.createFolder("love2d-workspace");
            System.out.println("Directory root is created!");
        } catch (IOException e) {
            System.err.println("Failed to create directory!" + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void createFolder(String folderName){
        try {
            Files.createDirectories(Paths.get(rootPath+"\\"+folderName));
            System.out.println("Directory "+folderName +" is created!");
        } catch (IOException e) {
            System.err.println("Failed to create directory!" + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public static void createFolderHtdocs(String folderName){
        try {
            Files.createDirectories(Paths.get(htdocsPath+"\\"+folderName));
            System.out.println("Directory "+folderName +" is created!");
        } catch (IOException e) {
            System.err.println("Failed to create directory!" + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static Boolean isRootCreated(){
        return Files.isDirectory(Paths.get(rootPath));
    }

    public static boolean isCreated(String path) {
        return Files.isDirectory(Paths.get(rootPath+"\\"+path));
    }
    public static boolean isCreatedHtdocs(String path) {
        return Files.isDirectory(Paths.get(htdocsPath+"\\"+path));
    }
}
