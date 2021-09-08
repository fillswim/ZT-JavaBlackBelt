package P04_Collection.L30_SetInterface;

import java.util.HashSet;

public class L30_SetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(8);
        System.out.println("Set 1 = " + hashSet1);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);
        System.out.println("Set 2 = " + hashSet2);

        // Объединение
        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println(union);

        // Пересечение
        HashSet<Integer> intersect = new HashSet<>(hashSet1);
        intersect.retainAll(hashSet2);
        System.out.println(intersect);

        // Исключение общих
        HashSet<Integer> subtract = new HashSet<>(hashSet1);
        subtract.removeAll(hashSet2);
        System.out.println(subtract);


    }
}
