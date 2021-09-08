package P04_Collection.L33_QueueInterface;

import java.util.Objects;
import java.util.PriorityQueue;

public class L34_PriorityQueueEx2 {
    public static void main(String[] args) {
        Student student1 = new Student("Zaur", 5);
        Student student2 = new Student("Mike", 1);
        Student student3 = new Student("Igor", 2);
        Student student4 = new Student("Mary", 3);
        Student student5 = new Student("Olga", 4);

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(student1);
        priorityQueue.add(student2);
        priorityQueue.add(student3);
        priorityQueue.add(student4);
        priorityQueue.add(student5);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

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

