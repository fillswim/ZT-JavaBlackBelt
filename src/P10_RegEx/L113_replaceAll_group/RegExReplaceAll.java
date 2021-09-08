package P10_RegEx.L113_replaceAll_group;

public class RegExReplaceAll {
    public static void main(String[] args) {
        String s1 = "Hello,                my friend! How    is doing Java     learning implements its ?";
        System.out.println(s1);

        // Замена слов
        s1 = s1.replace("Java", "SQL");
        System.out.println(s1);

        // Замена нескольких пробелов на 1
        s1 = s1.replaceAll(" {2,}", " ");
        System.out.println(s1);

        // Замена всех слов, начинающихся на i
//        s1 = s1.replaceAll("\\bi\\w+", "4444");
//        System.out.println(s1);

        // Замена первого слова, начинающихся на i
        s1 = s1.replaceFirst("\\bi\\w+", "4444");
        System.out.println(s1);

    }
}
