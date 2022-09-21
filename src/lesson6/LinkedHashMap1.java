/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson6;

import lesson1.game.Student;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
		Student st1 = new Student("Ivan",25);
		Student st2 = new Student("Petr",26);
		linkedHashMap.put(2.3, st1);
		linkedHashMap.put(2.1, st2);
		System.out.println("linkedHashMap = " + linkedHashMap);
		linkedHashMap.get(2.1);
		linkedHashMap.get(2.3);
		System.out.println("linkedHashMap = " + linkedHashMap);
	}
}
