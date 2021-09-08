package P04_Collection.L23_MapInterface;

import java.util.LinkedHashMap;

public class L28_LinkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<Double, Student> linkedHashMap =
                new LinkedHashMap<>(16,0.75f, true);

        Student student1 = new Student("Zaur", "Tregulov", 3);
        Student student2 = new Student("Mariya", "Ivanova", 1);
        Student student3 = new Student("Sergey", "Petrov", 4);
        Student student4 = new Student("Igor", "Sidorov", 2);

        linkedHashMap.put(7.2, student3);
        linkedHashMap.put(7.5, student4);
        linkedHashMap.put(5.8, student1);
        linkedHashMap.put(6.4, student2);

        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(6.4));
        System.out.println(linkedHashMap.get(7.5));

        System.out.println(linkedHashMap);

    }
}
