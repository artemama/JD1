package workClassPVTnotForCheck.class15desemb;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterat {

	public static void main(String[] args) {
		Set<String> words = new HashSet<String>();
		words.add("One");
		words.add("Two");
		words.add("Three");

		Iterator<String> iterator = words.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}

}
