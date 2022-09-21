/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson9;

import java.util.ArrayList;

public class RemoveIf {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.removeIf(el -> el.equals("b"));
		System.out.println("list = " + list);
	}
}
