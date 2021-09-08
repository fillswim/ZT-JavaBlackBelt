package P11_OtherImportantThemes.L118_Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ScannerEx2 {
    public static void main(String[] args) {

        // Вывод уникальных слов в файле в алфавитном порядке
        Set<String> set = new TreeSet<>();

        try (Scanner scanner = new Scanner(new FileReader(new File("F:\\Java\\Text.txt")))) {
            // Задаем разделитель, не соответствующий букве, цифре или нижнему подчеркиванию
            scanner.useDelimiter("\\W");

            while (scanner.hasNext()) {
                String word = scanner.next();
                set.add(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (String word : set) {
            System.out.println(word);
        }
    }
}
