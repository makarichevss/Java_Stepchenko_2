/*
 * Copyright (c) 2022. By Sergey Makarichev
 */

import java.util.*;

public class TestClass4 {

    public static void main(String[] args) {
        Map<Integer, Integer> polyn1 = Map.of(
                0, 5,
                1, 3,
                3, 2,
                5, 4,
                6, 7
        );
        Map<Integer, Integer> polyn2 = Map.of(
                0, 5,
                3, 4,
                5, 5,
                6, 1
        );
        Map<Integer, Integer> sum = sum(polyn1, polyn2);
//        System.out.println(sum);
        System.out.println(convert(sum));
    }

    public static String convert(Map<Integer, Integer> map) {
        Map<Integer, Integer> result = new TreeMap<>(Comparator.reverseOrder());
        result.putAll(map);
        List<String> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            String value = entry.getKey() == 0
                    ? String.valueOf(entry.getValue())
                    : entry.getValue() + "x^" + entry.getKey();
            list.add(value);
        }
        return String.join(" ", list);
    }

    public static Map<Integer, Integer> sum(Map<Integer, Integer> polyn1,
                                            Map<Integer, Integer> polyn2) {
        Map<Integer, Integer> result = new HashMap<>(polyn1);
        for (Map.Entry<Integer, Integer> entry : polyn2.entrySet()) {
            Integer value = result.getOrDefault(entry.getKey(), 0);
            result.put(entry.getKey(), value + entry.getValue());
        }
        return result;
    }
}
