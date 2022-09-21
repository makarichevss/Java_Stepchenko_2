/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrHashMapEx1 {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Vasya");
        map.put(2, "Petya");
        System.out.println(map);

        Runnable run = () -> {
            Iterator<Integer> it = map.keySet().iterator();
            while (it.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer value = it.next();
                System.out.println(value + ":" + map.get(value));
            }
        };

        Runnable run2 = () -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(3, "Sasha");
        };

        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
    }
}
