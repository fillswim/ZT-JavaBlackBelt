package P07_Stream.L51_Sorted;

import java.util.Arrays;

public class StreamSortedEx {
    public static void main(String[] args) {
        int[] array1 = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};

//        int[] array2 = Arrays.stream(array)
//                .sorted().toArray();
//
//        System.out.println(Arrays.toString(array2));

        int result = Arrays.stream(array1)
                .filter(value -> value % 2 == 1)                            // фильтрация нечетных
                .map(operand -> {                                           // деление нацело на 3
                    if (operand % 3 == 0) {
                        operand /= 3;
                    }
                    return operand;
                })
                .reduce((accumulator, element) -> accumulator + element)    // суммирование элементов
                .getAsInt();

        System.out.println(result);

    }
}
