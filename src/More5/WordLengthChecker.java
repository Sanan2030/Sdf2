package More5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordLengthChecker {
    public static void main(String[] args) {
        String fileName = "sanan.txt";
        try {
            checkWordLength(fileName);
            System.out.println("Done");
        } catch (Exception e) {
            System.err.println("Failure");
        }
    }
    private static void checkWordLength(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.length() > 5) {
                throw new RuntimeException("Soz uzunlugu 5 den uzun olmamalidi");
            }
        }
        scanner.close();
    }
}