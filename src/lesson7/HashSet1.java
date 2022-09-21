/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson7;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Jim");
		set.add("Jack");
		set.add("Vasya");
		set.add("Mike");
		System.out.println("hs = " + set);

		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(4);
		hs.add(2);
		hs.add(5);
		System.out.println("hs = " + hs);
	}
}
