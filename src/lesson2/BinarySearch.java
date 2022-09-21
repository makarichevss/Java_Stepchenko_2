/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class BinarySearch {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(-3);
		list.add(3);
		list.add(10);
		list.add(7);
		Collections.sort(list);
		int idx = Collections.binarySearch(list, 7);
		System.out.println("idx = " + idx);

		int[] array = {-1, 4, 6, -2, 7, 4, 9};
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.binarySearch(array, 9));
	}
}

class Main2 {
	public static void main(String[] args) {
		Student2 st1 = new Student2("Ivan", 12);
		Student2 st2 = new Student2("Ivan", 13);
		Student2 st3 = new Student2("Ivan", 14);
		LinkedList<Student2> studentList = new LinkedList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
		System.out.println("studentList = " + studentList);
	}
}

class Student3 {
	public String name;
	public int age;

	public Student3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student2{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
