package P04_Collection.L21_Vector;

import java.util.Vector;

public class L21_Vector {
    // Vector - устаревший synchronized класс
    // Похож на ArrayList<>, только многопоточный
    // Лучше использовать ArrayList<>

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("D");

        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());

        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}
