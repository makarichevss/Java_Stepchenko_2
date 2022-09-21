/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Billion {
    private static long value = 1_000_000_000;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureResults = new ArrayList<>();
        long valueDivBy10 = value / 10;

        for (int i = 0; i < 10; i++) {
            long from = valueDivBy10 * i + 1;
            long to = valueDivBy10 * (i + 1);
            PartialSum task = new PartialSum(from, to);
            Future<Long> futurePartSum = executor.submit(task);
            futureResults.add(futurePartSum);
        }
        for (Future<Long> futureResult : futureResults) {
            sum += futureResult.get();
        }
        executor.shutdown();
        System.out.println(sum);
    }
}

class PartialSum implements Callable {
    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() {
        for (long i = from; i <= to; i++) {
             localSum += i;
        }
        System.out.println("Sum from: " + from + " to " + to + " = " + localSum);
        return localSum;
    }
}
