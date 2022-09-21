/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson9;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentInfo {

	void testStudent(ArrayList<Student> al, Predicate<Student> pr) {
		for (Student st : al) {
			if (pr.test(st))
				System.out.println(st);
		}
	}
}

class Test {

	public static void main(String[] args) {
		Student st1 = new Student("Vasya", 'm', 27, 7.2);
		Student st2 = new Student("Petya", 'm', 23, 5.1);
		Student st3 = new Student("Petya", 'm', 33, 5.9);
		ArrayList<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.forEach(str -> System.out.println(str));
		System.out.println("list = " + list);

		StudentInfo info = new StudentInfo();
		Predicate<Student> p1 = al -> al.age > 30;
		Predicate<Student> p2 = al -> al.avgGrade > 5.0;
		info.testStudent(list, p1.negate());

		info.testStudent(list, p -> p.age < 30);
		System.out.println("list = " + list);

		double res = avgSt(list, stud -> stud.avgGrade);
		System.out.println(res);
	}

	public ArrayList<Student> createStudent(Supplier<Student> supplier){
		ArrayList<Student> st5 = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			st5.add(supplier.get());
		}
		return st5;
	}

	private static double avgSt(ArrayList<Student> list, Function<Student, Double> avg) {
		double result = 0;
		for (Student student : list) {
			result += avg.apply(student);
		}
		result = result / list.size();
		return result;
	}
}
