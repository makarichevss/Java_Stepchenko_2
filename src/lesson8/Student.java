/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson8;

public class Student {
	String name;
	char sex;
	int age;
	double avgGrade;

	public Student(String name, char sex, int age, double avgGrade) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.avgGrade = avgGrade;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", sex=" + sex +
				", age=" + age +
				", avgGrade=" + avgGrade +
				'}';
	}
}
