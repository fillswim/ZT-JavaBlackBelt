package P08_MultiThreading.L73_2_WaitNotifyObject;

public class WaitNotifyExample2 {
    public static void main(String[] args) {

        Market market = new Market();
        Baker baker = new Baker(market);
        Consumer consumer = new Consumer(market);

        Thread thread1 = new Thread(baker);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }
}

class Market {

    // Количество булочек в магазине
    private int breadCount;

    // Объект для синхронизации потоков
    private final Object lock = new Object();

    // Покупка булочки
    // Синхронизация по объекту lock
    public void getBread() {

        // Синхронизация по lock
        synchronized (lock) {
            while (breadCount < 1) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            breadCount--;
            System.out.println("Потребитель купил 1 булочку");
            System.out.println("Количество булочек в магазине = " + breadCount);

            // Оповещение производителя об уменьшении количества булочек в магазине
            // и производитель может начинать производить хлеб
            lock.notify();
        }
    }

    // Метод поставки хлеба пекарем
    // Синхронизация по объекту lock
    public void putBread() {

        // Синхронизация по lock
        synchronized (lock) {
            while (breadCount >= 5) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            breadCount++;
            System.out.println("Пекарь выпек булочку и выложил её на витрину");
            System.out.println("Количество булочек в магазине: " + breadCount);

            // Извещение покупателя о появлении булочек и возможности их покупки
            lock.notify();
        }
    }
}

class Baker implements Runnable {
    private Market market;

    public Baker(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        //Пекарь выпекает 10 булочек для магазина в день
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    private Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        // Покупатель может купить 10 булочек в магазине в день

        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}
