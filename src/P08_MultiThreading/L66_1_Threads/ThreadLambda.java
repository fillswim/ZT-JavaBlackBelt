package P08_MultiThreading.L66_1_Threads;

public class ThreadLambda {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("A");
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("B");
            }
        }).start();

    }
}
