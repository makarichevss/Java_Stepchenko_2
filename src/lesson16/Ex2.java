/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

public class Ex2 {
    public static void main(String[] args) {
//        new Thread(() -> System.out.println("Privet")).start();
        MyThread3 myThread2 = new MyThread3();
        myThread2.setName("my thread");
        myThread2.setPriority(8);
        System.out.println(Thread.currentThread().getName());
        System.out.println("Number of threads: " + myThread2.getName() +
                " Priority: " + myThread2.getPriority());
    }
}

class MyThread3 extends Thread {
    public void run() {
        System.out.println("Hi!");
    }
}