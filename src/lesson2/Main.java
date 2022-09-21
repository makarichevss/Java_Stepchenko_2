/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson2;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Student2 st1 = new Student2("Ivan", 12);
		Student2 st2 = new Student2("Ivan", 13);
		Student2 st3 = new Student2("Ivan", 14);
		LinkedList<Student2> studentlist = new LinkedList<>();
		studentlist.add(st1);
		studentlist.add(st2);
		studentlist.add(st3);
		System.out.println("studentlist = " + studentlist);
	}
}

class Student2 {
	public String name;
	public int age;

	public Student2(String name, int age) {
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


