package lesson1;

import java.util.ArrayList;

public class Main6 {
	public static void main(String[] args) {
		var all1 = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			all1.add(i);
		}
		int a = GenMethod.getSecondElement(all1);
		System.out.println("a = " + a);

		ArrayList<String> all2 = new ArrayList<>();
		all2.add("1");
		all2.add("2");
		all2.add("3");
		String a2 = GenMethod.getSecondElement(all2);
		System.out.println("a = " + a2);
	}
}

class GenMethod{
	public static <T> T getSecondElement(ArrayList<T> al){
		return al.get(1);
	}

}
