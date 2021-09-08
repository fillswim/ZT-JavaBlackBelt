package P09_IOandNIO.L093_BuffereWriterANDBufferedReader;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("text2.txt"))) {

            while (reader.ready()) {
                String line = reader.readLine();
                writer.write(line + "\n");
            }

            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
