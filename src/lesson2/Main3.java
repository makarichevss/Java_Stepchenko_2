/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main3 {
	public static void main(String[] args) {
		String s = "madam1";
		List<Character> list = new LinkedList<>();
		for (char c : s.toCharArray()) {
			list.add(c);
		}
		ListIterator<Character> iterator = list.listIterator();
		ListIterator<Character> reverseIterator = list.listIterator(list.size());
		boolean isPalindrome = true;
		while (iterator.hasNext() && reverseIterator.hasPrevious()) {
			if (iterator.next() != reverseIterator.previous()) {
				isPalindrome = false;
				break;
			}
		}
		System.out.println("isPalindrome = " + isPalindrome);
	}
}
