package P06_Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Privet");
        arrayList.add("Poka");
        arrayList.add("Ok");
        arrayList.add("Learn java");
        arrayList.add("A imenno lambdas");
        System.out.println(arrayList);

        // Полная запись
        Predicate<String> predicate = s -> s.length() < 5;
        arrayList.removeIf(predicate);

        // Короткая запись
        arrayList.removeIf(s -> s.length() < 5);

        System.out.println(arrayList);

    }
}
