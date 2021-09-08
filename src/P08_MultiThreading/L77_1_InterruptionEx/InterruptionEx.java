package P08_MultiThreading.L77_1_InterruptionEx;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");

        InterruptedThread thread = new InterruptedThread();
        thread.start();

        // Прерываем поток через 2 секунды
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();
        System.out.println("Main ends");
    }
}

class InterruptedThread extends Thread {

    private double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i < 1_000_000_000; i++) {

            if (isInterrupted()) {
                System.out.println("Поток хотят прервать");
                System.out.println("Завершаем работу потока");
                return;
            }

            sqrtSum += Math.sqrt(i);
            try {
                sleep(10_000);
            } catch (InterruptedException e) {
                System.out.println("Поток хотят прервать во время сна. " +
                        "Давайте завершим его работу");
                System.out.println(sqrtSum);
                return;
            }
        }

        System.out.println(sqrtSum);
    }
}
