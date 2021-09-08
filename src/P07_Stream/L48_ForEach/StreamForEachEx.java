package P07_Stream.L48_ForEach;

import java.util.Arrays;

public class StreamForEachEx {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};

//        Arrays.stream(array).forEach(value -> System.out.println(value));
//        Arrays.stream(array).forEach(System.out::println);

        Arrays.stream(array)
                .forEach(Utils::myMethod);
    }
}

class Utils{
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Element = " + a);
    }
}

