package P10_RegEx.L113_replaceAll_group;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExGroup {
    public static void main(String[] args) {
        String cards =
                "12345678912345672305987;" +
                "78945612312345670325321;" +
                "45678912312345670612456;" +
                "12378945612345671806789";

        // Банковская карта
        // 03/25 1234 4567 7891 1234 (312)

        Pattern pattern = Pattern.compile("" +
                "(\\d{4})" +
                "(\\d{4})" +
                "(\\d{4})" +
                "(\\d{4})" +
                "(\\d{2})" + // месяц
                "(\\d{2})" + // год
                "(\\d{3})"); // CVV

        Matcher matcher = pattern.matcher(cards);

//        String cardsNew = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
//        System.out.println(cardsNew);

        while (matcher.find()) {
            // Просмотр только CVV кодов
            System.out.println(matcher.group(7));
        }

    }
}
