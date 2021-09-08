package P06_Lambda;

public class Test2 {

    public static void main(String[] args) {
        int i = 10;

        def((String string) -> {
            System.out.println(i);
            return string.length() + i;
        });

    }

    static void def(I i) {
        System.out.println(i.abc("privet"));
    }
}

interface I {
    int abc(String string);
}
