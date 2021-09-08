package P10_RegEx.L108_RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCGH";

        // Создается шаблон
//        Pattern pattern1 = Pattern.compile("ABC");
        // Поиск совпадений в s1, все совпадения заносятся в объект matcher
//        Matcher matcher = pattern1.matcher(s1);

        // Поиск любого из символов
//        String s1 = "OPABMNCD";
//        Pattern pattern1 = Pattern.compile("[ABC]");

        // Поиск любого из символов с диапазоном
//        String s1 = "ABDOP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");
//
        // Поиск любого из символов с несколькими диапазонами
//        String s1 = "ABCD ABCE ABC5ABCG6ABCH";
//        Pattern pattern1 = Pattern.compile("ABC[E-G4-7]");

        // Поиск любого из символов, НЕ попадающих в несколько диапазонов
//        String s1 = "ABCD ABCE ABC5ABCG6ABCH";
//        Pattern pattern1 = Pattern.compile("ABC[^E-G4-7]");

        // Поиск по одному символу или по другому
//        String s1 = "ABCD ABCE ABC5ABCG6ABCH";
//        Pattern pattern1 = Pattern.compile("ABC[E|5]");

        // Поиск по одному любому символу
//        String s1 = "ABCD ABCE ABC5ABCG6ABCH";
//        Pattern pattern1 = Pattern.compile("ABC.");

        // Поиск по выражению в начале строки
//        String s1 = "ABCD ABCE ABC5ABCG6ABCH";
//        Pattern pattern1 = Pattern.compile("^ABC");

        // Поиск по выражению в конце строки
//        String s1 = "ABCD ABCE ABC5ABCG6ABCH";
//        Pattern pattern1 = Pattern.compile("BCH$");

        // Поиск любой цифры
//        String s1 = "ABCD ABCE ABC5ABCG6ABCH";
//        Pattern pattern1 = Pattern.compile("[0-9]");

        // Поиск любой цифры (c использованием метасимволов)
//        String s1 = "ABCD ABCE ABC5ABCG6ABCH";
//        Pattern pattern1 = Pattern.compile("\\d");

        // Поиск любой НЕ цифры (c использованием метасимволов)
//        String s1 = "ABCD ABCE ABC5ABCG6ABCH";
//        Pattern pattern1 = Pattern.compile("\\D");

        // Поиск любой буквы или цифры (c использованием метасимволов)
//        String s1 = "ABCD ABCE ABC5ABCG6ABCH";
//        Pattern pattern1 = Pattern.compile("\\w"); [A-Za-z0-9_]

        // Поиск любой НЕ буквы или НЕ цифры (c использованием метасимволов)
//        String s1 = "ABCD ABCE ABC5&ABCG*ABCH";
//        Pattern pattern1 = Pattern.compile("\\W");

        // Поиск любой буквы или цифры c одним или большим количеством повторений
//        String s1 = "ABCD ABCE ABC5&ABCG*ABCH";
//        Pattern pattern1 = Pattern.compile("\\w+");

        // Поиск любой НЕ буквы или НЕ цифры c одним или большим количеством повторений
//        String s1 = "ABCD ABCE ABC5&^%ABCG*ABCH";
//        Pattern pattern1 = Pattern.compile("\\W+");

        // Поиск любой комбинации c определенным количеством повторений (слов и 4 букв)
//        String s1 = "ABCD ABCE ABC 5 &^% ABCG*ABCH";
//        Pattern pattern1 = Pattern.compile("\\w{4}");

        // Поиск по пробельным символам (s+ - один или больше пробелов)
//        String s1 = "ABCD          ABCE   ABC   5 &^% ABCG*ABCH";
//        Pattern pattern1 = Pattern.compile("\\w\\s+\\w");

        // Поиск последовательностей от 2 до 6 подряд НЕ цифр
//        String s1 = "abcd abce abcfa78abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\D{2,6}");

        // Поиск последовательностей АВ несколько раз подряд
//        String s1 = "ABCABABDA";
//        Pattern pattern1 = Pattern.compile("(AB){2,3}");

        // Поиск последовательностей D, два повторения АВ несколько раз подряд
//        String s1 = "ABCABABDA";
//        Pattern pattern1 = Pattern.compile("D(AB){2,}");

        // Поиск последовательностей D, за которым может идти AB, а может и не идти
//        String s1 = "DABCDABABDA";
//        Pattern pattern1 = Pattern.compile("D(AB)?");

        // Поиск есть ли последовательность 'abcd' в начале строки
//        String s1 = "abcd kljkljzczc";
//        Pattern pattern1 = Pattern.compile("\\Aabcd");

        // Поиск есть ли последовательность 'abcd' в конце строки
//        String s1 = "a1bcd kljkljzczcabcd";
//        Pattern pattern1 = Pattern.compile("abcd\\Z");

        // Поиск первого и второго символа на соответствие
        String s1 = "a4bcd4 kljkljzczcabcd";
        Pattern pattern1 = Pattern.compile("[abcd][efg3-8]");

        Matcher matcher = pattern1.matcher(s1);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " \t" + matcher.group());
        }

    }

}
