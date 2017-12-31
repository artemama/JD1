package com.itacademy.task27;

import java.util.ArrayList;
import java.util.HashSet;

//Вариант без использования Set и HeshSet
public class ArrayListDelDubl {
	public static void main(String[] args) {
		int arrLength = 20;
		ArrayList<Integer> test = new ArrayList<Integer>(arrLength);
		for (int i = 0; i < arrLength; i++) {
			int x = (int) (Math.random() * 10);
			test.add(x);
		}
		System.out.println(test);

		ArrayList<Integer> dellDuble = new ArrayList<>(new HashSet<Integer>(test));

		/*
		 * for (int i = 0; i < test.size(); i++) { for (int j = i + 1; j < test.size();
		 * j++) { if (test.get(i).equals(test.get(j))) { test.remove(j); j--; } } }
		 */
		System.out.println("After removing duplicatea:" + dellDuble);

	}
}
