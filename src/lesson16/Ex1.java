/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

public class Ex1 {
    public static void main(String[] args) {
//        MyThread1 myThread1 = new MyThread1();
        Thread myThread1 = new Thread(new MyThread1());
        Thread myThread2 = new Thread(new MyThread2());
        myThread1.start();
        myThread2.start();
    }
}

class MyThread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("i = " + i);
        }
    }
}