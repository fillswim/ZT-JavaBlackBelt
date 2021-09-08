package P09_IOandNIO.L103_PathInterfaceANDFilesClass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) {

        Path filePath = Paths.get("text10.txt");

        // Создание файла
//        try {
//            Files.createFile(filePath);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }

        String dialog = "-Hello!\n" +
                "-Hello!\n" +
                "-How are you?\n" +
                "-Fine!";

        // Запись в файл
//        try {
//            Files.write(filePath, dialog.getBytes(StandardCharsets.UTF_8));
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }

        // Чтение из файла
        List<String> list = null;

        try {
            list = Files.readAllLines(filePath);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        for (String str : list) {
            System.out.println(str);
        }


    }
}
