package P08_MultiThreading.L74_1_DeadLock;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();

        thread1.start();
        thread2.start();
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1: Попытка захватить монитор объекта lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("MyThread1: Монитор объекта lock1 захвачен");

            System.out.println("MyThread1: Попытка захватить монитор объекта lock2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("MyThread1: Мониторы объектов lock1 и lock2 захвачены");
            }
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2: Попытка захватить монитор объекта lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("MyThread2: Монитор объекта lock1 захвачен");

            System.out.println("MyThread2: Попытка захватить монитор объекта lock2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("MyThread2: Мониторы объектов lock1 и lock2 захвачены");
            }
        }
    }
}

