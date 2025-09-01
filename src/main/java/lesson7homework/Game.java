package lesson7homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {

    private static final String BASE_PATH = "D:\\QA\\Java\\LegionIT-1\\src\\main\\java\\lesson7homework\\";

    public static void main(String[] args) {
        Game game = new Game();
        game.writeNumOfPlayersPerTeam(GameType.SOCCER);
        game.writeNumOfPlayersPerTeam(GameType.HOCKEY);
        game.writeNumOfPlayersPerTeam(GameType.RUGBY);
    }

    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static void writeNumOfPlayersPerTeam(GameType game) {
        String fileName = "";
        int number = 0;
        switch (game) {
            case SOCCER:
                fileName = "Soccer.txt";
                number = 11;
                break;
            case HOCKEY:
                fileName= "Hockey.txt";
                number = 6;
                break;
            case RUGBY:
                fileName = "Rugby.txt";
                number = 15;
                break;
        }

        File file = new File(BASE_PATH + fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter fileWriter = new FileWriter(BASE_PATH + fileName);
            fileWriter.write("The number is: " + number);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error, cannot write in file");
            throw new RuntimeException(e);
        }
    }
}
