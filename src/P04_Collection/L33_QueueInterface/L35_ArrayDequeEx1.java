package P04_Collection.L33_QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class L35_ArrayDequeEx1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.offerFirst(1);
        deque.offerLast(8);
        System.out.println(deque);
    }
}
