/*
 * Copyright (c) 2022. By Sergey Makarichev
 */

import java.util.HashSet;
import java.util.List;

public class TestClass2 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 5, 5, 6, 8, 10, 11);
        int result = countUnique(list);
        System.out.println(result);
    }

    private static int countUnique(List<Integer> list) {
        return (new HashSet<>(list)).size();
    }
}
