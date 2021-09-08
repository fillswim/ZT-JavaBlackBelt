package P08_MultiThreading.L68_1_SleepAndJoin;

public class ThreadSleep {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Run!");
    }
}
