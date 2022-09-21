/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx1 {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaff() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Stuff is at work");
        countDownLatch.countDown();
        System.out.println("latch = " + countDownLatch.getCount());
    }

    private static void isReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready to open");
        countDownLatch.countDown();
        System.out.println("latch = " + countDownLatch.getCount());
    }

    private static void isOpen() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is open");
        countDownLatch.countDown();
        System.out.println("latch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Ivan", countDownLatch);
        new Friend("Petr", countDownLatch);
        new Friend("Vasya", countDownLatch);

        marketStaff();
        isReady();
        isOpen();
    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " is shopping");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}