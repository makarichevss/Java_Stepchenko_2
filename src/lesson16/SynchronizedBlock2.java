/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

public class SynchronizedBlock2 {

    volatile static int count = 0;

    public static void increment() {
        synchronized (SynchronizedBlock2.class) {
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Impl3());
        Thread t2 = new Thread(new Impl3());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }
}

class Impl3 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            SynchronizedBlock2.increment();
        }
    }
}