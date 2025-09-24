package collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {

		List<String> L = new ArrayList<String>();

		// Add Method
		L.add("Apple");
		L.add("Orange");
		L.add("Mango");
		L.add("Apple");

		System.out.println(L);

		// Get Method

		System.out.println(L.get(2));

		// Set Method
		L.set(1, "Grapes"); // first declare set then print
		System.out.println(L);

		// IndexOf Method

		System.out.println(L.indexOf("Apple"));

		// Last IndexOf

		System.out.println(L.lastIndexOf("Apple"));

		// remove
		L.remove(2);
		System.out.println(L);

		// Contains
		System.out.println(L.contains("Grapes"));

		// isEmpty

		System.out.println(L.isEmpty());

		// Size

		System.out.println(L.size());
	}

}
