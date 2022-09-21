/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson10;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getAvgGrade() {
		return avgGrade;
	}

	public void setAvgGrade(double avgGrade) {
		this.avgGrade = avgGrade;
	}
}
