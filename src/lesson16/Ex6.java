/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

public class Ex6 {

    static final Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

     void skypeCall() {
        synchronized (lock) {
        System.out.println("Skype call starts");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableMobileCall());
        Thread t2 = new Thread(new RunnableSkypeCall());
        t1.start();
        t2.start();
    }
}

class RunnableMobileCall implements Runnable {

    @Override
    public void run() {
        new Ex6().mobileCall();
    }
}

class RunnableSkypeCall implements Runnable {

    @Override
    public void run() {
        new Ex6().skypeCall();
    }
}
