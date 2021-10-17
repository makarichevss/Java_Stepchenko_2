package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main9 {
	public static void main(String[] args) {
		List<? super Number> list = new ArrayList<Object>();

		List<Double> list1 = new ArrayList<>();
		list1.add(3.14);
		list1.add(3.15);
		showList(list1);

		ArrayList<Double> ald = new ArrayList<>();
		ald.add(3.14);
		ald.add(3.15);
		System.out.println(sum(ald));
	}

	static void showList(List<?> list) {
		System.out.println("list = " + list);
	}

	public static double sum(ArrayList<? extends Number> al){
		double sum = 0;
		for (Number n : al) {
			sum += n.doubleValue();
		}
		return sum;
	}
}