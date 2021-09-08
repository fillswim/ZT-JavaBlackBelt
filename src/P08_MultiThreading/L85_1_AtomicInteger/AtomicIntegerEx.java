package P08_MultiThreading.L85_1_AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {

//    static int counter = 0;

    static AtomicInteger counter = new AtomicInteger();

    public static void increment() {
        // Увеличивает на единицу и после этого возвращает значение
//        counter.incrementAndGet();

        // Возвращает значение и после этого увеличивается на единцу
//        counter.getAndIncrement();

        // Увеличение на произвольное число и после этого возвращает значение
//        counter.addAndGet(5);

        // Сначала возвращает старое значение и после этого увеличивает на произвольное число
        counter.getAndAdd(5);

        // Уменьшает на единицу и возвращает значение
        counter.decrementAndGet();

        // Возвращает значение и уменьшает на единицу
        counter.getAndDecrement();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImpl());
        Thread thread2 = new Thread(new MyRunnableImpl());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);

    }

}

class MyRunnableImpl implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {
            AtomicIntegerEx.increment();
        }
    }
}
