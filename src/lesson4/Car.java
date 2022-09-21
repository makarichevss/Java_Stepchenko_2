/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson4;

public class Car {

	String color;
	int doorNumber;
	Engine engine;
	private static int a;

	public Car(String color, int doorNumber, Engine engine) {
		this.color = color;
		this.doorNumber = doorNumber;
		this.engine = engine;
	}

	void method() {
		Engine engine1 = new Engine(300);
		System.out.println(engine1.horsepower);
	}

	@Override
	public String toString() {
		return "Car{" +
				"color='" + color + '\'' +
				", doorNumber=" + doorNumber +
				", engine=" + engine +
				'}';
	}

	public static class Engine {
		private int horsepower;
		static int engineCount;

		public Engine(int horsepower) {
			System.out.println(a);
			this.horsepower = horsepower;
			engineCount++;
		}

		@Override
		public String toString() {
			return "Engine{" +
					"horsepower=" + horsepower +
					'}';
		}
	}
}

class Test {
	public static void main(String[] args) {
		Car.Engine engine = new Car.Engine(100);
		System.out.println("engine = " + engine);
		Car car = new Car("red", 2, engine);
		System.out.println("car = " + car);
	}
}