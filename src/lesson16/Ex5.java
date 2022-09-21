/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

public class Ex5 {

    volatile static int count = 0;

    public static void increment() {
        synchronized (Ex5.class) {
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Impl2());
        Thread t2 = new Thread(new Impl2());
//        increment();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.print(count + " ");
    }
}

class Impl2 implements Runnable{

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 30; i++) {
                System.out.println("i = " + i);
            }
        }
    }
}