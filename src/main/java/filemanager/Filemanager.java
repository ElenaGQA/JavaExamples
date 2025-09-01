package filemanager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filemanager {

    private final String BASE_PATH = "D:\\QA\\Java\\LegionIT-1\\src\\main\\java\\filemanager\\";

    public static void main(String[] args) {
        String file = "createFileExample.txt";
        String text = "Because I could not stop for Death—\n" +
                "He kindly stopped for me—\n" +
                "The Carriage held but just Ourselves—\n" +
                "And Immortality.";
        Filemanager filemanager = new Filemanager();
        filemanager.createFile(file);
        filemanager.writeToFile(file, text);
        filemanager.readFromFile(file);
        filemanager.deleteFile(file);

    }

    public void createFile(String fileName) {
        File file = new File(BASE_PATH + fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToFile(String fileName, String text) {
        try {
            FileWriter fileWriter = new FileWriter(BASE_PATH + fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error, cannot write in file");
            throw new RuntimeException(e);
        }
    }

    public void readFromFile(String fileName) {
        File file = new File( BASE_PATH +fileName);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
//            for(int i = 0; scanner.hasNextLine();i++){
//                String row = scanner.nextLine();
//                System.out.println(i); // e.g. to print a line number
//                System.out.println(row);
//            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteFile(String fileName){
        File file = new File(BASE_PATH + fileName);
        if(file.exists()) {
            file.delete();
            System.out.println("File is successfully deleted");
        }
    }
}
