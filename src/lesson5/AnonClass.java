/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson5;

public class AnonClass {
	public static void main(String[] args) {
		Math2 m = (x, y) -> x - y;
		System.out.println(m.doOperation(8,5));
		System.out.println(m.doOperation(8,5));
	}
}

interface Math2 {
	int doOperation(int x, int y);
}