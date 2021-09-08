package P08_MultiThreading.L66_1_Threads;

public class ImplementRunnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread3());
        Thread thread2 = new Thread(new MyThread4());
        Thread thread3 = new Thread(() ->{
            for (int i = 0; i < 1000; i++) {
                System.out.println(9999);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}

