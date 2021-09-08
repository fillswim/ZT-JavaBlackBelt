package P09_IOandNIO.L090_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {
        String text = "Five o’clock in the morning is an awkward time to board a train. \n" +
                "There were still two hours before dawn.\n" +
                "Conscious of an inadequate night’s sleep, \n" +
                "and of a delicate mission successfully accomplished, \n" +
                "M. Poirot curled up in a corner and fell asleep. \n" +
                "When he awoke it was half-past nine, \n" +
                "he sallied forth to the restaurant car in search of hot coffee.";

        String s = "Привет!";
        FileWriter writer = null;

        try {
//            writer = new FileWriter("F:\\Java\\text.txt");
            // Файл создастся в корне проекта
            writer = new FileWriter("text.txt", true);

            // Запись в файл посимвольно (неэффективно)
//            for (int i = 0; i < text.length(); i++) {
//                writer.write(text.charAt(i));
//            }

            // Передача текста целеком (неэффективно)
            writer.write(text);

            // Дописать файл
//            writer.write(s);

            System.out.println("Done!");

        } catch (IOException exception) {
            exception.printStackTrace();
        }finally {

            try {
                writer.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }

    }
}
