package P09_IOandNIO.L096_Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationRead {
    public static void main(String[] args) {

        List<String> employees;

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees1.bin"))) {

            employees = (ArrayList) inputStream.readObject();
            System.out.println(employees);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
