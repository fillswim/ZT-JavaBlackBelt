package P04_Collection.L16_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class L16_IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mary");
        arrayList1.add("Nick");
        arrayList1.add("Helen");

        ArrayList<String> arrayList2 = (ArrayList<String>) List.copyOf(arrayList1);

        System.out.println(arrayList2);

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        System.out.println(arrayList1);

    }
}
