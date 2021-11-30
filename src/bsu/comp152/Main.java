package bsu.comp152;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        var fileLoc = Paths.get("War and Peace.txt");
        List<String> allLines = null;
        try {
            allLines = Files.readAllLines(fileLoc);
        }catch (IOException e){
            System.out.println("Error Reading File");
        }
        if (allLines == null)
            System.exit(-1);

        System.out.println(allLines);
    }
}
