package P08_MultiThreading.L68_1_SleepAndJoin;

public class ThreadJoin2 {
    public static void main(String[] args) {
        System.out.println("Method main begins");

        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());

        try {
            // Метод main будет ждать, пока не завершится поток thread
            // или не пройдет 1,5 секунды
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(thread.getState());

        System.out.println("Method main ends");
    }
}

class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("The work begins");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The work ends");
    }
}