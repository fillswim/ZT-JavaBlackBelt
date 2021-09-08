package P10_RegEx.L111_StringMatches;

import java.util.Arrays;

public class RegExStringMatches {
    public static void main(String[] args) {
        String text = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                " email: vivanov@mail.ru, Postcode: AA99 , Phone Number: +123456789;"
                + "Petrova Mariya, Ukraine, Kiyev, Lomonosov street, 33, Flat 18," +
                " email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;"
                + "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
                " email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

        String email = "chuck@gmail.com";

        // Соответствует ли email регулярному выражению?
        boolean result = email.matches("\\w+@\\w+.(ru|com)");
        System.out.println(result);

        // Разделение текста по запятым
        String[] strings = text.split(" ");
        System.out.println(Arrays.toString(strings));

    }
}
