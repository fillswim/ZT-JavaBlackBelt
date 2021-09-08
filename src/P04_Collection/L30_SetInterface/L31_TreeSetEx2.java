package P04_Collection.L30_SetInterface;

import java.util.Objects;
import java.util.TreeSet;

public class L31_TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        Student student1 = new Student("Zaur", 5);
        Student student2 = new Student("Mike", 1);
        Student student3 = new Student("Igor", 2);
        Student student4 = new Student("Mary", 3);
        Student student5 = new Student("Olga", 4);

        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);

        System.out.println(treeSet);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

        Student student6 = new Student("Oleg", 2);
        System.out.println(treeSet.headSet(student6));
        System.out.println(treeSet.tailSet(student6));

        Student student7 = new Student("Ivan", 4);
        System.out.println(treeSet.subSet(student6, student7));

        System.out.println(student3.equals(student6));
        System.out.println(student3.hashCode());
        System.out.println(student6.hashCode());


    }
}


class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
