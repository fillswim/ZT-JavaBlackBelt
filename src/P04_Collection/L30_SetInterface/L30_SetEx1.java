package P04_Collection.L30_SetInterface;

import java.util.HashSet;
import java.util.Set;

public class L30_SetEx1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Mary");
        set.add("Igor");
//        set.add(null);

        set.remove("Zaur");
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Mike"));

//        System.out.println(set);

        for (String s : set) {
            System.out.println(s);
        }
    }

}
