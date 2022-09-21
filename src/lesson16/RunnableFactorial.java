/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

import java.util.concurrent.*;

public class RunnableFactorial {
    static int factorialRes;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
//        executorService.execute(factorial);
        Future future = executorService.submit(factorial);
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(future.get());
        System.out.println(factorialRes);
    }
}

class Factorial implements Runnable {
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("Wrong number");
            return;
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        RunnableFactorial.factorialRes = result;
    }
}
