/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson14;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		Class employeeClass = Class.forName("lesson14.Employee");
//		Object o = employeeClass.newInstance();

		Constructor<Employee> constructor1 = employeeClass.getConstructor();
		Employee o1 = constructor1.newInstance();
		Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, double.class);
		Object o2 = constructor2.newInstance(5, "Ivan", 2.6);
		System.out.println("o2 = " + o2);

		Method method = employeeClass.getMethod("setSalary", double.class);
		method.invoke(o2, 2500.0);
		System.out.println("o2 = " + o2);
	}
}
