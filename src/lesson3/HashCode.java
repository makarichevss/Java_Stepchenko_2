/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson3;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCode {
	public static void main(String[] args) {
		Map<Student, Double> map = new HashMap();
		Student st1 = new Student("Ivan", "Petrov", 12);
		Student st2 = new Student("Ivan", "Petrov", 18);
		map.put(st1, 7.5);
		map.put(st2, 9.1);
//		map.put(st3, 9.1);
		Student st3 = new Student("Ivan", "Petrov", 12);
		System.out.println("map = " + map);
		boolean res = map.containsKey(st3);
		System.out.println("res = " + res);
		System.out.println(st1.equals(st3));
		System.out.println(st1.hashCode());
		System.out.println(st3.hashCode());
	}
}

class Student {
	String name;
	String surname;
	int course;

	public Student(String name, String surname, int course) {
		this.name = name;
		this.surname = surname;
		this.course = course;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student)) return false;

		Student student = (Student) o;

		if (course != student.course) return false;
		if (!Objects.equals(name, student.name)) return false;
		return Objects.equals(surname, student.surname);
	}

//	@Override
//	public int hashCode() {
//		int result = name != null ? name.hashCode() : 0;
//		result = 31 * result + (surname != null ? surname.hashCode() : 0);
//		result = 31 * result + course;
//		return result;
//	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", course=" + course +
				'}';
	}
}
