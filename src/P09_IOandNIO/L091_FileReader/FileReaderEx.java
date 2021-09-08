package P09_IOandNIO.L091_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {

        FileReader reader = null;

        try {
            reader = new FileReader("text.txt");

            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            System.out.println("\nDone!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }finally {

            try {
                reader.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
