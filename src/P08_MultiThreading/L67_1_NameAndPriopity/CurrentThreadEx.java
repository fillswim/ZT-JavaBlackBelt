package P08_MultiThreading.L67_1_NameAndPriopity;

public class CurrentThreadEx implements Runnable {

    @Override
    public void run() {
        System.out.println("Method run. Thread name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new CurrentThreadEx());
        thread.start();

        System.out.println("Method main. Thread name = " + Thread.currentThread().getName());
    }
}
