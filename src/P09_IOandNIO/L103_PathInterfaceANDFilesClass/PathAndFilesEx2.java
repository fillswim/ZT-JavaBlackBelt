package P09_IOandNIO.L103_PathInterfaceANDFilesClass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) {

        // Копирование файла в папку
        Path folderPath = Paths.get("F:\\Java\\A");
        Path filePath = Paths.get("text15.txt");

        try {
            // Копирование с тем же именем
            Files.copy(filePath, folderPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
            // Копирование с другим именем
            Files.copy(filePath, folderPath.resolve("textNew.txt"), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("Done!");


        // Перемещение файла
        Path filePathFrom = Paths.get("F:\\Java\\A\\textNew.txt");
        Path filePathTo = Paths.get("F:\\Java\\B\\textNew.txt");

        try {
            Files.move(filePathFrom, filePathTo, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("Done!");


        // Переименование файлов
        Path filePathOld = Paths.get("F:\\Java\\B\\textNew.txt");
        Path filePathNew = Paths.get("F:\\Java\\B\\textNew2.txt");

        try {
            Files.move(filePathOld, filePathNew, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException exception) {
            exception.printStackTrace();
        }


        // Удаление файла
        try {
            Files.delete(Paths.get("F:\\Java\\B\\textNew2.txt"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
