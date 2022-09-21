/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

public class Ex3 extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Ex3 thread = new Ex3();
        thread.start();
        Thread.sleep(3000);
        System.out.println("Wake up!");
        thread.b = false;
        thread.join();
        System.out.println("End");
    }
}
