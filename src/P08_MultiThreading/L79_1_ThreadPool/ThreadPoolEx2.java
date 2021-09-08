package P08_MultiThreading.L79_1_ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);

//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunnableImpl());
//        }

        // Задание начнет выполняться через 3 секунды
//        scheduledExecutorService.schedule(new RunnableImpl(), 3, TimeUnit.SECONDS);

        // Задает периодичность выполнения задачи
        // Впервые она начнет выполняться через 3 секунды, и потом будет выполняться с периодичностью в 1 секунду
//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl(), 3, 1, TimeUnit.SECONDS);

        // Задает периодичность выполнения задачи
        // Впервые она начнет выполняться через 3 секунды,
        // и потом будет выполняться с периодичностью в 1 секунду после окончания каждого задания
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl(), 3, 1, TimeUnit.SECONDS);

        // main спит 10 секунд, после чего закрывает scheduledExecutorService
        Thread.sleep(10000);
        scheduledExecutorService.shutdown();



    }
}

class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}
