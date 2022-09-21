/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson6;

import lesson1.game.Student;

import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<Double, Student> treeMap = new TreeMap<>();
		Student st1 = new Student("Ivan",25);
		Student st2 = new Student("Petr",26);
		treeMap.put(2.3, st1);
		treeMap.put(2.1, st2);
		System.out.println("treeMap = " + treeMap);
		System.out.println("treeMap = " + treeMap.headMap(2.4));
	}
}
