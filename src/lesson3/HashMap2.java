package lesson3;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class HashMap2 {

	public static void main(String[] args)
	{
		// create a hashmap instance
		HashMap<Integer, Integer> l = new HashMap<>(12,0.75f);

		// add mappings
		l.put(2, 5);
		l.put(3, 6);
		l.put(4, 1);
		l.put(8, 2);
		System.out.println("l = " + l);
		// list of keys
		List<Integer> list = new LinkedList<>(l.keySet());

		// list of values
		List<Integer> listOfValue
				= new LinkedList<>(l.values());

		// print the list
		System.out.println("LinkedList of key-> " + list);
		System.out.println("LinkedList of values-> "
				+ listOfValue);
	}
}
