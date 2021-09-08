package P07_Stream.L50_Reduce;

import java.util.ArrayList;
import java.util.List;

public class StreamReduceEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result1 = list.stream()
                .reduce((accumulator, element) -> accumulator * element)
                .get();
        // 5, 8, 2, 4, 3
        // accumulator = 5 40 80 320 960
        // element =     8  2  4   3
        System.out.println(result1);

        // identity - начальное значение
        int result2 = list.stream()
                .reduce(1,(accumulator, element) -> accumulator * element);
        // 5, 8, 2, 4, 3
        // accumulator = 1 5 40 80 320 960
        // element =     5 8  2  4   3
        System.out.println(result2);

        List<String> list3 = new ArrayList<>();
        list3.add("Privet");
        list3.add("Kak dela?");
        list3.add("Ok");
        list3.add("Poka");

        String result3 = list3.stream().reduce((a, e) -> a + " " + e).get();
        System.out.println(result3);



//        List<Integer> list100 = new ArrayList<>();
//        Optional<Integer> optional = list100.stream()
//                .reduce((accumulator, element) -> accumulator * element);
//
//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        } else {
//            System.out.println("Not present");
//        }
    }
}
