package P08_MultiThreading.L68_1_SleepAndJoin;

public class ThreadJoin1 extends Thread {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable1());
        ThreadJoin1 thread2 = new ThreadJoin1();

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The end!");
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
