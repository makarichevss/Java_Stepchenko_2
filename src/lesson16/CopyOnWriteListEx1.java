/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteListEx1 {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Vasya");
        list.add("Petya");
        System.out.println(list);

        Runnable run = () -> {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(it.next());
            }
        };

        Runnable run2 = () -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.remove(1);
            list.add("Pasha");
        };

        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(list);
    }
}
