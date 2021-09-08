package P03_Generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("One", 1);
        System.out.println("Value1 = " + pair.getFirstValue() +
                ", Value2 = " + pair.getSecondValue());

        Pair<Integer, Double> pair2 = new Pair<>(156, 3.14);
        System.out.println("Value1 = " + pair2.getFirstValue() +
                ", Value2 = " + pair2.getSecondValue());
    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}
