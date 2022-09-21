/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialRes;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial = new Factorial2(5);
        Future<Integer> future = executorService.submit(factorial);
        try {
            System.out.println(future.isDone());
            System.out.println("Get result:");
            factorialRes = future.get();
            System.out.println("Got the result:");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialRes);
    }
}

class Factorial2 implements Callable {
    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Wrong number");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}
