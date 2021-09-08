package P08_MultiThreading.L75_1_ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat1 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        new Employee("Zaur", lock);
        new Employee("Oleg", lock);
        new Employee("Mike", lock);
        new Employee("Nick", lock);
        new Employee("Pitt", lock);

    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждёт...");
            lock.lock();
            System.out.println(name + " пользуется банкоматом");
            Thread.sleep(2000);
            System.out.println(name + " завершил свои дела");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

