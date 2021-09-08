package P04_Collection.L23_MapInterface;

import java.util.HashMap;
import java.util.Map;

public class L23_HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student student1 = new Student("Zaur", "Tregulov", 3);
        Student student2 = new Student("Mary", "Ivanova", 1);
        Student student3 = new Student("Serge", "Petrov", 4);

        map.put(student1, 7.5);
        map.put(student2, 8.7);
        map.put(student3, 9.2);

        System.out.println(map);

        System.out.println(map.containsKey(student1));
        System.out.println(student1.hashCode());


//        Student3 student34 = new Student3("Zaur", "Tregulov", 3);
//        boolean result = map.containsKey(student34);
//        System.out.println("result = " + result);
//
//        for (Map.Entry<Student3, Double> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//
//        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);

    }
}

final class Student implements Comparable<Student>{
    final String name;
    final String surname;
    final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student3 student3 = (Student3) o;
//        return course == student3.course &&
//                Objects.equals(name, student3.name) &&
//                Objects.equals(surname, student3.surname);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, course);
//    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

}
