package lesson1;

import java.util.*;

public class Main2 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee employee1 = new Employee(100,"Ivan1","Petrov1",3000);
		Employee employee2 = new Employee(300,"Ivan3","Petrov3",5000);
		Employee employee3 = new Employee(200,"Ivan2","Petrov2",4000);
//		Employee[] e =  new Employee[] { employee1, employee2, employee3};
//		Arrays.sort(e);
//		System.out.println(Arrays.toString(e));
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		System.out.println(list);
		list.sort(new SalaryComparator());
		System.out.println(list);
	}
}

class Employee implements Comparable<Employee> {
	int id;
	String name;
	String surname;
	int salary;

	public Employee(int id, String name, String surname, int salary) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", salary=" + salary +
				'}';
	}

	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;
	}
}

class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return Integer.compare(emp1.id, emp2.id);
	}
}

class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.name.compareTo(emp2.name);
	}
}

class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.salary - emp2.salary;
	}
}

