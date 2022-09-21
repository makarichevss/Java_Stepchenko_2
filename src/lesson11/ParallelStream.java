/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson11;

import java.util.ArrayList;

public class ParallelStream {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(490);
        list.add(53);
        list.add(3);

        double div = list.parallelStream()
                .reduce((a, b) -> a / b)
                .get();
        System.out.println("сумма = " + div);
    }
}
