/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson13;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i = sc.nextInt();
		System.out.println("Number = " + i);
		sc.close();
	}
}
