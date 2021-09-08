package P10_RegEx.L108_RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {
        String text = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                " email: vivanov@mail.ru, Postcode: AA99 , Phone Number: +123456789;"
                + "Petrova Mariya, Ukraine, Kiyev, Lomonosov street, 33, Flat 18," +
                " email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;"
                + "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
                " email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

        // Найдем все слова (одно или больше повторений символов)
//        Pattern pattern = Pattern.compile("\\w+");

        // Найдем все номера домов "\\b" - границы чисел
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b");

        // Найдем все номера телефонов
//        Pattern pattern = Pattern.compile("\\+\\d{9}");

        // Найдем все адреса электронной почты
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");





        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
