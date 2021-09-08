package P07_Stream.L60_MinMax;

import java.util.ArrayList;
import java.util.List;

public class MinMaxEx {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nick", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elen", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.0);
        Student st5 = new Student("Mary", 'f', 23, 3, 7.4);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        // Поиск самого молодого студента
//        Student minStudent = students
//                .stream()
//                .min((o1, o2) -> o1.getAge() - o2.getAge())
//                .get();
//        System.out.println(minStudent);

//        // Поиск самого взрослого студента
//        Student maxStudent = students
//                .stream()
//                .max((o1, o2) -> o1.getAge() - o2.getAge())
//                .get();
//        System.out.println(maxStudent);

//        // limit() ограничивает количество элементов в стриме (оставляет первые n элементов)
//        // Ограничивает количество выводимых студентов
//        students.stream()
//                .filter(student -> student.getAge() > 20)
//                .limit(3)
//                .forEach(System.out::println);
//        System.out.println();

//        // skip() ограничивает количество элементов в стриме (пропускает первые n элементов)
//        students.stream()
//                .filter(student -> student.getAge() > 20)
//                .skip(1)
//                .forEach(System.out::println);

//        // Возвращает стрим int
//        // Возвращает курсы студентов
//        List<Integer> courses = students.stream()
//                .mapToInt(student -> student.getCourse())
//                .boxed()                                       // Конвертирует значение int в Integer
//                .collect(Collectors.toList());
//        System.out.println(courses);

//        // Сумма курсов всех студентов
//        int sum = students.stream()
//                .mapToInt(student -> student.getCourse())
//                .sum();
//        System.out.println(sum);

//        // Среднее арифметическое всех курсов
//        Double avg = students.stream()
//                .mapToInt(student -> student.getCourse())
//                .average()
//                .getAsDouble();
//        System.out.println(avg);

//        // Минимальный курс
//        int min = students.stream()
//                .mapToInt(student -> student.getCourse())
//                .min()
//                .getAsInt();
//        System.out.println(min);

//        // Максимальный курс
//        int max = students.stream()
//                .mapToInt(student -> student.getCourse())
//                .max()
//                .getAsInt();
//        System.out.println(max);

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(10.1);
        doubleArrayList.add(15.2);
        doubleArrayList.add(8.3);
        doubleArrayList.add(9.4);
        doubleArrayList.add(3.2);

        Double doubleMin = doubleArrayList.stream()
                .mapToDouble(value -> value)
                .min()
                .getAsDouble();
        System.out.println(doubleMin);

    }
}
