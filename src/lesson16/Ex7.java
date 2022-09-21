/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ex7 {

    public static void main(String[] args) {
        Call call = new Call();

        Thread t1 = new Thread(call::mobileCall) {};
        Thread t2 = new Thread(call::skypeCall) {};
        t1.start();
        t2.start();
        boolean a = true;
    }
}

class Call {

    private final Lock lock = new ReentrantLock();

    void mobileCall(){
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(2000);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    void skypeCall(){
        lock.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(2000);
            System.out.println("Skype call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}
