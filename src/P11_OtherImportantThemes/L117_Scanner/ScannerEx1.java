package P11_OtherImportantThemes.L117_Scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {

        // Ввод числа из консоли
//        System.out.println("Type a number: ");
//
//        int number = 0;
//        try (Scanner scanner = new Scanner(System.in)) {
//            number = scanner.nextInt();
//        } catch (Exception exception) {
//            exception.printStackTrace();
//        }
//        System.out.println("You have typed: " + number);


        // Ввод двух чисел из консоли
//        System.out.println("Type who numbers:");
//
//        int a = 0;
//        int b = 0;
//
//        try (Scanner scanner = new Scanner(System.in)) {
//            a = scanner.nextInt();
//            b = scanner.nextInt();
//        } catch (Exception exception) {
//            exception.printStackTrace();
//        }
//
//        System.out.println("Division: " + a / b);
//        System.out.println("Ostatok: " + a % b);


        // Ввод нескольких слов
//        System.out.println("Type a couple words:");
//
//        String s1 = null;
//        String s2 = null;
//
//        try (Scanner scanner = new Scanner(System.in)) {
//            s1 = scanner.nextLine();
//            s2 = scanner.nextLine();
//        } catch (Exception exception) {
//            exception.printStackTrace();
//        }
//
//        System.out.println("You have written: " + s1 +s2);


        // Ввод дробного числа
//        System.out.println("Type double");
//        // В качестве разделителя используется не точка, а запятая
//        double d = 0;
//
//        try (Scanner scanner = new Scanner(System.in)) {
//            d = scanner.nextDouble();
//        } catch (Exception exception) {
//            exception.printStackTrace();
//        }
//
//        System.out.println("Your double is: " + d);


        // Вывод по одной строке
        try (Scanner scanner = new Scanner("Hello my friend!\n" +
                "How are you\n" +
                "Good buy!")) {

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
