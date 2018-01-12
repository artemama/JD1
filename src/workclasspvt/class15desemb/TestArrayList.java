package workclasspvt.class15desemb;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("one");
		words.add("two");
		words.add("Three");
		System.out.println("First word is : " + words.get(0));
		words.remove(0);
		System.out.println("First word after remive is : " + words.get(0));

	}

}
