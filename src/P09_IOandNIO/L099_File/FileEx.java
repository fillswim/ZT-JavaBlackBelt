package P09_IOandNIO.L099_File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) {
        File file = new File("text2.txt");
        File folder = new File("F:\\Java\\123");

        // Исходные значения
        System.out.println("file:  \t\t\t\t\t\t" + "text2.txt");
        System.out.println("folder:\t\t\t\t\t\t" + "F:\\Java\\123");
        System.out.println();

        // Получить абсолютный путь
        System.out.println("file.getAbsolutePath():  \t" + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath():\t" + folder.getAbsolutePath());
        System.out.println();

        // Абсолютен ли изначальный путь?
        System.out.println("file.isAbsolute():  \t\t" + file.isAbsolute());
        System.out.println("folder.isAbsolute():\t\t" + folder.isAbsolute());
        System.out.println();

        // Директория ли папка или файл?
        System.out.println("file.isDirectory():  \t\t" + file.isDirectory());
        System.out.println("folder.isDirectory():\t\t" + folder.isDirectory());
        System.out.println();

        // Существует ли файл / директория?
        System.out.println("file.exists():  \t\t\t" + file.exists());
        System.out.println("folder.exists():\t\t\t" + folder.exists());
        System.out.println();

        // Создание файла / директории
        File fileNew = new File("F:\\Java\\fileNew.txt");
        File folderNew = new File("F:\\Java\\folderNew");

        try {
            System.out.println("fileNew.createNewFile():\t" + fileNew.createNewFile());
            System.out.println("folder.mkdir():\t\t\t\t" +folder.mkdir());
            System.out.println();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        // Узнать размер файла
        System.out.println("file.length():  \t\t\t" + file.length());
        System.out.println("folder.length():\t\t\t" + folder.length());
        System.out.println();

        // Удаление файла / папки
        System.out.println("fileNew.delete():\t\t\t" + fileNew.delete());
        // Удаляет папку, только если она пуста
        System.out.println("folderNew.delete():\t\t\t" + folderNew.delete());
        System.out.println();

        // Вывод содержимого папки
        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println();

        // Скрыта ли папка или файл?
        System.out.println("file.isHidden():  \t\t\t" + file.isHidden());
        System.out.println("folder.isHidden():\t\t\t" + folder.isHidden());
        System.out.println();

        // Есть ли доступ на чтение файла?
        System.out.println("file.canRead():  \t\t\t" + file.canRead());
        System.out.println("folder.canRead():\t\t\t" + folder.canRead());
        System.out.println();

        // Есть ли доступ на запись?
        System.out.println("file.canWrite():  \t\t\t" + file.canWrite());
        System.out.println("folder.canWrite():\t\t\t" + folder.canWrite());
        System.out.println();

        // Есть ли доступ на выполнение?
        System.out.println("file.canExecute():  \t\t" + file.canExecute());
        System.out.println("folder.canExecute():\t\t" + folder.canExecute());
        System.out.println();

    }
}
