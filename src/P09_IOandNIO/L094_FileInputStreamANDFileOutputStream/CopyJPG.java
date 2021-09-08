package P09_IOandNIO.L094_FileInputStreamANDFileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJPG {
    public static void main(String[] args) {

        try (FileInputStream inputStream = new FileInputStream("F:\\Java\\Book_Cover.jpg");
             FileOutputStream outputStream = new FileOutputStream("Book_Cover.jpg")) {

            int i;

            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }

            System.out.println("Done");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }
}
