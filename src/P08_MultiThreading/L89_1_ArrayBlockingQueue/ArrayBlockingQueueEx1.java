package P08_MultiThreading.L89_1_ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

// Потокобезопасная очередь с ограниченным размером
public class ArrayBlockingQueueEx1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.offer(5);
        System.out.println(queue);
    }
}
