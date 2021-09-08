package P08_MultiThreading.L82_1_Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        Person person1 = new Person("Zaur", callBox);
        Person person2 = new Person("Oleg", callBox);
        Person person3 = new Person("Mary", callBox);
        Person person4 = new Person("Ivan", callBox);
        Person person5 = new Person("Mike", callBox);

        new Thread(person1).start();
        new Thread(person2).start();
        new Thread(person3).start();
        new Thread(person4).start();
        new Thread(person5).start();

    }
}

class Person implements Runnable {

    private String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждёт...");

            // Попытка получить разрешение от семафора
            // метод acquire заблокирует этот поток, пока ресурс не будет доступен для нас
            callBox.acquire();

            System.out.println(name + " пользуется телефоном");

            Thread.sleep(2000);

            System.out.println(name + " завершил звонок");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Освобождение разрешения семафора
            callBox.release();
        }
    }
}
