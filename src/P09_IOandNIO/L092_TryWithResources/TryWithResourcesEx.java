package P09_IOandNIO.L092_TryWithResources;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesEx {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("text.txt")) {

            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            System.out.println("\nDone!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
