package P04_Collection.L12_ArrayList;

import java.util.Arrays;
import java.util.List;

public class L15_ArrayListMethods4 {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("A");
        StringBuilder stringBuilder2 = new StringBuilder("B");
        StringBuilder stringBuilder3 = new StringBuilder("C");
        StringBuilder stringBuilder4 = new StringBuilder("D");

        StringBuilder[] array = {stringBuilder1, stringBuilder2, stringBuilder3, stringBuilder4};

        List<StringBuilder> list = Arrays.asList(array);

        System.out.println(list);

        stringBuilder1.append("A");

        System.out.println(list);

        array[0] = new StringBuilder("F");

        System.out.println(list);



    }
}
