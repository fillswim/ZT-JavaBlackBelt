package P08_MultiThreading.L78_1_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx1 {
    public static void main(String[] args) throws InterruptedException {
        // Создали threadPool на 5 потоков
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Создание threadPool на один поток
        ExecutorService executorServiceSingleton = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImpl());
        }

        // Закрытие ExecutorService
        executorService.shutdown();

        // ExecutorService завершится, или main будет ждать 5 секунд
        executorService.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("Main ends");
    }
}

class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}
