package P08_MultiThreading.L80_1_CollableAndFuture;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial = new Factorial2(5);

        // Добавление thread в threadPool
        Future<Integer> future = executorService.submit(factorial);

        try {
            System.out.println("Поток завершен: " + future.isDone());

            System.out.println("Хотим получить результат");
            factorialResult = future.get();
            System.out.println("Получили результат");

            System.out.println("Поток завершен: " + future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }finally {
            executorService.shutdown();
        }

        System.out.println(factorialResult);

    }
}

class Factorial2 implements Callable<Integer> {
    private int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {

        if (f <= 0) {
            throw new Exception("Вы ввели неверное число");
        }

        int result = 1;

        for (int i = 1; i <= f; i++) {
            result *= i;

            Thread.sleep(1000);
        }

        return result;
    }
}


