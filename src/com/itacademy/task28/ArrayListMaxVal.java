package com.itacademy.task28;

import java.util.*;

public class ArrayListMaxVal {

	public static void main(String[] args) {
		int arrSize = 10;
		ArrayList<Integer> marks = new ArrayList<Integer>(arrSize);
		for (int i = 0; i < arrSize; i++) {
			int x = (int) (Math.random() * 10 + 1);
			marks.add(x);

		}
		System.out.println(marks);
		System.out.println("Maximum mark is:" + Collections.max(marks));

		/*
		 * int max = 0; for (int i = 0; i < marks.size(); i++) { if (marks.get(i) >=
		 * max) { max = marks.get(i);
		 */
	}

	// System.out.println("Maximum mark is:" + max);

}
