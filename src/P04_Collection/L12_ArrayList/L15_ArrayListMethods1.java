package P04_Collection.L12_ArrayList;

import java.util.ArrayList;

public class L15_ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mary");
        arrayList1.add(1, "Mike");

        System.out.println(arrayList1);

        arrayList1.set(1, "Masha");
        System.out.println(arrayList1);

        arrayList1.remove(0);
        System.out.println(arrayList1);
    }
}
