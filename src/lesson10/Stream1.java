/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("bb");
        list.add("cccc");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(53);
        list4.add(325);

        List<Integer> list2 = list.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println("list2 = " + list2);

        Student st1 = new Student("John", 'm', 42, 6.2);
        Student st2 = new Student("Jane", 'f', 23, 4.1);
        Student st3 = new Student("Mark", 'm', 33, 8.9);
        List<Student> list3 = new ArrayList<>();
        list3.add(st1);
        list3.add(st2);
        list3.add(st3);

        list3 = list3.stream()
                .filter(l -> l.getAge() > 20 && l.getAvgGrade() > 2.0)
                .collect(Collectors.toList());
        System.out.println("list4 = " + list3);

        int[] array = {1, 5, 2, 18, 27};
        Arrays.stream(array).forEach(Stream1::myMethod);

        String list5 = list.stream().reduce("as", String::concat);
        System.out.println("list5 = " + list5);

        Optional<Integer> o = list4.stream().reduce(Integer::sum);
        o.ifPresent(i -> System.out.println("o = " + i));

        array = Arrays.stream(array).sorted().toArray();
        System.out.println("array = " + Arrays.toString(array));

        list3 = list3.stream().sorted(Comparator.comparing(x -> x.name)).collect(Collectors.toList());
        System.out.println("list3 = " + list3);

        List<Integer> result = list3.stream().mapToInt(Student::getAge).boxed().collect(Collectors.toList());
        System.out.println("result = " + result);

//		int result = Arrays.stream(array)
//				.filter(e -> e % 2 == 1)
//				.map(e -> {
//					if(e % 3 == 0)
//						e /= 3;
//					return e;
//				})
//				.reduce(Integer::sum)
//				.getAsInt();
//		System.out.println(result);

        List<Student> list7 = list3.stream().filter(e -> e.getAge() > 30).limit(2).collect(Collectors.toList());
        System.out.println("list7 = " + list7);


//		Student st4 = list3.stream()
//				.map(e -> {
//					e.setName(e.getName().toUpperCase());
//					return e;
//				})
//				.filter(e -> e.getSex() == 'm')
//				.min(Comparator.comparingInt(Student::getAge))
//				.get();
//		System.out.println(st4);

//		list3.stream()
//				.map(e -> {
//					e.setName(e.getName().toUpperCase());
//					return e;
//				})
//				.filter(e -> e.getSex() == 'f')
//				.sorted(Comparator.comparingInt(Student::getAge))
//				.forEach(System.out::println);

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 2, 5, 3);
        Stream<Integer> stream2 = Stream.of(3, 4);
//		Stream.concat(stream1, stream2).forEach(System.out::print);
//		stream1.distinct().forEach(System.out::print);
//		System.out.println(stream1.distinct().count());
//		System.out.println(stream1.distinct().peek(System.out::println).count());
        System.out.println(stream1.distinct().peek(System.out::println).count());

        List<Student> list6 = new ArrayList<>();
        list6.add(st1);
        list6.add(st2);
        list6.add(st3);

        Map<Boolean, List<Student>> map = list6.stream()
                .collect(Collectors.partitioningBy(e -> e.getAvgGrade() > 5.0));

//		Map<Character, List<Student>> map = list6.stream().map(e -> {
//					e.setName(e.getName().toUpperCase());
//					return e;
//				})
//				.collect(Collectors.groupingBy(Student::getSex));
//
        for (Map.Entry<Boolean, List<Student>> e : map.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    public static void myMethod(int a) {
        a += 5;
        System.out.println(a);
    }
}
