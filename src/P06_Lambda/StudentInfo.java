package P06_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(ArrayList<Student> arrayList, Predicate<Student> predicate) {
        for (Student student : arrayList) {
            if (predicate.test(student)) {
                System.out.println(student);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();



//        System.out.println("-----------------------------");
//        //Полная запись лямбда выражения
//        info.testStudents(students, (Student student) -> {
//            return student.avgGrade > 8;
//        });

        // Выноска лямбда выражения с использованием Predicate
//        Predicate<Student> pr1 = student -> student.avgGrade > 7.5;
//        Predicate<Student> pr2 = student -> student.sex == 'm';

//        info.testStudents(students, pr1.or(pr2));
//        info.testStudents(students, pr1.negate());
//        // Короткая запись лямбда выражения
//        info.testStudents(students, student -> student.avgGrade > 8);
//
//        System.out.println("-----------------------------");
//        info.testStudents(students, (Student student) -> {
//            return student.age < 30;
//        });
//
//        System.out.println("-----------------------------");
//        info.testStudents(students, (Student student) -> {
//            return student.age > 20 && student.avgGrade < 9.3 && student.sex == 'f';
//        });

        double resGrade = avgSmth(students, student -> student.avgGrade);
        System.out.println(resGrade);

        double resCourse = avgSmth(students, student -> (double) student.course);
        System.out.println(resCourse);

        double resAge = avgSmth(students, student -> (double) student.age);
        System.out.println(resAge);

    }

    private static double avgSmth(List<Student> list, Function<Student, Double> function) {
        double result = 0;

        for (Student student : list) {
            result += function.apply(student);
        }

        result = result / list.size();
        return result;
    }
}


