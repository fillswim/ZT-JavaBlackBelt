package P03_Generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

//        List<? extends String> list = new ArrayList<String>();
//        list.add("hello");

        List<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(123));

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(6.28);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("Hello!");
        list2.add("Hello!!");
        showListInfo(list2);


    }

    static <T> void showListInfo(List<T> list) {
        System.out.println("element: " + list);
    }
}


