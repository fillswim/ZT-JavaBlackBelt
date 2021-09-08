package P04_Collection.L33_QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class L33LinkedListEx1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Zaur");
        queue.offer("Oleg");
        queue.offer("Ivan");
        queue.offer("Mary");
        queue.offer("Alex");

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue);

    }
}
