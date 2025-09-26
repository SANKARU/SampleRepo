package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {

		Set<String> m = new HashSet<String>();

		m.add("Kerala");
		m.add("Karnataka");
		m.add("Delhi");
		m.add("Punjab");
		System.out.println(m);

		// Iterator object creation--:>for iterator interface
		// it will print one by one
		Iterator it = m.iterator();

		// hasNext-->check whether next element is present or not
		while (it.hasNext()) {
			// next is used to print the next element
			System.out.println(it.next());
		}
		// remove()-->Will remove the last element from the last
		it.remove();
		System.out.println(m);

	}

}
