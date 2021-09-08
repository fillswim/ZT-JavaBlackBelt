package P08_MultiThreading.L70_1_Volatile;

public class VolatileExample extends Thread{

    volatile boolean b = true;

    public static void main(String[] args) throws InterruptedException {
        VolatileExample thread = new VolatileExample();
        thread.start();

        // Метод main спит 3 секунды
        Thread.sleep(3000);

        System.out.println("After 3 seconds it is time to wake up");
        thread.b = false;
        thread.join();

        System.out.println("End of program");

    }

    public void run() {

        long counter = 0;
        while (b) {
            counter++;
        }

        System.out.println("Loop is finished. Counter = " + counter);
    }
}
