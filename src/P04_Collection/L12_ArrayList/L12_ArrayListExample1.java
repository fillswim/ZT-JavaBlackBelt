package P04_Collection.L12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class L12_ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>(30);
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mary");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(arrayList1);
        System.out.println(arrayList2);
        List<String> list = new ArrayList<>();

        // Они ссылаются на разные объекты
        System.out.println(arrayList1 == arrayList2);

    }
}
