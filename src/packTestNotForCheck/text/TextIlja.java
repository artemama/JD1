package packTestNotForCheck.text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextIlja {

	public static void main(String[] args) {
		String str = "Словарь (dictionary) – это структура данных, позволяющая хранить информацию в виде комбинации “ключ” – “значение” (key – value). То есть, с каким либо значением (value) мы ассоциируем ключ (это может быть: id, термин и т. д.) и эту пару заносим в словарь. Обращение к элементу словаря, удаление, поиск по словарю производится по ключу. С помощью данной структуры, например, удобно организовать телефонный справочник, где имени (key) соответствует номер телефона (value).";

		String[] words = str.toLowerCase().split("(\\W|\\d)+");
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
