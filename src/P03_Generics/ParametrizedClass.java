package P03_Generics;

public class ParametrizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Hello!");
//        System.out.println(info1);
//        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(123);
        System.out.println(info2);
        int i = info2.getValue();
    }

//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//
//    public void abc(Info<Integer> info) {
//        int i = info.getValue();
//    }
//
//    // Потому что в JVM оба метода имеют одинаковую сигнатуру public void abc(Info info)

}

// T - Type place holder
class Info<T extends Number> {
    private T value;

    public Info(T t) {
        this.value = t;
    }

    public String toString() {
        return "{" + value + "}";
    }

    public T getValue() {
        return value;
    }
}

interface I1 {

}

interface I2 {

}

//class Parent{
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//}

//class Child extends Parent {
//    public void abc(Info<Integer> info) {
//        int i = info.getValue();
//    }
//}


