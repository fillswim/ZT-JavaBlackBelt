package P07_Stream.L48_Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StreamFilterEx {
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

//        // Фильтрация по возрасту и оценке
//        List<Student> students2 = students.stream()
//                .filter(student -> student.getAge() > 22 && student.getAvgGrade() < 7.2)
//                .collect(Collectors.toList());

//        // Фильтрация по возрасту и оценке
//        Stream<Student> studentStream = Stream.of(st1, st2, st3, st4, st5);
//        List<Student> studentList2 =  studentStream
//                .filter(student -> student.getAge() > 22 && student.getAvgGrade() < 7.2)
//                .collect(Collectors.toList());

//        // Сортировка по имени
//        List<Student> students2 = students.stream()
//                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
//                .collect(Collectors.toList());

//        // Имена сделать заглавными
//        // Выбрать только девушек
//        // Отсортировать по возрасту
//        // Вывести на экран
//        students.stream()
//                .map(student -> {
//                    student.setName(student.getName().toUpperCase(Locale.ROOT));
//                    return student;
//                })
//                .filter(student -> student.getSex() == 'f')
//                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
//                .forEach(student -> System.out.println(student));

        // Имена сделать заглавными
        // Выбрать только девушек
        // Отсортировать по возрасту
        // Вывести на экран
        // метод findFirst() возвращает первый элемент потока
        // присваиваем его переменной
        Student firstStudent = students.stream()
                .map(student -> {
                    student.setName(student.getName().toUpperCase(Locale.ROOT));
                    return student;
                })
                .filter(student -> student.getSex() == 'f')
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .findFirst()
                .get();

        System.out.println(firstStudent);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "\t" + "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}' + "\n";
    }
}
