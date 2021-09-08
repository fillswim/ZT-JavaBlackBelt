package P08_MultiThreading.L83_1_CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    // Задается количество операций, после которых начинается выполнение потоков
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    public static void main(String[] args) throws InterruptedException {

        new Thread(new Friend("Zaur", countDownLatch)).start();
        new Thread(new Friend("Oleg", countDownLatch)).start();
        new Thread(new Friend("Mary", countDownLatch)).start();
        new Thread(new Friend("Nick", countDownLatch)).start();
        new Thread(new Friend("Mike", countDownLatch)).start();

        marketStaffIsOnPlace();
        everyThingIsReady();
        openMarket();
    }

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");

        // Уменьшение счетчика операций на 1 операцию
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void everyThingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready, so let's open market");

        // Уменьшение счетчика операций на 1 операцию
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");

        // Уменьшение счетчика операций на 1 операцию
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }
}

class Friend implements Runnable {

    private String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        // Пока счетчик > 0, поток заблокирован
        // Поток начнет работать, когда счетчик = 0
        try {
            countDownLatch.await();
            System.out.println(name + " приступил к закупкам");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
