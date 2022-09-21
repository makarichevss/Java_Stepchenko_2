/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson14;

public class Employee {
	public int id;
	private String department;
	private double salary = 1000;

	public Employee() {
	}

	public Employee(int id, String department) {
		this.id = id;
		this.department = department;
	}

	public Employee(int id, String department, double salary) {
		this.id = id;
		this.department = department;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private void changeDepartment(String department) {
		this.department = department;
		System.out.println("New dpt: " + department);
	}

	public void increaseSalary() {
		salary *= 2;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", department='" + department + '\'' +
				", salary=" + salary +
				'}';
	}
}
