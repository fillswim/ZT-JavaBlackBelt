package P04_Collection.L12_ArrayList;

import java.util.ArrayList;

public class L15_ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>(30);
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mary");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList2.add("Ivan");

        arrayList1.addAll(1, arrayList2);
        System.out.println(arrayList1);

//        arrayList1.clear();
//        System.out.println(arrayList1);

        System.out.println(arrayList1.indexOf("Ivan"));
        System.out.println(arrayList1.lastIndexOf("Ivan"));

        System.out.println(arrayList1.size());

        System.out.println(arrayList1.isEmpty());

        System.out.println(arrayList1.contains("Nick"));
        System.out.println(arrayList1.contains("Mary"));

        System.out.println(arrayList1.toString());



    }

}


