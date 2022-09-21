/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson12;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		Today td = new Today(WeekDays.MONDAY);
		td.daysInfo();
		WeekDays w = WeekDays.MONDAY;
		WeekDays[] wd = WeekDays.values();
		System.out.println(Arrays.toString(wd));
	}
}

enum WeekDays {
	MONDAY("nice"), TUESDAY("nice"), SATURDAY ("awesome"), SUNDAY("awesome");

	private String mood;

	WeekDays(String mood) {
		this.mood = mood;
	}
}

class Today {


	WeekDays weekDays;

	public Today(WeekDays weekDays) {
		this.weekDays = weekDays;
	}

	void daysInfo() {
		switch (weekDays) {
			case MONDAY, TUESDAY -> System.out.println("Work");
			case SATURDAY, SUNDAY -> System.out.println("Rest");
		}
	}
}
