package P08_MultiThreading.L72_2_SynchronizedBlock;

public class SynchronizedBlock2 {

    private static int counter = 0;

    // Использование синхронизации по методу
    static synchronized void increment() {
        counter++;
    }

    // Или с использование блока синхронизации по классу
//    static void increment() {
//        synchronized (SynchronizedBlock2.class) {
//            counter++;
//        }
//    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnableImpl runnable = new MyRunnableImpl();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

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
        for (int i = 0; i < 100000; i++) {
            SynchronizedBlock2.increment();
        }
    }
}

