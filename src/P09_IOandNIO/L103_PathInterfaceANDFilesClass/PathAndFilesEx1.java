package P09_IOandNIO.L103_PathInterfaceANDFilesClass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx1 {
    public static void main(String[] args) {

        Path filePath = Paths.get("text15.txt");
        Path folderPath = Paths.get("F:\\Java\\456");

        // Исходные значения
        System.out.println("file:  \t\t\t\t\t\t" + "text15.txt");
        System.out.println("folder:\t\t\t\t\t\t" + "F:\\Java\\456");
        System.out.println();

        // Получить имя файла / папки
        System.out.println("filePath.getFileName():\t\t" + filePath.getFileName());
        System.out.println("folderPath.getFileName():\t" + folderPath.getFileName());
        System.out.println();

        // Нахождение родителя
        System.out.println("filePath.getParent():\t\t" + filePath.getParent());
        System.out.println("folderPath.getParent():\t\t" + folderPath.getParent());
        System.out.println();

        // Нахождение корня
        System.out.println("filePath.getRoot():\t\t\t" + filePath.getRoot());
        System.out.println("folderPath.getRoot():\t\t" + folderPath.getRoot());
        System.out.println();

        // Абсолютный ли путь?
        System.out.println("filePath.isAbsolute():\t\t" + filePath.isAbsolute());
        System.out.println("folderPath.isAbsolute():\t" + folderPath.isAbsolute());
        System.out.println();

        // Посмотреть абсолютный путь
        System.out.println("filePath.toAbsolutePath():\t" + filePath.toAbsolutePath());
        System.out.println("folderPath.toAbsolutePath():" + folderPath.toAbsolutePath());
        System.out.println();

        // Посмотреть абсолютный путь
        System.out.println("filePath.toAbsolutePath().getParent():\t\t" + filePath.toAbsolutePath().getParent());
        System.out.println("filePath.toAbsolutePath().getRoot():\t\t" + filePath.toAbsolutePath().getRoot());
        System.out.println();

        // Объединение путей
        System.out.println("folderPath.resolve(filePath): \t\t\t\t" + folderPath.resolve(filePath));
        System.out.println();

        // Вывод относительного пути
        Path folderPathOther = Paths.get("F:\\Java\\456\\789\\789");
        System.out.println("folderPath.relativize(folderPathOther):\t\t" + folderPath.relativize(folderPathOther));
        System.out.println();

        // Существует ли фпйл или папка?
        System.out.println("Files.exists(filePath):\t\t\t\t\t\t" + Files.exists(filePath));
        System.out.println("Files.exists(folderPath):\t\t\t\t\t" + Files.exists(folderPath));
        System.out.println();

        // Создание файла или папки, если они не существуют
        if (!Files.exists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }

        if (!Files.exists(folderPath)) {
            try {
                Files.createDirectory(folderPath);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }

        // Проверка прав на чтение
        System.out.println("Files.isReadable(filePath):\t\t\t\t\t" + Files.isReadable(filePath));
        System.out.println("Files.isReadable(folderPath):\t\t\t\t" + Files.isReadable(folderPath));
        System.out.println();

        // Проверка прав на запись
        System.out.println("Files.isWritable(filePath):\t\t\t\t\t" + Files.isWritable(filePath));
        System.out.println("Files.isWritable(folderPath):\t\t\t\t" + Files.isWritable(folderPath));
        System.out.println();

        // Проверка прав на выполнение
        System.out.println("Files.isExecutable(filePath):\t\t\t\t" + Files.isExecutable(filePath));
        System.out.println("Files.isExecutable(folderPath):\t\t\t\t" + Files.isExecutable(folderPath));
        System.out.println();

        // Ссылаются ли пути на один и тот же файл
        Path filePathTheSame = Paths.get("F:\\Java\\Java Projects\\JavaBlackBelt\\text15.txt");
        try {
            System.out.println("Files.isSameFile(filePath, filePathTheSame): " + Files.isSameFile(filePath, filePathTheSame));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println();

        // Вывод размер файла на экран
        try {
            System.out.println("Files.size(filePath):\t\t\t\t\t\t" + Files.size(filePath));
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        // Информация об аттрибуте
        try {
            System.out.println("Files.getAttribute(filePath,\"creationTime\"):" +
                    Files.getAttribute(filePath, "creationTime"));
            System.out.println("Files.getAttribute(filePath,\"size\"):\t\t" +
                    Files.getAttribute(filePath, "size"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println();

        // Получение значений всех аттрибутов
        Map<String, Object> map = null;
        try {
            map = Files.readAttributes(filePath, "*");
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
