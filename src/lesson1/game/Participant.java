package lesson1.game;

/**
 * test1
 * test2
 */

public abstract class Participant {

	private String name;
	private int age;

	public Participant(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**
	 * test3
	 * test4
	 */
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}