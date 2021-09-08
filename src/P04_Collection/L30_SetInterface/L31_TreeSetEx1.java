package P04_Collection.L30_SetInterface;

import java.util.TreeSet;

public class L31_TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
        System.out.println(treeSet);

        treeSet.remove(2);

        System.out.println(treeSet);
        System.out.println(treeSet.contains(1));


    }
}
