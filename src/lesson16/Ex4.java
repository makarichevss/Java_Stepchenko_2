/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

public class Ex4 {

    static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Impl1 runnable = new Impl1();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.print(count + " ");
    }
}

class Impl1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 3000; i++) {
            System.out.println("i = " + i);
        }
    }
}