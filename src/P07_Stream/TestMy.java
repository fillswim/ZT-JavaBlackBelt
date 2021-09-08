package P07_Stream;

import java.util.Arrays;

public class TestMy {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 6, 55, 32, 56, 78};
        System.out.println(Arrays.toString(array1));
        // {45, 12, 32, 45, 46, 98, 12, 64, 91, 35, 55}

        // только четные
        int[] array2 = Arrays.stream(array1)
                .filter(value -> value % 2 == 0)
                .toArray();

        System.out.println(Arrays.toString(array2));

        // Прибавить к каждому 1
        int[] array3 = Arrays.stream(array1)
                .map(operand -> operand + 1)
                .toArray();

        System.out.println(Arrays.toString(array3));

        // Вернуть деленные на 3 только те, которые делятся нацело
        int[] array4 = Arrays.stream(array1)
                .map(operand -> {
                    if (operand % 3 == 0) {
                        operand /= 3;
                        return operand;
                    } else {
                        return 0;
                    }
                })
                .toArray();

        System.out.println(Arrays.toString(array4));

        // Сложение всех
        int result1 = Arrays.stream(array1)
                .reduce((accumulator, element) -> accumulator + element)
                .getAsInt();

        System.out.println(result1);

        // Умножение всех
        int result2 = Arrays.stream(array1)
                .reduce((accumulator, element) -> accumulator * element)
                .getAsInt();

        System.out.println(result2);



    }
}
