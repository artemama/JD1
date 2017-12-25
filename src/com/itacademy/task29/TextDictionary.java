package com.itacademy.task29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextDictionary {

	public static void main(String[] args) {
		String text = "Язык программирования - это искусственный язык, созданный для передачи команд машинам, в частности компьютерам.\\n\"\r\n"
				+ "			+ \"Языки программирования используются для создания программ, которые контролируют поведение машин, и записи алгоритмов.\\n\"\r\n"
				+ "			+ \"Более строгое определение: язык программирования - это система обозначений для описания алгоритмов и структур данных.\\n\"\r\n"
				+ "			+ \"Язык программирования определяет набор лексических, синтаксических и семантических правил, задающих\\n\"\r\n"
				+ "			+ \"внешний вид программы и действия, которые выполняет исполнитель (компьютер) под ее управлением?\\n\"\r\n"
				+ "			+ \"Со времени создания первых программируемых машин было создано более двух с половиной тысяч языков программирования!\\n\"\r\n"
				+ "			+ \"Некоторыми языками умеет пользоваться только небольшое число их собственных разработчиков, другие становятся известны миллионам людей.\\n\"\r\n"
				+ "			+ \"Профессиональные программисты обычно применяют в своей работе несколько языков программирования.";

		String[] words = text.toLowerCase().split("[\\p{Punct}\\s]+");
		List<String> dictionary = new ArrayList<String>();
		for (String string : words) {
			dictionary.add(string);
		}
		System.out.println(dictionary.toString());

		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		for (int i = 0; i < dictionary.size(); i++) {

			String string = dictionary.get(i);
			if (hashMap.containsKey(string)) {
				hashMap.put(string, hashMap.get(string) + 1);
			} else {
				hashMap.put(string, 1);
			}
		}

		System.out.println(hashMap);
	}

}
