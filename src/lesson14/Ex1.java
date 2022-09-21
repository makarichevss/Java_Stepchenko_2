/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
//		Class employeeClass2 = Employee.class;
//		Employee employee = new Employee();
//		Class employeeClass3 = employee.getClass();

		Class employeeClass = Class.forName("lesson14.Employee");
		Field someField = employeeClass.getField("id");
		System.out.println("Type: " + someField.getType());
		System.out.println("***");

		Field[] field1 = employeeClass.getFields();
		for (Field field : field1) {
			System.out.println("Type: " + field.getName() + " = " + field.getType());
		}

		System.out.println("***");
		Field[] field2 = employeeClass.getDeclaredFields();
		for (Field field : field2) {
			System.out.println("Type: " + field.getName() + " = " + field.getType());
		}

		System.out.println("***");
		Method method1 = employeeClass.getMethod("increaseSalary");
		System.out.println("Return type: " + method1.getReturnType()
				+ " parameters: " + Arrays.toString(method1.getParameterTypes()));

		System.out.println("***");
		Method method2 = employeeClass.getMethod("setSalary", double.class);
		System.out.println("Return type: " + method2.getReturnType()
				+ " parameters: " + Arrays.toString(method2.getParameterTypes()));
		
		System.out.println("***");
		Method[] allMethods = employeeClass.getMethods();
		for (Method method : allMethods) {
			if (Modifier.isPublic(method.getModifiers())) {
				System.out.println("Name of method: " + method.getName()
						+ " Return type: " + method.getReturnType()
						+ " parameters: " + Arrays.toString(method.getParameterTypes()));
			}
		}

		System.out.println("***");
		Constructor constructor1 = employeeClass.getConstructor();
		System.out.println("Parameters: " + constructor1.getParameterCount()
				+ " parameters: " + Arrays.toString(constructor1.getParameterTypes()));

		System.out.println("***");
		Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, double.class);
		System.out.println("Parameters: " + constructor2.getParameterCount()
				+ " parameters: " + Arrays.toString(constructor2.getParameterTypes()));

		System.out.println("***");
		Constructor[] constructor3 = employeeClass.getConstructors();
		for (Constructor constructor : constructor3) {
			if (Modifier.isPublic(constructor.getModifiers())) {
				System.out.println("Name of method: " + constructor.getName()
						+ " Return type: " + constructor.getParameterCount()
						+ " parameters: " + Arrays.toString(constructor.getParameterTypes()));
			}
		}
	}
}
