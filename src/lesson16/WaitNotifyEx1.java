/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

public class WaitNotifyEx1 {

    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread t1 = new Thread(consumer);
        Thread t2 = new Thread(producer);
        t1.start();
        t2.start();
    }
}

class Market {
    private int breadCount = 0;

    public synchronized void putBread() {
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("1 bread was added");
        System.out.println("Bread added: " + breadCount);
        notify();
    }

    public synchronized void getBread() {
        while (breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("1 bread was bought");
        System.out.println("Bread left: " + breadCount);
        notify();
    }
}

class Producer implements Runnable {

    Market market;

    Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {

    Market market;

    Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}
