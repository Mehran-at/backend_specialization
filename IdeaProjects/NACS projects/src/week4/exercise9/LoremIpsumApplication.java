package week4.exercise9;

import java.util.List;

public class LoremIpsumApplication {

    public static void main(String[] args) {
        week4.exercise9.FileReader reader = new week4.exercise9.FileReader();
        readDocument(reader);
    }

    private static void readDocument(FileReader reader) {
        System.out.println("---- DOCUMENT");
        List<String> lines = reader.getLines("week4/exercise9/lorem-ipsum.txt");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
