/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService ss = Executors.newScheduledThreadPool(1);
        for (int i = 0; i < 10; i++) {
            ss.execute(new RunnableImpl2());
        }
        ss.schedule(new RunnableImpl2(),3, TimeUnit.SECONDS);
        ss.shutdown();
        ss.scheduleAtFixedRate(new RunnableImpl2(),3,1, TimeUnit.SECONDS);
        Thread.sleep(4000);
        ss.shutdown();
        ss.scheduleWithFixedDelay(new RunnableImpl2(), 3, 1, TimeUnit.SECONDS);
        Thread.sleep(4000);
        ss.shutdown();
    }
}

class RunnableImpl2 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
//        try {
//            Thread.sleep(4000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}
