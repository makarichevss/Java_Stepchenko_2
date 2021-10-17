package lesson1;

public class Main5 {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("Hi!", 20);
		System.out.println("pair = " + pair.getValue1() + " " + pair.getValue2());
	}
}

class Pair<V1, V2>{
	private V1 value1;
	private V2 value2;

	public Pair(V1 value1, V2 value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	public V1 getValue1() {
		return value1;
	}

	public V2 getValue2() {
		return value2;
	}
}

class OtherPair<V>{
	private V value1;
	private V value2;

	public V abc (V value) {
		return value;
	}

	public OtherPair(V value1, V value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	public V getValue1() {
		return value1;
	}

	public V getValue2() {
		return value2;
	}
}

