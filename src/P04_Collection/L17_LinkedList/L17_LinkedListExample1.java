package P04_Collection.L17_LinkedList;

import java.util.LinkedList;

public class L17_LinkedListExample1 {
    public static void main(String[] args) {
        Student2 student1 = new Student2("Ivan", 3);
        Student2 student2 = new Student2("Nick", 2);
        Student2 student3 = new Student2("Helen", 1);
        Student2 student4 = new Student2("Peter", 4);
        Student2 student5 = new Student2("Mary", 3);

        LinkedList<Student2> student2LinkedList = new LinkedList<>();

        student2LinkedList.add(student1);
        student2LinkedList.add(student2);
        student2LinkedList.add(student3);
        student2LinkedList.add(student4);
        student2LinkedList.add(student5);

        System.out.println("linkedList = " + student2LinkedList);
        System.out.println(student2LinkedList.get(2));

        Student2 student6 = new Student2("Zaur", 3);
        Student2 student7 = new Student2("Igor", 4);

        student2LinkedList.add(student6);
        System.out.println("linkedList = " + student2LinkedList);

        student2LinkedList.add(1, student7);
        System.out.println("linkedList = " + student2LinkedList);

        student2LinkedList.remove(3);
        System.out.println("linkedList = " + student2LinkedList);


    }
}

class Student2{
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}