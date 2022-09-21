/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

import java.util.concurrent.Semaphore;

public class SemaphoreEx1 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        new Person("Ivan", semaphore);
        new Person("Petr", semaphore);
        new Person("Vasya", semaphore);
    }
}

class Person extends Thread {
    String name;
    private Semaphore semaphore;

    public Person(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is waiting...");
            semaphore.acquire();
            System.out.println(name + " is calling");
            sleep(2000);
            System.out.println(name + " is finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
