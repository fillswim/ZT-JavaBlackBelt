package P04_Collection.L23_MapInterface;

import java.util.HashMap;
import java.util.Map;

public class L23_Map1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur");
        map1.put(3568, "Ivan");
        map1.put(6578, "Maria");
        map1.put(1587, "Nick");
        map1.put(null, "Serge");
        map1.put(8521, null);
        map1.putIfAbsent(1000, "Oleg");

        System.out.println(map1);

//        System.out.println(map1.containsValue("Oleg"));

//        System.out.println(map1);
//        System.out.println(map1.get(1000));

        System.out.println(map1.keySet());
        System.out.println(map1.values());


    }
}
