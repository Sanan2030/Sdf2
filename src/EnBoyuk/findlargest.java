package EnBoyuk;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class findlargest {
    public static void main(String[] args) {
        String fileName = "Sanan.txt";
        String biggest = find(fileName);
        System.out.println("Filedaki En boyuk soz: " + biggest);
    }

    private static String find(String fileName) {
        File file = new File(fileName);
        String biggest = "";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > biggest.length()) {
                     biggest= word;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File tapilmadi: " + e.getMessage());
        }
        return biggest;
    }
}
