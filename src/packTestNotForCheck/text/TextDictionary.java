package packTestNotForCheck.text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextDictionary {

	public static void main(String[] args) {
		String str = "Горю, от пламени не тает лед,\r\n" + "И льдом я погасить не в силах пламень.\r\n"
				+ "Льду мертвому живой враждебен пламень,\r\n" + "Весь пламень я живой, и мертвый лед.";

		String[] words = str.toLowerCase().split("[\\p{Punct}\\s]+");
		List<String> dictionary = new ArrayList<String>();
		for (String string : words) {
			dictionary.add(string);
		}
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		for (int i = 0; i < dictionary.size(); i++) {

			if (hashMap.containsKey(dictionary.get(i))) {
				hashMap.put(dictionary.get(i), hashMap.get(dictionary.get(i)) + 1);
			} else {
				hashMap.put(dictionary.get(i), 1);
			}
		}
		System.out.println(hashMap);
	}

}
