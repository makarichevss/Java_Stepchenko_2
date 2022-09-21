/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson4;

class Test2 {

	public static class Car2 {
		private String color;
		int doorNumber;
		Engine engine;

		public Car2(String color, int doorNumber) {
			Engine engine = new Engine(260);
			System.out.println(engine.horsepower);
			this.color = color;
			this.doorNumber = doorNumber;
		}

		public void setEngine(Engine engine) {
			this.engine = engine;
		}

		@Override
		public String toString() {
			return "Car{" +
					"color='" + color + '\'' +
					", doorNumber=" + doorNumber +
					", engine=" + engine +
					'}';
		}

		public class Engine {
			private int horsepower;

			public Engine(int horsepower) {
				this.horsepower = horsepower;
				System.out.println(color);
			}

			@Override
			public String toString() {
				return "Engine{" +
						"horsepower=" + horsepower +
						'}';
			}
		}
	}

	public static void main(String[] args) {
		Car2 car = new Car2("black",4);
		Car2.Engine engine = car.new Engine(190);
		car.setEngine(engine);
		System.out.println("car = " + car);
	}
}