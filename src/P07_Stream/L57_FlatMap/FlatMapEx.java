package P07_Stream.L57_FlatMap;

import java.util.ArrayList;
import java.util.List;

public class FlatMapEx {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nick", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elen", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.0);
        Student st5 = new Student("Mary", 'f', 23, 3, 7.4);

        Faculty faculty1 = new Faculty("Economics");
        Faculty faculty2 = new Faculty("Applied mathematics");

        faculty1.addStudentToFaculty(st1);
        faculty1.addStudentToFaculty(st2);
        faculty1.addStudentToFaculty(st3);

        faculty2.addStudentToFaculty(st4);
        faculty2.addStudentToFaculty(st5);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty1);
        faculties.add(faculty2);

        // Вывод всех студентов из всех факультетов flatmap
        faculties.stream()
                .flatMap(faculty -> faculty.getStudents().stream())
                .forEach(student -> System.out.println(student.getName()));

    }
}

class Faculty {
    String name;
    List<Student> students;

    public Faculty(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudentToFaculty(Student student) {
        this.students.add(student);
    }
}
