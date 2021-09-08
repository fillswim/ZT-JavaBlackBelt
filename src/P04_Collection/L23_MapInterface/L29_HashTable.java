package P04_Collection.L23_MapInterface;

import java.util.Hashtable;

public class L29_HashTable {
    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable<>();

        Student student1 = new Student("Zaur", "Tregulov", 3);
        Student student2 = new Student("Mariya", "Ivanova", 1);
        Student student3 = new Student("Sergey", "Petrov", 4);
        Student student4 = new Student("Igor", "Sidorov", 2);

        ht.put(7.8, student1);
        ht.put(9.3, student2);
        ht.put(5.8, student3);
        ht.put(6.0, student4);
//        ht.put(6.5, null);

        System.out.println(ht);

    }
}
