package P09_IOandNIO.L098_RandomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {

        try (RandomAccessFile file = new RandomAccessFile("text3.txt", "rw")) {

            int a = file.read();
            System.out.println((char) a);

            String s1 = file.readLine();
            System.out.println(s1);

            // Перемещение курсора и чтение остальной части строки
            file.seek(90);
            String s2 = file.readLine();
            System.out.println(s2);

            long position = file.getFilePointer();
            System.out.println(position);

            // Переписывание текста поверх старого
//            file.seek(0);
//            file.writeBytes("Hello");

            // Дописывание в конец файла
            file.seek(file.length() - 1);
            file.writeBytes("\nThe End!");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
