package P07_Stream.L47_Map;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMapEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Privet");
        list.add("Kak dela?");
        list.add("Ok");
        list.add("Poka");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }

        // 6 9 2 4
        List<Integer> list2 = list.stream()
                .map(element -> element.length())
                .collect(Collectors.toList());

        System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};

        array = Arrays.stream(array)
                .map(operand -> {
                    if (operand % 3 == 0) {
                        operand = operand / 3;
                    }
                    return operand;
                })
                .toArray();

//        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Privet");
        set.add("Kak dela?");
        set.add("Ok");
        set.add("Poka");

        System.out.println(set);

        Set<Integer> set2 = set.stream()
                .map(e -> e.length())
                .collect(Collectors.toSet());

        System.out.println(set2);

        List<Integer> list3 = set.stream()
                .map(e -> e.length())
                .collect(Collectors.toList());

        System.out.println(list3);
    }
}
