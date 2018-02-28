package mine.collections;

import java.util.ArrayList;
import java.util.List;

public class ListInMassive {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("S");
		list.add("dd");
		
		String[] strArray = list.toArray(new String[list.size()]);
		// или
		Object[] objArray = list.toArray();
	}

}
