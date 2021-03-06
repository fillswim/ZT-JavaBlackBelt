package P08_MultiThreading.L80_1_CollableAndFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorial {

    static int factorialResult = 0;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial1 factorial = new Factorial1(5);

        executorService.execute(factorial);

        executorService.shutdown();

        // просим поток main подождать
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(factorialResult);
    }
}

class Factorial1 implements Runnable {
    private int f;

    public Factorial1(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("Вы ввели неверное число");
            return;
        }

        int result = 1;

        for (int i = 1; i <= f; i++) {
            result *= i;
        }

        RunnableFactorial.factorialResult = result;
    }
}