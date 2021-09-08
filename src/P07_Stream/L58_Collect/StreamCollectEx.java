package P07_Stream.L58_Collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectEx {
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

//        // Collectors.groupingBy группирует результат по спискам и заносит их в Map<Integer, List<Student>>
//        // Сделаем имена заглавными буквами
//        // Отсортируем студентов по курсам
//        Map<Integer, List<Student>> map = students.stream()
//                .map(student -> {
//                    student.setName(student.getName().toUpperCase(Locale.ROOT));
//                    return student;
//                })
//                .collect(Collectors.groupingBy(student -> student.getCourse()));
//
//        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        // Collectors.partitioningBy разбивает результат по спискам и заносит их в Map<Boolean, List<Student>>
        // Разобьем студентов на две группы: те, которые получают высокую оценку и те, которые не получают
        Map<Boolean, List<Student>> map = students.stream()
                .collect(Collectors.partitioningBy(o -> o.getAvgGrade() > 7));

        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "" + entry.getValue());
        }

    }
}
